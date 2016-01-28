package ru.kir;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Kirill Zhitelev on 27.01.2016.
 */
public class MyServlet extends HttpServlet {
    private Text text = new Text();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();

        resp.setContentType("text/html");

        writer.println("<h1>" + text.getTextFromDB() + "</h1>");
    }
}
