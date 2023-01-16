package com.example.notification.controller;

import com.example.notification.dto.NotificationRequest;
import com.example.notification.model.Notification;
import com.example.notification.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/notification")
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<?> createNotification(@RequestBody NotificationRequest notificationRequest) {
        Notification notification = notificationService.createNotification(notificationRequest);
        return ResponseEntity.ok().body(notification);
    }


}
