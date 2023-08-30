package com.vc.socials.kafka.socials_kafkaconsumer.service;

import com.vc.socials.kafka.socials_kafkaconsumer.dto.NotificationDto;
import com.vc.socials.kafka.socials_kafkaconsumer.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class KafkaConsumerService {
    private UserService userService;
    private PostService postService;
    private CommentService commentService;
    private NotificationService notificationService;

    @Autowired
    public KafkaConsumerService(UserService userService, PostService postService, CommentService commentService,
                                NotificationService notificationService){
        this.userService = userService;
        this.postService = postService;
        this.commentService = commentService;
        this.notificationService = notificationService;
    }

    @KafkaListener(topics = "socials_intern", id = "hafonq-1")
    public void receiveMessage(NotificationDto notificationDto) {
        Notification notification = new Notification();
        notification.setUser(userService.getUserById(notificationDto.getUser_id()).get());
        notification.setType(notificationDto.getNotificationType());
        notification.setCreatedAt(notificationDto.getCreated_at());
        notification.setIsRead(notificationDto.is_read());
        NotificationType notificationType = notificationDto.getNotificationType();

        if(notificationType == NotificationType.COMMENT){
            notification.setComment(commentService.getCommentById(notificationDto.getComment_id()).get());

        } else{
            notification.setSender(userService.getUserById(notificationDto.getSender_id()).get());
        }
        notificationService.saveNotification(notification);
    }
}