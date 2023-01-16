package com.example.notification.model;

public enum NotificationStatus {
    PENDING("PENDING"),
    PROCESSING("PROCESSING"),
    SENT("SENT");
    private final String value;
    NotificationStatus(String value) { this.value = value; }
    public String getValue() { return value; }

}
