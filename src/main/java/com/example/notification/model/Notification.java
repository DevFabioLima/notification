package com.example.notification.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@Document(collation = "notifications")
public class Notification {
    @Id
    private String id;
    private String from;
    private String to;
    private String subject;
    private String message;
    private NotificationTypes type;
    private NotificationStatus status;

    @Override
    public String toString() {
        return "NotificationRequest{" +
                "id='" + id + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", subject='" + subject + '\'' +
                ", message='" + message + '\'' +
                ", type=" + type +
                '}';
    }
}
