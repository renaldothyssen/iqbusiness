package com.iq.business.config;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import com.iq.business.enums.MessageBroker;

import com.iq.business.util.MessageUtil;

import java.io.IOException;
import java.util.concurrent.TimeoutException;


public class MessageBrokerReceiverConfig {

    private static final String HOST = "localhost";
    private static final int PORT = 5672;
    private static final int TIMEOUT = 3000;

    public void configureReceiver() throws IOException, TimeoutException {
        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost(HOST);
        factory.setPort(PORT);
        factory.setConnectionTimeout(TIMEOUT);
        Connection connection = factory.newConnection();
        Channel channel = connection.createChannel();

        channel.queueDeclare(MessageBroker.EXCHANGE.getValue(), false, false, false, null);

        DeliverCallback deliverCallback = (consumerTag, delivery)->{
            String message = new String(delivery.getBody(), "UTF-8");
            MessageUtil messageUtil = new MessageUtil();
            System.out.println("Hello '" + messageUtil.formatMessage(message) + "', I am your father!");
        };
        channel.basicConsume(MessageBroker.EXCHANGE.getValue(),true, deliverCallback, consumerTag ->{});
    }

}
