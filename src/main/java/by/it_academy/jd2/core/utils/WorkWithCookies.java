package by.it_academy.jd2.core.utils;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

import java.util.concurrent.TimeUnit;

/**
 * This is a class for help with cookie
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

public class WorkWithCookies {

    /**
     * save cookie with age = 1 day
     * @param name - param cookie name
     * @param value - param cookie value
     * @param resp - param resp
     */

    public void addCookies(String name, String value, HttpServletResponse resp) {
        Cookie cookie = new Cookie(name, value);

        cookie.setMaxAge(Math.toIntExact(TimeUnit.DAYS.toSeconds(1)));

        resp.addCookie(cookie);
    }


}
