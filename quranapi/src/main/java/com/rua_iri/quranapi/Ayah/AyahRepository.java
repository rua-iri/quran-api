package com.rua_iri.quranapi.Ayah;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rua_iri.quranapi.Ayah.Model.Ayah;

@Repository
public interface AyahRepository extends JpaRepository<Ayah, Integer> {

}
