package controller.servlets;

import db.CaseDB;
import model.Case;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/file.co")
public class FormsServlet extends HttpServlet {

    CaseDB newCase = new CaseDB();

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/forms.jsp").
                forward(httpServletRequest,httpServletResponse);
    }

    //TODO: method done but, you might review it(just a heads-up)

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {

        String claimantName = httpServletRequest.getParameter("claimantName");
        String claimantSurname = httpServletRequest.getParameter("claimantSurname");
        String claimantTradingName = httpServletRequest.getParameter("claimantTradingName");
        String claimantOrganisationType = httpServletRequest.getParameter("claimantOrganisationType");
        String claimantRegistrationNumber = httpServletRequest.getParameter("claimantRegistrationNumber");
        String claimantAddress = httpServletRequest.getParameter("claimantPhysicalAddress");
        String claimantEmailAddress = httpServletRequest.getParameter("claimantEmailAddress");
        String clientName = httpServletRequest.getParameter("clientName");
        String clientSurname = httpServletRequest.getParameter("clientSurname");
        String clientTradingName = httpServletRequest.getParameter("clientTradingName");
        String clientOrganisationType = httpServletRequest.getParameter("clientOrganisationType");
        String clientRegistrationNumber = httpServletRequest.getParameter("clientRegistrationNumber");
        String defendantName = httpServletRequest.getParameter("defendantName");
        String defendantSurname = httpServletRequest.getParameter("defendantSurname");
        String defendantTradingName = httpServletRequest.getParameter("defendantTradingName");
        String defendantOrganisationType = httpServletRequest.getParameter("defendantOrganisationType");
        String defendantRegistrationNumber = httpServletRequest.getParameter("defendantRegistrationNumber");
        String defendantAddress = httpServletRequest.getParameter("defendantAddress");
        String defendantLGA = httpServletRequest.getParameter("defendantLGA");
        String defendantEmail = httpServletRequest.getParameter("defendantEmail");
        String statementOfClaim = httpServletRequest.getParameter("statementOfClaim");
        String briefDescription = httpServletRequest.getParameter("briefDescription");
        String checkbox = httpServletRequest.getParameter("checkbox");
        String oathOfWitness = httpServletRequest.getParameter("oathOfWitness");
        String relevantDocument = httpServletRequest.getParameter("relevantDocument");

        newCase.addCaseToCollection(new Case(claimantName, claimantSurname, claimantTradingName, claimantOrganisationType,
                claimantRegistrationNumber, claimantAddress, claimantEmailAddress, clientName, clientSurname,
                clientTradingName, clientOrganisationType, clientRegistrationNumber, defendantName, defendantSurname,
                defendantTradingName, defendantOrganisationType, defendantRegistrationNumber, defendantAddress, defendantLGA,
                defendantEmail, statementOfClaim, briefDescription, checkbox, oathOfWitness, relevantDocument));

        httpServletResponse.sendRedirect("/formSubmitted.co");
    }
}
