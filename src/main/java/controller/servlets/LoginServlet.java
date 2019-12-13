package controller.servlets;

import controller.PasswordHash;
import dao.UserDB;
import model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

@WebServlet(urlPatterns = "/login.co")
public class LoginServlet extends HttpServlet {

    //TODO: Implement WebFilters
    //Create an instance of the user authentication class
    PasswordHash passwordHash = new PasswordHash();

    private UserDB authenticate = new UserDB();

    public LoginServlet() throws InvalidKeySpecException, NoSuchAlgorithmException {
    }

    @Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").
                forward(httpServletRequest,httpServletResponse);
    }

    //TODO: Implement session management (find a Youtube video that does exactly that) - optional
    @Override
    protected void doPost(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse)
            throws ServletException, IOException {
        String email = httpServletRequest.getParameter("email");
        String password = httpServletRequest.getParameter("password");

        Person newPerson = new Person(email);
        boolean login = false;

        try{
            login = passwordHash.validatePassword(password,authenticate.confirmUserExists(newPerson));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (InvalidKeySpecException e) {
            e.printStackTrace();
        }

        if(login == true && (authenticate.userRole(newPerson).equals("Registrar"))){
            httpServletRequest.getSession().setAttribute("email",email);
            httpServletResponse.sendRedirect("/registrarDashboard.co");
        }
        else if(login == true && (authenticate.userRole(newPerson).equals("Judge"))){
            httpServletRequest.getSession().setAttribute("email", email);
            httpServletResponse.sendRedirect("/judgeDashboard.co");
        }
        else{
            httpServletRequest.setAttribute("invalidLoginError",
                    "The password you entered or email address is incorrect. Please enter a valid password.");
            httpServletRequest.getRequestDispatcher("/WEB-INF/views/login.jsp").
                    forward(httpServletRequest, httpServletResponse);
        }
    }
}