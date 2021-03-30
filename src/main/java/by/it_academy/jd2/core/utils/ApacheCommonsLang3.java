package by.it_academy.jd2.core.utils;

import jdk.jfr.Description;
import org.apache.commons.lang3.StringUtils;

/**
 * This is a class for checking - all letters in lower case
 * @author Aleksey Malashenkov
 * @version 0.0.0
 */

public class ApacheCommonsLang3 {
    /**
     * something is called here
     * @param cs - param
     * @return return
     */
    @Description("isAllLowerCase")
    public static boolean isAllLowerCase(CharSequence cs) {
        return StringUtils.isAllLowerCase(cs);
    }
}
