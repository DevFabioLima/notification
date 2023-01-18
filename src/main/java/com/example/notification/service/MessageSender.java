package com.example.notification.service;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.aws.messaging.core.QueueMessageChannel;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class MessageSender {

    private static final String QUEUE_NAME = "http://localhost:4566/000000000000/notificationRequest";
    @Autowired
    private final AmazonSQSAsync sqs;

    @Autowired
    public MessageSender(final AmazonSQSAsync sqs) {
        this.sqs = sqs;
    }

    public boolean send(String messagePayload) {
        MessageChannel messageChannel = new QueueMessageChannel(sqs, QUEUE_NAME);
        Message<String> msg = MessageBuilder.withPayload(messagePayload)
                .setHeader("type", "any")
                .build();
        long waitTimeoutMillis = 5000;
        boolean sentStatus = messageChannel.send(msg, waitTimeoutMillis);
        return sentStatus;
    }


}
