package com.VMOproject.fresher.repository;

import com.VMOproject.fresher.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    String getUsername();
    String getPassword();
    String getFirstName();
    String getLastName();
    LocalDate getDob();
}
