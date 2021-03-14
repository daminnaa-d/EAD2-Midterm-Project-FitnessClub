package org.example.Filters;

import org.example.model.Account;
import org.example.model.FitnessClub;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;

public class ServletFilter implements Filter {

    FilterConfig config;

    public void init(FilterConfig config) throws ServletException {
        this.config=config;
    }

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {

        PrintWriter out=resp.getWriter();
        resp.setContentType("text/html");


        String permission = config.getInitParameter("permission");
        String email = req.getParameter("email");
        String pswd = req.getParameter("pswd");


        if(permission.equalsIgnoreCase("true")){
            chain.doFilter(req, resp);
        }else{
            out.println("Invalid Data!");
        }
        out.close();
    }
    public void destroy() {}
}
