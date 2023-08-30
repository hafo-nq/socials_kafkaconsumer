package com.vc.socials.kafka.socials_kafkaconsumer.dto;
import com.vc.socials.kafka.socials_kafkaconsumer.model.NotificationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDto {
    private Long notification_id;
    private Long user_id;
    private NotificationType notificationType;
    private Long sender_id;
    private Long comment_id;
    private boolean is_read;
    private Timestamp created_at;
}
