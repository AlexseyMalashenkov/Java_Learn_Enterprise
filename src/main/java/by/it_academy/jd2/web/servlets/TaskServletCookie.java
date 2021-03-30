package by.it_academy.jd2.web.servlets;

import by.it_academy.jd2.core.utils.WorkWithCookies;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * This is a class is homework task to work with cookies
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

@WebServlet(name = "TaskServletCookie", urlPatterns = "/cookies")
public class TaskServletCookie extends HttpServlet {

    private final String firstName = "firstName";
    private final String lastName = "lastName";

    /**
     * Override doGet
     * @param req - param HttpServletRequest
     * @param resp - param HttpServletResponse
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        WorkWithCookies workWithCookies = new WorkWithCookies();

        String param1 = req.getParameter(firstName);
        String param2 = req.getParameter(lastName);

        resp.setContentType("text/html");

        PrintWriter writer = resp.getWriter();
        Cookie[] cookies = req.getCookies();

        if (param1 != null && param2 != null) {
            workWithCookies.addCookies(firstName, param1, resp);
            workWithCookies.addCookies(lastName, param2, resp);
        } else if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(firstName)) {
                    param1 = cookie.getValue();
                } else if (cookie.getName().equals(lastName)) {
                    param2 = cookie.getValue();
                } else {
                    param1 = "Ошибка";
                    param2 = "cookies";
                }
            }
        } else {
            param1 = "Ошибка";
            param2 = "нет данных";
        }
        writer.write("<p><span style='color: blue;'>Hello, " + param1 + " " + param2 + "!</span><p>");
    }
}
