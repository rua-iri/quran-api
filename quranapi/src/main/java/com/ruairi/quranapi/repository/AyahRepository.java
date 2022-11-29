package com.ruairi.quranapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ruairi.quranapi.model.Ayah;

@Repository
public interface AyahRepository extends JpaRepository<Ayah, Long> {

    List<Ayah> findBySurahAndAyah(int surah, int ayat);
    
}
