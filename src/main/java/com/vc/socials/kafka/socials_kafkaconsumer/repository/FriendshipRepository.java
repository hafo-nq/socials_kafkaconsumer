package com.vc.socials.kafka.socials_kafkaconsumer.repository;

import com.vc.socials.kafka.socials_kafkaconsumer.model.Friendship;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendshipRepository extends JpaRepository<Friendship, Long> {

}
