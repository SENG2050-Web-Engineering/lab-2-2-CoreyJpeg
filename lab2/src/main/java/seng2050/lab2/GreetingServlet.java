package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GreetingServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String value = req.getParameter("name");
        if (value == null) {
            // Nothing worked
        } else if (value == "Corey") {
            //
        } else {
            //
        }

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head> <title>Never Gonna Give You Up</title> </head>");
        out.println("<body>");
        out.println("\t<h1> Never Gonna Let You Down</h1>");
        out.println("\t<h2> Never Gonna Run around</h2>");
        out.println("\t<h3> And</h3>");
        out.println("\t<h4> Dessert You</h4>");
        out.println("\t<p> This Person is the best ever " + value + "</p>");
        out.println("</body>");
        out.println("</html>");

    }
}
