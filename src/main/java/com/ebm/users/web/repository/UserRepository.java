package com.ebm.users.web.repository;

import com.ebm.users.web.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByFirstName(String name);

    Optional<Object> findByEmail(String email);
}
