package dao;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import model.Case;
import org.bson.Document;
import org.bson.conversions.Bson;


import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.*;

public class CaseDB {

        Case newsCase = new Case();

        //connecting to the server
        MongoClient mongoClient = new MongoClient("localhost", 27017);

        //creating database if it doesn't exist
        MongoDatabase getDB = mongoClient.getDatabase("userDetails");

        //creating a collection for court users cases and info
        MongoCollection<Document> courtCases = getDB.getCollection("courtCases");


    public final Document toDocument(Case newCase) {
        return new Document("claimantName", newCase.getClaimantName()).
                append("claimantSurname", newCase.getClaimantSurname()).
                append("claimantTradingName", newCase.getClaimantTradingName()).
                append("claimantOrganisationType", newCase.getClaimantOrganisationType()).
                append("claimantPhysicalAddress", newCase.getClaimantAddress()).
                append("claimantEmailAddress", newCase.getClaimantEmailAddress()).
                append("clientName", newCase.getClientName()).
                append("clientSurname", newCase.getClientSurname()).
                append("clientTradingName", newCase.getClientTradingName()).
                append("clientOrganisationType", newCase.getClientOrganisationType()).
                append("defendantName", newCase.getDefendantName()).
                append("defendantSurname", newCase.getDefendantSurname()).
                append("defendantTradingName", newCase.getDefendantTradingName()).
                append("defendantOrganisationType", newCase.getDefendantOrganisationType()).
                append("defendantAddress", newCase.getDefendantAddress()).
                append("defendantLGA", newCase.getDefendantLGA()).
                append("defendantEmail", newCase.getDefendantEmail()).
                append("briefDescription", newCase.getBriefDescription()).
                append("status", "Pending");
    }

    public void addCaseToCollection(Case newCase) {
            courtCases.insertOne(toDocument(newCase));
        }


    public List<Case> getRegistrarCases() {

        FindIterable<Document> findIterable = courtCases.find(eq("status", "Pending")).
                projection(fields(include("claimantName","defendantName", "briefDescription"), excludeId()));

        String claimantName = null;
        String defendantName = null;
        String briefDescription = null;

        List<Case> caseList = new ArrayList<>();

        for (Document c: findIterable){
            claimantName = c.getString("claimantName");
            defendantName = c.getString("defendantName");
            briefDescription = c.getString("briefDescription");

            caseList.add(new Case(claimantName,defendantName,briefDescription));

            return caseList;
        }
        return null;
    }

    public void approveCase(Case cases){
        Document search = (Document) courtCases.find(new Document("claimantName", cases.getClaimantName())).first();

        if(search != null){
            System.out.println("Found user!");
            Bson updateStatus = new Document("status", "Approved");
            Bson updateOperation = new Document("$set", updateStatus);

            courtCases.updateOne(search, updateOperation);

            System.out.println("Status updated");
        }
    }

    public List<Case> getJudgesCases() {
        FindIterable<Document> findIterable = courtCases.find(eq("status", "Approved")).
                projection(include("claimantName", "defendantName"));

        String claimantName = null;
        String defendantName = null;

        List<Case> caseList = new ArrayList<>();

        for (Document c: findIterable){
            claimantName = c.getString("claimantName");
            defendantName = c.getString("defendantName");

            caseList.add(new Case(claimantName,defendantName));

            return caseList;
        }
        return null;
    }
}