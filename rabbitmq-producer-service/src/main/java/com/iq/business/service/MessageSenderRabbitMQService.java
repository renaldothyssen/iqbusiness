package com.iq.business.service;

import com.iq.business.config.MessageBrokerSenderConfig;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class MessageSenderRabbitMQService implements MessageSender {

    @Override
    public void send(String text) {
        try {
            MessageBrokerSenderConfig messageBrokerConfig = new MessageBrokerSenderConfig();
            String message = "Hello my name is, " + text;
            messageBrokerConfig.configureSender(message);
            System.out.println(message);
        } catch (IOException | TimeoutException e) {
            System.out.println("Error Occurred: " + e.getMessage());
        }
    }
}
