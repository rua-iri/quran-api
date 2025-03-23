package com.rua_iri.quranapi.Ayah.services;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rua_iri.quranapi.Query;
import com.rua_iri.quranapi.Ayah.AyahRepository;
import com.rua_iri.quranapi.Ayah.Model.SurahDTO;

@Service
public class GetSurahsService implements Query<Integer, List<SurahDTO>> {

    private AyahRepository ayahRepository;

    public GetSurahsService(AyahRepository ayahRepository) {
        this.ayahRepository = ayahRepository;
    }

    @Override
    public ResponseEntity<List<SurahDTO>> execute(Integer input) {

        List<SurahDTO> surahList = ayahRepository.findAllDistinctSurahs()
                .stream()
                .map(SurahDTO::new)
                .toList();

        return ResponseEntity.ok(surahList);

    }

}
