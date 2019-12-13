package controller.servlets;

import dao.CaseDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registrarDashboard.co")
public class RegistrarServlet extends HttpServlet {

//    private CaseDB listCases = new CaseDB();
    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
//        httpServletRequest.setAttribute("listCases", listCases.getRegistrarCases());
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/registrarDashboard.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
//        for (Document c :listCases.getRegistrarCases()) {
//            httpServletRequest.setAttribute("listCases",c);
//            httpServletRequest.getRequestDispatcher("/WEB-INF/views/registrardashboard.jsp").
//                    forward(httpServletRequest,httpServletResponse);
//
//        }
    }
}
