package com.example.notification.service;

import com.example.notification.dto.NotificationRequest;
import com.example.notification.model.Notification;
import com.example.notification.model.NotificationStatus;
import com.example.notification.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public Notification createNotification(NotificationRequest notificationRequest) {
        Notification notification = Notification.builder()
                .from(notificationRequest.getFrom())
                .to(notificationRequest.getTo())
                .subject(notificationRequest.getSubject())
                .message(notificationRequest.getMessage())
                .type(notificationRequest.getType())
                .status(NotificationStatus.PENDING)
                .build();
       return notificationRepository.insert(notification);
    }

}
