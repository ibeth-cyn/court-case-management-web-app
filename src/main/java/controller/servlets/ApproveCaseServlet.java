package controller.servlets;

import db.CaseDB;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/approve.co")
public class ApproveCaseServlet extends HttpServlet {

    private CaseDB caseDB = new CaseDB();
    //TODO: Approve user cases interacts with forms and returns message about approval
    //TODO: Algorithm for approving cases, you probably need a judge class and define number of slots per day
}
