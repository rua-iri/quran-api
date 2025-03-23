package com.rua_iri.quranapi.Ayah;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rua_iri.quranapi.Ayah.Model.Ayah;

@Repository
public interface AyahRepository extends JpaRepository<Ayah, Integer> {

    List<Ayah> findBySurah(Integer SurahNumber);

    @Query("SELECT a FROM Ayah a WHERE a.ayah_text_no_diacratic LIKE %:substring%")
    List<Ayah> findByAyahTextNoDiacraticContaining(@Param("substring") String substring);
}
