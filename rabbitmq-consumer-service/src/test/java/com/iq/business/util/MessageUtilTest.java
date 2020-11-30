package com.iq.business.util;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.MockitoAnnotations;

public class MessageUtilTest {
    public static final String USER_INPUT = "Hello my name is, Billy";
    public static final String EXPECTED_OUTPUT = "Billy";

    MessageUtil messageUtil = new MessageUtil();

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void test_when_formatMessage_is_valid(){
        String message = messageUtil.formatMessage(USER_INPUT);
        Assert.assertNotNull(messageUtil);
        Assert.assertEquals("Name is invalid", message, EXPECTED_OUTPUT);
    }
}
