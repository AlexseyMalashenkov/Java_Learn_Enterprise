package by.it_academy.jd2;

import by.it_academy.jd2.core.utils.ApacheCommonsLang3;
import jdk.jfr.Description;

/**
 * This is a class for checking - all letters in lower case
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

public class Hello {

    /**
     * main method
     * @param args - param
     */

    @Description("main")
    public static void main(String[] args) {
        for(String arg: args) {
            if (ApacheCommonsLang3.isAllLowerCase(arg)) {
                System.out.println(arg);
            }
        }
    }
}