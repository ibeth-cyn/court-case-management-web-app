package controller.servlets;

import dao.CaseDB;
import model.Case;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/approve.co")
public class ApproveCaseServlet extends HttpServlet {

    private CaseDB caseDB = new CaseDB();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String claimantName = request.getParameter("claimantName");
        String defendantName = request.getParameter("defendantName");
        String briefDescription = request.getParameter("briefDescription");

        caseDB.approveCase(new Case(claimantName, defendantName, briefDescription));

        response.sendRedirect("/registrarDashboard.co");
    }

}