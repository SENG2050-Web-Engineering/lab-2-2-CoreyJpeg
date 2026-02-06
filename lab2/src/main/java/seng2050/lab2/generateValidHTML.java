package seng2050.lab2;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class generateValidHTML extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        PrintWriter out = resp.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head> <title>Never Gonna Give You Up</title> </head>");
        out.println("<body>");
        out.println("\t<h1> Never Gonna Let You Down</h1>");
        out.println("\t<h2> Never Gonna Run around</h2>");
        out.println("\t<h3> And</h3>");
        out.println("\t<h4> Dessert You</h4>");
        out.println("</body>");
        out.println("</html>");

    }
}
