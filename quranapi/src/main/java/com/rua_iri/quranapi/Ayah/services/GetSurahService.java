package com.rua_iri.quranapi.Ayah.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rua_iri.quranapi.Query;
import com.rua_iri.quranapi.Ayah.AyahRepository;
import com.rua_iri.quranapi.Ayah.Model.AyahDTO;
import com.rua_iri.quranapi.exceptions.AyahNotFoundException;

@Service
public class GetSurahService implements Query<Integer, List<AyahDTO>> {

    private AyahRepository ayahRepository;

    public GetSurahService(AyahRepository ayahRepository) {
        this.ayahRepository = ayahRepository;
    }

    @Override
    public ResponseEntity<List<AyahDTO>> execute(Integer input) {

        List<AyahDTO> ayahList = ayahRepository.findBySurah(input)
                .stream()
                .map(AyahDTO::new)
                .toList();

        if (ayahList.size() > 0) {
            return ResponseEntity.ok(ayahList);
        }

        throw new AyahNotFoundException();
    }

}
