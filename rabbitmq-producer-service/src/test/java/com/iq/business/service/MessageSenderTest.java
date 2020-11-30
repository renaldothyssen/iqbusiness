package com.iq.business.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MessageSenderTest {

     @Mock
    MessageSenderRabbitMQService messageSenderService;

     @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void send(){
        String name = "Billy";
        Assert.assertNotNull(messageSenderService);
        Mockito.doNothing().when(messageSenderService).send(name);
    }
}
