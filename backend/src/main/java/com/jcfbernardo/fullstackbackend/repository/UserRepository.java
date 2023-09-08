package com.jcfbernardo.fullstackbackend.repository;

import com.jcfbernardo.fullstackbackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
