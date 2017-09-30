package pl.ajablonski.szj.servletform;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/form")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String theAnswer = req.getParameter("theAnswer");

        resp.getWriter().write("<html><body>The Answer = " + theAnswer +
                "<form method=\"GET\"> " +
                "   <input type=\"submit\" name=\"theAnswer\" value=\"Tak\"/>" +
                "   <input type=\"submit\" name=\"theAnswer\" value=\"Nie\"/>" +
                "</form></body></html>");
    }
}
