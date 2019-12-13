package controller.servlets;

import dao.CaseDB;
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


    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {

        String claimantName = httpServletRequest.getParameter("claimantName");
        String claimantSurname = httpServletRequest.getParameter("claimantSurname");
        String claimantTradingName = httpServletRequest.getParameter("claimantTradingName");
        String claimantOrganisationType = httpServletRequest.getParameter("claimantOrganisationType");
        String claimantAddress = httpServletRequest.getParameter("claimantPhysicalAddress");
        String claimantEmailAddress = httpServletRequest.getParameter("claimantEmailAddress");
        String clientName = httpServletRequest.getParameter("clientName");
        String clientSurname = httpServletRequest.getParameter("clientSurname");
        String clientTradingName = httpServletRequest.getParameter("clientTradingName");
        String clientOrganisationType = httpServletRequest.getParameter("clientOrganisationType");
        String defendantName = httpServletRequest.getParameter("defendantName");
        String defendantSurname = httpServletRequest.getParameter("defendantSurname");
        String defendantTradingName = httpServletRequest.getParameter("defendantTradingName");
        String defendantOrganisationType = httpServletRequest.getParameter("defendantOrganisationType");
        String defendantAddress = httpServletRequest.getParameter("defendantAddress");
        String defendantLGA = httpServletRequest.getParameter("defendantLGA");
        String defendantEmail = httpServletRequest.getParameter("defendantEmail");
        String briefDescription = httpServletRequest.getParameter("briefDescription");


        newCase.addCaseToCollection(new Case(claimantName, claimantSurname, claimantTradingName, claimantOrganisationType,
                claimantAddress, claimantEmailAddress, clientName, clientSurname, clientTradingName, clientOrganisationType,
                defendantName, defendantSurname, defendantTradingName, defendantOrganisationType, defendantAddress, defendantLGA,
                defendantEmail, briefDescription));

        httpServletResponse.sendRedirect("/formSubmitted.co");
    }
}
