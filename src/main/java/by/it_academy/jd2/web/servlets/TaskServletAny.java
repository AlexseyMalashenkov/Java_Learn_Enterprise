package by.it_academy.jd2.web.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * This is a class is task to work with header
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

@WebServlet(name = "TaskServletAny", urlPatterns = "/cookiesAny")
public class TaskServletAny extends HttpServlet {

    private String NAME_PARAMETER_HEADER = "ARRAY_NAME_PARAM";

    /**
     * Override doGet
     * @param req - param HttpServletRequest
     * @param resp - param HttpServletResponse
     */

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String header = req.getHeader(NAME_PARAMETER_HEADER);
        String[] names = req.getParameterMap().get(header);

        if (names != null){
            for (String name : names) {
                writer.write("<p>" + header + " : " + name + "</p>");
            }
        }
    }
}
