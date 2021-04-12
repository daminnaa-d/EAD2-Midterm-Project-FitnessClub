package org.example.Servlets;

import org.example.entity.Account;
import org.example.entity.FitnessClub;
import org.example.entity.Schedule;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(
        name="schedule",
        urlPatterns = "/schedule"
)
public class ScheduleServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        req.getRequestDispatcher("link.jsp").include(req, resp);

        String programme = req.getParameter("schedule");
        FitnessClub fitnessClub = FitnessClub.getFitnessClub();

        HttpSession session = req.getSession();
        if (session.getAttribute("name") != null) {
            for (Account account : FitnessClub.getFitnessClub().getAccounts()) {
                if (account.getFirstName().equalsIgnoreCase((String) session.getAttribute("name"))) {
                    for(Schedule schedule: fitnessClub.getSchedules()){
                        if(programme.equalsIgnoreCase(schedule.getProgramme())){
                           account.getSchedules().add(schedule);
                           out.println("You are signed for the " + programme);
                           break;
                        }else{
                            out.println("Programme is not found!");
                        }
                    }
                } else {
                    out.println("Account are not found!");
                }
            }
        }else{
            out.print("Please login first");
            req.getRequestDispatcher("login.jsp").include(req, resp);
        }



    }
}
