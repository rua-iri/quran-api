package com.rua_iri.quranapi.Ayah.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rua_iri.quranapi.Query;
import com.rua_iri.quranapi.Ayah.AyahRepository;
import com.rua_iri.quranapi.Ayah.Model.AyahDTO;

@Service
public class SearchAyahService implements Query<String, List<AyahDTO>> {

    private final AyahRepository ayahRepository;

    public SearchAyahService(AyahRepository ayahRepository) {
        this.ayahRepository = ayahRepository;
    }

    @Override
    public ResponseEntity<List<AyahDTO>> execute(String input) {

        List<AyahDTO> ayahList = this.ayahRepository.findByAyahTextNoDiacraticContaining(input)
                .stream()
                .map(AyahDTO::new)
                .toList();

        return ResponseEntity.ok(ayahList);

    }

}
