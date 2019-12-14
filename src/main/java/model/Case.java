package model;


import java.util.Objects;

public class Case {


    //Claimant details
    private String claimantName; //Can be the name of the law firm as well

    private String claimantSurname;
    private String claimantTradingName;
    private String claimantOrganisationType;
    private String claimantAddress;
    private String claimantEmailAddress;

    //Client details
    private String clientName; //Can be the name of the client organisation as well

    private String clientSurname;
    private String clientTradingName;
    private String clientOrganisationType;

    //Defendant details
    private String defendantName; //Can be the name of the defendant's organisation as well

    private String defendantSurname;
    private String defendantTradingName;
    private String defendantOrganisationType;
    private String defendantAddress;
    private String defendantLGA;
    private String defendantEmail;

    //Claim documents reference
    private String statementOfClaim;
    private String briefDescription;
    private String oathOfWitness;
    private String relevantDocument;
    private String status;


    //Constructor defining features of a case
    public Case() {

    }

    public Case(String claimantName, String claimantSurname, String claimantTradingName, String claimantOrganisationType,
                String claimantAddress, String claimantEmailAddress, String clientName, String clientSurname, String clientTradingName,
                String clientOrganisationType, String defendantName, String defendantSurname, String defendantTradingName,
                String defendantOrganisationType, String defendantAddress, String defendantLGA, String defendantEmail,
                String briefDescription) {

        this.claimantName = claimantName;
        this.claimantSurname = claimantSurname;
        this.claimantTradingName = claimantTradingName;
        this.claimantOrganisationType = claimantOrganisationType;
        this.claimantAddress = claimantAddress;
        this.claimantEmailAddress = claimantEmailAddress;
        this.clientName = clientName;
        this.clientSurname = clientSurname;
        this.clientTradingName = clientTradingName;
        this.clientOrganisationType = clientOrganisationType;
        this.defendantName = defendantName;
        this.defendantSurname = defendantSurname;
        this.defendantTradingName = defendantTradingName;
        this.defendantOrganisationType = defendantOrganisationType;
        this.defendantAddress = defendantAddress;
        this.defendantLGA = defendantLGA;
        this.defendantEmail = defendantEmail;
        this.briefDescription = briefDescription;
    }

    public Case(String claimantName, String defendantName, String briefDescription) {
        this.claimantName = claimantName;
        this.defendantName = defendantName;
        this.briefDescription = briefDescription;
    }

    public Case(String claimantName, String defendantName){
        this.claimantName = claimantName;
        this.defendantName = defendantName;
    }

    public String getStatus(){
        return status;
    }

    public  void setStatus(String status){
        this.status = status;
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

    public void setClientOrganisationType(String clientOrganisationType) {
        this.clientOrganisationType = clientOrganisationType;
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

    public String getStatementOfClaim() {
        return statementOfClaim;
    }

    public void setStatementOfClaim(String statementOfClaim) {
        this.statementOfClaim = statementOfClaim;
    }

    public String getBriefDescription() {
        return briefDescription;
    }

    public void setBriefDescription(String briefDescription) {
        this.briefDescription = briefDescription;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Case aCase = (Case) o;
        return Objects.equals(claimantName, aCase.claimantName) &&
                Objects.equals(claimantSurname, aCase.claimantSurname) &&
                Objects.equals(claimantTradingName, aCase.claimantTradingName) &&
                Objects.equals(claimantOrganisationType, aCase.claimantOrganisationType) &&
                Objects.equals(claimantAddress, aCase.claimantAddress) &&
                Objects.equals(claimantEmailAddress, aCase.claimantEmailAddress) &&
                Objects.equals(clientName, aCase.clientName) &&
                Objects.equals(clientSurname, aCase.clientSurname) &&
                Objects.equals(clientTradingName, aCase.clientTradingName) &&
                Objects.equals(clientOrganisationType, aCase.clientOrganisationType) &&
                Objects.equals(defendantName, aCase.defendantName) &&
                Objects.equals(defendantSurname, aCase.defendantSurname) &&
                Objects.equals(defendantTradingName, aCase.defendantTradingName) &&
                Objects.equals(defendantOrganisationType, aCase.defendantOrganisationType) &&
                Objects.equals(defendantAddress, aCase.defendantAddress) &&
                Objects.equals(defendantLGA, aCase.defendantLGA) &&
                Objects.equals(defendantEmail, aCase.defendantEmail) &&
                Objects.equals(statementOfClaim, aCase.statementOfClaim) &&
                Objects.equals(briefDescription, aCase.briefDescription) &&
                Objects.equals(oathOfWitness, aCase.oathOfWitness) &&
                Objects.equals(relevantDocument, aCase.relevantDocument) &&
                Objects.equals(status, aCase.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(claimantName, claimantSurname, claimantTradingName, claimantOrganisationType, claimantAddress,
                claimantEmailAddress, clientName, clientSurname, clientTradingName, clientOrganisationType, defendantName,
                defendantSurname, defendantTradingName, defendantOrganisationType, defendantAddress, defendantLGA, defendantEmail,
                statementOfClaim, briefDescription, oathOfWitness, relevantDocument, status);
    }
}

