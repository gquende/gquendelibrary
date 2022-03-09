package com.vipas.gquendelibray.repository.library_repository;

import com.vipas.gquendelibray.models.library_models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
}