package com.tts.usersapi.repository;

import com.tts.usersapi.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<User, Long> {
    User findByState(String state);

}
