package com.vc.socials.kafka.socials_kafkaconsumer.service;

import com.vc.socials.kafka.socials_kafkaconsumer.model.Post;
import com.vc.socials.kafka.socials_kafkaconsumer.model.User;


import java.util.Optional;

public interface UserService {
    public Optional<User> getUserById(Long id);

    public Optional<User> getUserByUserName(String username);

    public void addPost(Post post, Long Id);

}
