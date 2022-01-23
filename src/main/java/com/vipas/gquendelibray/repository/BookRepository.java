package com.vipas.gquendelibray.repository;

import com.vipas.gquendelibray.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}