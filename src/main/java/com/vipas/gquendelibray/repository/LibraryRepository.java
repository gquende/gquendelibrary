package com.vipas.gquendelibray.repository;

import com.vipas.gquendelibray.models.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//@Repository
public interface LibraryRepository extends JpaRepository<Library, String> {
}