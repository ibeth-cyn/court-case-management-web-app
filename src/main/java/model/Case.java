package model;

import java.util.*;

public class Case {

    //TODO: Create a constructor that displays what appears on the registrar's dashboard
    //TODO: Create a constructor that displays what appears on the judge's dashboard

    //Case Identifier
    private static int suitNumber = 1;

    //Claimant details
    private String claimantName; //Can be the name of the law firm as well

    private String claimantSurname;
    private String claimantTradingName;
    private String claimantOrganisationType;
    private String claimantRegistrationNumber;
    private String claimantAddress;
    private String claimantEmailAddress;

    //Client details
    private String clientName; //Can be the name of the client organisation as well

    private String clientSurname;
    private String clientTradingName;
    private String clientOrganisationType;
    private String clientRegistrationNumber;

    //Defendant details
    private String defendantName; //Can be the name of the defendant's organisation as well

    private String defendantSurname;
    private String defendantTradingName;
    private String defendantOrganisationType;
    private String defendantRegistrationNumber;
    private String defendantAddress;
    private String defendantLGA;
    private String defendantEmail;
    //TODO: Subject to change as a better understanding of the data is achieved
    private HashMap<String,String> defendantContactDetails;

    //Claim documents reference
    private String statementsOfClaim;
    private String briefDescription;
    private String checkbox;
    private ArrayList<String> disputeResolution;
    //TODO: Subject to change as a better understanding of the data is achieved
    private String oathOfWitness;
    private String relevantDocument;
    private ArrayList<String> oathOfWitnesses;
    private ArrayList<String> relevantDocuments;


    //public Case(int suitNumber, String defe)
    //Getters and Setters

    //Constructor defining features of a case
    public Case(){

    }

    public Case(String claimantName, String claimantSurname, String claimantTradingName, String claimantOrganisationType,
                String claimantRegistrationNumber, String claimantAddress, String claimantEmailAddress, String clientName,
                String clientSurname, String clientTradingName, String clientOrganisationType, String clientRegistrationNumber,
                String defendantName, String defendantSurname, String defendantTradingName, String defendantOrganisationType,
                String defendantRegistrationNumber, String defendantAddress, String defendantLGA, String defendantEmail,
                String statementsOfClaim, String briefDescription, String checkbox, String oathOfWitness, String relevantDocument){

        this.claimantName = claimantName;
        this.claimantSurname = claimantSurname;
        this.claimantTradingName = claimantTradingName;
        this.claimantOrganisationType = claimantOrganisationType;
        this.claimantRegistrationNumber = claimantRegistrationNumber;
        this.claimantAddress = claimantAddress;
        this.claimantEmailAddress= claimantEmailAddress;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientTradingName = clientTradingName;
        this.clientOrganisationType = clientOrganisationType;
        this.clientRegistrationNumber = clientRegistrationNumber;
        this.defendantName = defendantName;
        this.defendantSurname = defendantSurname;
        this.defendantTradingName = defendantTradingName;
        this.defendantOrganisationType = defendantOrganisationType;
        this.defendantRegistrationNumber = defendantRegistrationNumber;
        this.defendantAddress = defendantAddress;
        this.defendantLGA = defendantLGA;
        this.defendantEmail = defendantEmail;
        this.statementsOfClaim = statementsOfClaim;
        this.briefDescription = briefDescription;
        this.checkbox = checkbox;
        this.oathOfWitness = oathOfWitness;
        this.relevantDocument = relevantDocument;
    }

    public int getSuitNumber() {
        return suitNumber++;
    }

    public void setSuitNumber(int suitNumber) {
        this.suitNumber = suitNumber;
    }

    public String getCheckbox() {
        return checkbox;
    }

    public void setCheckbox(String checkbox) {
        this.checkbox = checkbox;
    }

    public String getClaimantName() {
        return claimantName;
    }

    public void setClaimantName(String claimantName) {
        this.claimantName = claimantName;
    }

    public String getClaimantSurname() {
        return claimantSurname;
    }

    public void setClaimantSurname(String claimantSurname) {
        this.claimantSurname = claimantSurname;
    }

    public String getClaimantTradingName() {
        return claimantTradingName;
    }

    public void setClaimantTradingName(String claimantTradingName) {
        this.claimantTradingName = claimantTradingName;
    }

    public String getClaimantOrganisationType() {
        return claimantOrganisationType;
    }

    public void setClaimantOrganisationType(String claimantOrganisationType) {
        this.claimantOrganisationType = claimantOrganisationType;
    }

    public String getClaimantRegistrationNumber() {
        return claimantRegistrationNumber;
    }

    public void setClaimantRegistrationNumber(String claimantRegistrationNumber) {
        this.claimantRegistrationNumber = claimantRegistrationNumber;
    }

    public String getClaimantAddress() {
        return claimantAddress;
    }

    public void setClaimantAddress(String claimantAddress) {
        this.claimantAddress = claimantAddress;
    }

    public String getClaimantEmailAddress() {
        return claimantEmailAddress;
    }

    public void setClaimantEmailAddress(String claimantEmailAddress) {
        this.claimantEmailAddress = claimantEmailAddress;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientSurname() {
        return clientSurname;
    }

    public void setClientSurname(String clientSurname) {
        this.clientSurname = clientSurname;
    }

    public String getClientTradingName() {
        return clientTradingName;
    }

    public void setClientTradingName(String clientTradingName) {
        this.clientTradingName = clientTradingName;
    }

    public String getClientOrganisationType() {
        return clientOrganisationType;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
    }

    public ArrayList<String> getDisputeResolution() {
        return disputeResolution;
    }

    public void setDisputeResolution(ArrayList<String> disputeResolution) {
        disputeResolution.add(getCheckbox());
        this.disputeResolution = disputeResolution;
    }

    public void setClientOrganisationType(String clientOrganisationType) {
        this.clientOrganisationType = clientOrganisationType;
    }

    public String getClientRegistrationNumber() {
        return clientRegistrationNumber;
    }

    public void setClientRegistrationNumber(String clientRegistrationNumber) {
        this.clientRegistrationNumber = clientRegistrationNumber;
    }

    public String getDefendantName() {
        return defendantName;
    }

    public void setDefendantName(String defendantName) {
        this.defendantName = defendantName;
    }

    public String getDefendantSurname() {
        return defendantSurname;
    }

    public void setDefendantSurname(String defendantSurname) {
        this.defendantSurname = defendantSurname;
    }

    public String getDefendantTradingName() {
        return defendantTradingName;
    }

    public void setDefendantTradingName(String defendantTradingName) {
        this.defendantTradingName = defendantTradingName;
    }

    public String getDefendantOrganisationType() {
        return defendantOrganisationType;
    }

    public void setDefendantOrganisationType(String defendantOrganisationType) {
        this.defendantOrganisationType = defendantOrganisationType;
    }

    public String getDefendantRegistrationNumber() {
        return defendantRegistrationNumber;
    }

    public void setDefendantRegistrationNumber(String defendantRegistrationNumber) {
        this.defendantRegistrationNumber = defendantRegistrationNumber;
    }

    public String getDefendantAddress() {
        return defendantAddress;
    }

    public void setDefendantAddress(String defendantAddress) {
        this.defendantAddress = defendantAddress;
    }

    public String getDefendantLGA() {
        return defendantLGA;
    }

    public void setDefendantLGA(String defendantLGA) {
        this.defendantLGA = defendantLGA;
    }

    public String getDefendantEmail() {
        return defendantEmail;
    }

    public void setDefendantEmail(String defendantEmail) {
        this.defendantEmail = defendantEmail;
    }

    public HashMap<String, String> getDefendantContactDetails() {
        return defendantContactDetails;
    }

    public void setDefendantContactDetails(HashMap<String, String> defendantContactDetails) {
        defendantContactDetails.put("defendantAddress", getDefendantAddress());
        defendantContactDetails.put("defendantLGA", getDefendantLGA());
        defendantContactDetails.put("defendantEmail", getDefendantEmail());

        this.defendantContactDetails = defendantContactDetails;
    }

    public String getStatementsOfClaim() {
        return statementsOfClaim;
    }

    public void setStatementsOfClaim(String statementsOfClaim) {
        this.statementsOfClaim = statementsOfClaim;
    }


    public String getOathOfWitness() {
        return oathOfWitness;
    }

    public void setOathOfWitness(String oathOfWitness) {
        this.oathOfWitness = oathOfWitness;
    }

    public String getRelevantDocument() {
        return relevantDocument;
    }

    public void setRelevantDocument(String relevantDocument) {
        this.relevantDocument = relevantDocument;
    }

    public ArrayList<String> getOathOfWitnesses() {
        return oathOfWitnesses;
    }

    public void setOathOfWitnesses(ArrayList<String> oathOfWitnesses) {
        oathOfWitnesses.add(getOathOfWitness());
        this.oathOfWitnesses = oathOfWitnesses;
    }

    public ArrayList<String> getRelevantDocuments() {
        return relevantDocuments;
    }

    public void setRelevantDocuments(ArrayList<String> relevantDocuments) {
        relevantDocuments.add(getRelevantDocument());
        this.relevantDocuments = relevantDocuments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Case aCase = (Case) o;
        return Objects.equals(claimantName, aCase.claimantName) &&
                Objects.equals(claimantSurname, aCase.claimantSurname) &&
                Objects.equals(claimantTradingName, aCase.claimantTradingName) &&
                Objects.equals(claimantOrganisationType, aCase.claimantOrganisationType) &&
                Objects.equals(claimantRegistrationNumber, aCase.claimantRegistrationNumber) &&
                Objects.equals(claimantAddress, aCase.claimantAddress) &&
                Objects.equals(claimantEmailAddress, aCase.claimantEmailAddress) &&
                Objects.equals(clientName, aCase.clientName) &&
                Objects.equals(clientSurname, aCase.clientSurname) &&
                Objects.equals(clientTradingName, aCase.clientTradingName) &&
                Objects.equals(clientOrganisationType, aCase.clientOrganisationType) &&
                Objects.equals(clientRegistrationNumber, aCase.clientRegistrationNumber) &&
                Objects.equals(defendantName, aCase.defendantName) &&
                Objects.equals(defendantSurname, aCase.defendantSurname) &&
                Objects.equals(defendantTradingName, aCase.defendantTradingName) &&
                Objects.equals(defendantOrganisationType, aCase.defendantOrganisationType) &&
                Objects.equals(defendantRegistrationNumber, aCase.defendantRegistrationNumber) &&
                Objects.equals(defendantAddress, aCase.defendantAddress) &&
                Objects.equals(defendantLGA, aCase.defendantLGA) &&
                Objects.equals(defendantEmail, aCase.defendantEmail) &&
                Objects.equals(defendantContactDetails, aCase.defendantContactDetails) &&
                Objects.equals(statementsOfClaim, aCase.statementsOfClaim) &&
                Objects.equals(briefDescription, aCase.briefDescription) &&
                Objects.equals(disputeResolution, aCase.disputeResolution) &&
                Objects.equals(oathOfWitness, aCase.oathOfWitness) &&
                Objects.equals(relevantDocument, aCase.relevantDocument) &&
                Objects.equals(oathOfWitnesses, aCase.oathOfWitnesses) &&
                Objects.equals(relevantDocuments, aCase.relevantDocuments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimantName, claimantSurname, claimantTradingName, claimantOrganisationType,
                claimantRegistrationNumber, claimantAddress, claimantEmailAddress, clientName, clientSurname,
                clientTradingName, clientOrganisationType, clientRegistrationNumber, defendantName, defendantSurname,
                defendantTradingName, defendantOrganisationType, defendantRegistrationNumber, defendantAddress, defendantLGA,
                defendantEmail, defendantContactDetails, statementsOfClaim, briefDescription, disputeResolution, oathOfWitness,
                relevantDocument, oathOfWitnesses, relevantDocuments);
    }
}
