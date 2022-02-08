package com.vipas.gquendelibray.repository;

import com.vipas.gquendelibray.models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findAllByAuthors(String authorname);

}