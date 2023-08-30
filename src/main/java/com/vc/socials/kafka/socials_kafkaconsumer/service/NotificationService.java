package com.vc.socials.kafka.socials_kafkaconsumer.service;

import com.vc.socials.kafka.socials_kafkaconsumer.model.Notification;
import com.vc.socials.kafka.socials_kafkaconsumer.model.User;

import java.util.List;
import java.util.Optional;

public interface NotificationService {
    public List<Notification> getNotificationsByUserID(User userID);

    public List<Notification> getNotificationsByUserID(User userID, int limit);

    public Optional<Notification> getNotificationByID(Long id);
    public void saveNotification(Notification notification);
}
