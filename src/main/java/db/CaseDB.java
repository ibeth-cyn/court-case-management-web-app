package db;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import model.Case;
import org.bson.Document;


import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Projections.*;

public class CaseDB {

    //connecting to the server
    MongoClient mongoClient = new MongoClient("localhost", 27017);

    //creating database if it doesn't exist
    MongoDatabase getDB = mongoClient.getDatabase("userDetails");

    //creating a collection for court users cases and info
    MongoCollection<Document> courtCases = getDB.getCollection("courtCases");

    public final Document toDocument(Case newCase) {
        return new Document("_id", newCase.getSuitNumber()).
                append("claimantName", newCase.getClaimantName()).
                append("claimantSurname", newCase.getClaimantSurname()).
                append("claimantTradingName", newCase.getClaimantTradingName()).
                append("claimantOrganisationType", newCase.getClaimantOrganisationType()).
                append("claimantRegistrationNumber", newCase.getClaimantRegistrationNumber()).
                append("claimantPhysicalAddress", newCase.getClaimantAddress()).
                append("claimantEmailAddress", newCase.getClaimantEmailAddress()).
                append("clientName", newCase.getClientName()).
                append("clientSurname", newCase.getClientSurname()).
                append("clientTradingName", newCase.getClaimantTradingName()).
                append("clientOrganisationType", newCase.getClientOrganisationType()).
                append("clientRegistrationNumber", newCase.getClientRegistrationNumber()).
                append("defendantName", newCase.getDefendantName()).
                append("defendantSurname", newCase.getDefendantSurname()).
                append("briefDescription", newCase.getBriefDescription()).
                append("defendantTradingName", newCase.getDefendantTradingName()).
                append("defendantOrganisationType", newCase.getDefendantOrganisationType()).
                append("defendantRegistrationNumber", newCase.getDefendantRegistrationNumber()).
                append("defendantContactDetails", newCase.getDefendantContactDetails()).
                append("disputeResolution",newCase.getDisputeResolution()).
                append("statementOfClaim", newCase.getStatementsOfClaim()).
                append("oathsOfWitnesses", newCase.getOathOfWitnesses()).
                append("relevantDocuments", newCase.getRelevantDocuments()).
                append("status", "Pending");
    }

    public void addCaseToCollection(Case newCase) {
        //Change method for finding new document probably include a constructor for it
        Document found = (Document) courtCases.find(new Document("_id", newCase.getSuitNumber())).first();
        if (found != null) {
            System.out.println("Case already in the database!!");
        } else {
            courtCases.insertOne(toDocument(newCase));
        }
    }

    //TODO: Might include case documents for now or take in Case as inputs
    public FindIterable<Document> getRegistrarCases() {
        FindIterable<Document> findIterable = courtCases.find(eq("_id", new Case().getSuitNumber())).
                projection(include("claimantName", "briefDescription", "status"));
        return findIterable;
    }


    //TODO: Create method that approves case for designation and update the status of the case to Approved,

    public FindIterable<Document> getJudgesCases() {
        FindIterable<Document> findIterable = courtCases.find(eq("status", "Approved")).
                projection(fields(include("claimantName", "defendantName"), excludeId()));
        return findIterable;
    }
}