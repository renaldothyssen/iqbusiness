package com.iq.business;

import com.iq.business.service.MessageReceiver;
import com.iq.business.service.MessageReceiverRabbitMQService;

public class Receiver {

    public static void main(String[] args) {
        MessageReceiver messageReceiver = new MessageReceiverRabbitMQService();
        messageReceiver.receiveMessage();
    }
}
