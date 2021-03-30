package by.it_academy.jd2.web.listeners;

import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

/**
 * This is a class listener
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

public class SessionChangeListener implements HttpSessionAttributeListener {
    /**
     * attribute add method
     * @param event - param
     */
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
        System.out.println("У нас новый атрибут: " + event.getName());
    }
}
