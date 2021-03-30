package by.it_academy.jd2.web.filters;

import jakarta.servlet.*;

import java.io.IOException;

/**
 * This is a class for filter
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

public class SecurityFilter implements Filter {

    private boolean active = false;

    /**
     * init method
     * @param filterConfig - param
     */

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String act = filterConfig.getInitParameter("active");
        if (act != null) {
            active = (act.equalsIgnoreCase("TRUE"));
        }
    }

    /**
     * doFilter method
     * @param servletRequest - param
     * @param servletResponse - param
     * @param filterChain - param
     */

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (active) {
            System.out.println("попал");
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
