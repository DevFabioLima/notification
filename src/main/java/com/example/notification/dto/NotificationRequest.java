package com.example.notification.dto;

import com.example.notification.model.NotificationTypes;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificationRequest {
    private String from;
    private String to;
    private String subject;
    private String message;
    private NotificationTypes type;

    @Override
    public String toString() {
        return "NotificationRequest{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", type=" + type +
                '}';
    }
}
