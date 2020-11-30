package com.iq.business.util;

import org.apache.commons.lang.StringUtils;

public class MessageUtil {
    public final static String VALID_MESSAGE = "VALID";

    public String formatMessage(final String message){
        String name = VALID_MESSAGE;
        if(message != null || message.length() > 0){
            name = StringUtils.trim(StringUtils.substringAfter(message, ","));
        }
        return name;
    }

}
