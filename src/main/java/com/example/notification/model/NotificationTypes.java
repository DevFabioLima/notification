package com.example.notification.model;

public enum NotificationTypes {
    SMS("SMS"),
    ZAP("ZAP"),
    EMAIL("EMAIL");

    private final String value;
    NotificationTypes(String value) { this.value = value; }

    public String getValue() { return value; }
}
