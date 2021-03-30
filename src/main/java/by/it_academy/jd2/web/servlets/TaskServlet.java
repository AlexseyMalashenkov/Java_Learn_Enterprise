package by.it_academy.jd2.web.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * This is a class for print all params servlet
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

@WebServlet(name = "TaskServlet", urlPatterns = "/task")
public class TaskServlet  extends HttpServlet {

    private String NAME_PARAMETER_PREFIX = "name_";

    /**
     * Override doGet
     * @param req - param HttpServletRequest
     * @param resp - param HttpServletResponse
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        Enumeration<String> params = req.getParameterNames();

        while (params.hasMoreElements()) {
            String paramName = params.nextElement();
            if (paramName.startsWith(NAME_PARAMETER_PREFIX)) {
                writer.write("<p>" + paramName + ": " + req.getParameter(paramName) + "</p>");
            }
        }
    }
}
