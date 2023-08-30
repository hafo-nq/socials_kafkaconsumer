package com.vc.socials.kafka.socials_kafkaconsumer.repository;

import com.vc.socials.kafka.socials_kafkaconsumer.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    @Query("from Comment order by createdAt")
    public List<Comment> findComments();
}
