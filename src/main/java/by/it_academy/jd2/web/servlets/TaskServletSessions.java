package by.it_academy.jd2.web.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * This is a class is homework task to work with sessions
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

@WebServlet(name = "TaskServletSessions", urlPatterns = "/sessions")
public class TaskServletSessions extends HttpServlet {

    private final String FIRST_NAME = "firstName";
    private final String LAST_NAME = "lastName";

    /**
     * Override doGet
     * @param req - param HttpServletRequest
     * @param resp - param HttpServletResponse
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        String param1 = req.getParameter(FIRST_NAME);
        String param2 = req.getParameter(LAST_NAME);

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();

        if (param1 != null && param2 != null) {
            session.setAttribute(FIRST_NAME, param1);
            session.setAttribute(LAST_NAME, param2);
        } else if (session.getAttribute(FIRST_NAME) != null && session.getAttribute(LAST_NAME) != null) {
            param1 = session.getAttribute(FIRST_NAME).toString();
            param2 = session.getAttribute(LAST_NAME).toString();
        } else {
            param1 = "Ошибка";
            param2 = "нет данных";
        }
        writer.write("<p><span style='color: blue;'>Hello, " + param1 + " " + param2 + "!</span><p>");
    }
}