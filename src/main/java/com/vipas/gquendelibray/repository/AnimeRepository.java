package com.vipas.gquendelibray.repository;


import com.vipas.gquendelibray.models.Anime;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Long>
{

}