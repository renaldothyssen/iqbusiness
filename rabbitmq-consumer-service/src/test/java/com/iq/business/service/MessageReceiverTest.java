package com.iq.business.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

public class MessageReceiverTest {
    @Mock
    MessageReceiverRabbitMQService messageReceiverService;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void consume(){
        Assert.assertNotNull(messageReceiverService);
        Mockito.doNothing().when(messageReceiverService).receiveMessage();
    }
}
