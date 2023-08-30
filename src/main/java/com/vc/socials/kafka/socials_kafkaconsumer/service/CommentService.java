package com.vc.socials.kafka.socials_kafkaconsumer.service;

import com.vc.socials.kafka.socials_kafkaconsumer.model.Comment;

import java.util.List;
import java.util.Optional;

public interface CommentService {
    public List<Comment> getComments();

    public Optional<Comment> getCommentById(Long Id);

    public Long saveComment(Comment comment);
}
