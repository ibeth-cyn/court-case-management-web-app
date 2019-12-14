package controller.servlets;

import dao.CaseDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/judgeDashboard.co")
public class JudgeServlet extends HttpServlet {

    private CaseDB listCases = new CaseDB();

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {

            httpServletRequest.setAttribute("listCases", listCases.getJudgesCases());
            httpServletRequest.getRequestDispatcher("/WEB-INF/views/registrardashboard.jsp").
                    forward(httpServletRequest,httpServletResponse);
        }
}
