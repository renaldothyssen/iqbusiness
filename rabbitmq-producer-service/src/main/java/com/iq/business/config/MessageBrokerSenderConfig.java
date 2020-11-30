package com.iq.business.config;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.iq.business.enums.MessageBroker;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

public class MessageBrokerSenderConfig {

    private static final String HOST = "localhost";
    private static final int PORT = 5672;
    private static final int TIMEOUT = 3000;

   public void configureSender(String message) throws IOException, TimeoutException {
       ConnectionFactory factory = new ConnectionFactory();
       factory.setHost(HOST);
       factory.setPort(PORT);
       factory.setConnectionTimeout(TIMEOUT);

       try (Connection connection = factory.newConnection();
            Channel channel = connection.createChannel()) {
           channel.queueDeclare(MessageBroker.EXCHANGE.getValue(), false, false, false, null);
           channel.basicPublish("", MessageBroker.EXCHANGE.getValue(), null, message.getBytes());
       }
   }


}
