package com.iq.business;

import com.iq.business.service.MessageSenderRabbitMQService;
import java.util.Scanner;


public class Sender {

    public static void main(String[] args) {
        System.out.println("Name:");
        Scanner sc = new Scanner(System.in);
        String message = sc.nextLine();
        MessageSenderRabbitMQService messageSenderRabbitMQService = new MessageSenderRabbitMQService();
        messageSenderRabbitMQService.send(message);
    }

}
