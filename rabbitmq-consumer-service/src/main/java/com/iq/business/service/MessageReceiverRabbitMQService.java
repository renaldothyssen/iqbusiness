package com.iq.business.service;

import com.iq.business.config.MessageBrokerReceiverConfig;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class MessageReceiverRabbitMQService implements MessageReceiver {


    @Override
    public void receiveMessage() {
        System.out.println("Listening for Messages....");
        try {
            MessageBrokerReceiverConfig messageBrokerConfig = new MessageBrokerReceiverConfig();
            messageBrokerConfig.configureReceiver();
        } catch (IOException | TimeoutException e) {
           System.out.println("Error Occurred: " + e.getMessage());
        }
    }
}
