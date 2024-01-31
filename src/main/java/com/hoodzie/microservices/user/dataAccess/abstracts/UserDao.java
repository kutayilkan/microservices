package com.hoodzie.microservices.user.dataAccess.abstracts;

import com.hoodzie.microservices.user.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
}
