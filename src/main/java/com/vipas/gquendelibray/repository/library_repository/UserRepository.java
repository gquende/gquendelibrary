package com.vipas.gquendelibray.repository.library_repository;

import com.vipas.gquendelibray.models.library_models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

public User findByUsername(String username);


}