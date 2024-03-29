package controller.servlets;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = {"/registrarDashboard.co", "/approve.co", "/judgeDashboard.co", "/logout.co", "/judgelogout.co"})
public class Filter implements javax.servlet.Filter {

    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) resp;

        if (request.getSession().getAttribute("email") != null) {
            chain.doFilter(req, resp);
        } else {
            req.setAttribute("invalidLoginError", "Enter a valid name or password to log in.");
            req.getRequestDispatcher("WEB-INF/views/login.jsp").forward(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}

