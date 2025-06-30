package com.snake.notification.repositories;

import com.snake.notification.entities.UserEntity;
import com.snake.notification.enums.UserType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findFirstByUserType(UserType userType);

    Optional<UserEntity> findByUsername(String username);
}
