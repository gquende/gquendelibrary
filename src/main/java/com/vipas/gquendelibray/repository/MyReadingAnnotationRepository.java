package com.vipas.gquendelibray.repository;

import com.vipas.gquendelibray.models.MyReadingAnnotation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MyReadingAnnotationRepository extends JpaRepository<MyReadingAnnotation, Long> {

    List<MyReadingAnnotation> findByMyReadingId(long id);
}