package org.example.Servlets;

import org.example.model.Account;
import org.example.model.FitnessClub;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name="registration",
        urlPatterns = "/registration"
)

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();



        String firstname = req.getParameter("firstname");
        String lastname = req.getParameter("lastname");
        String email = req.getParameter("email");
        String pswd = req.getParameter("pswd");
        Account account = new Account(firstname,lastname,email,pswd);
        FitnessClub fitnessClub = FitnessClub.getFitnessClub();
        fitnessClub.getAccounts().add(account);
        Cookie cookie = new Cookie("name", firstname);
        resp.addCookie(cookie);
//        out.print("<form action='login'>");
//        out.print("<input type='submit' value='go'>");
//        out.print("</form>");
        out.println("First name: " + account.getFirstName() + "<br>");
        out.println("Last name: " +account.getLastName()+ "<br>");
        out.println("Email: " +account.getEmail()+ "<br>");
        out.println("Password: " +account.getPassword()+ "<br>");
        out.close();
    }
}
