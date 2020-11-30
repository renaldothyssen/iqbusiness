package com.iq.business.enums;

import lombok.Getter;

@Getter
public enum MessageBroker {

    QUEUE_NAME("iqbusiness.queue"),
    EXCHANGE("iqbusiness.exchange"),
    ROUTING_KEY("iqbusiness.key");

    private String value;

    MessageBroker(final String value){
        this.value = value;
    }
}
