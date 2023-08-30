package com.vc.socials.kafka.socials_kafkaconsumer.service;

import com.vc.socials.kafka.socials_kafkaconsumer.model.Comment;
import com.vc.socials.kafka.socials_kafkaconsumer.repository.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CommentServiceImpl implements CommentService{
    private CommentRepository commentRepository;
    @Autowired
    public CommentServiceImpl(CommentRepository commentRepository){
        this.commentRepository = commentRepository;
    }
    @Override
    @Transactional
    public List<Comment> getComments() {
        return commentRepository.findComments();
    }

    @Override
    @Transactional
    public Optional<Comment> getCommentById(Long Id) {
        return commentRepository.findById(Id);
    }

    @Override
    @Transactional
    public Long saveComment(Comment comment) {
        commentRepository.saveAndFlush(comment);
        return comment.getId();
    }
}
