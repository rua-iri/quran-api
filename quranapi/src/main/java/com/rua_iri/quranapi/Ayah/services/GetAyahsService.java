package com.rua_iri.quranapi.Ayah.services;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rua_iri.quranapi.Query;
import com.rua_iri.quranapi.Ayah.AyahRepository;
import com.rua_iri.quranapi.Ayah.Model.Ayah;
import com.rua_iri.quranapi.Ayah.Model.AyahDTO;

@Service
public class GetAyahsService implements Query<Void, List<AyahDTO>> {

    public GetAyahsService(AyahRepository ayahRepository) {
        this.ayahRepository = ayahRepository;
    }

    private AyahRepository ayahRepository;

    @Override
    public ResponseEntity<List<AyahDTO>> execute(Void input) {

        List<Ayah> ayahs = ayahRepository.findAll();
        List<AyahDTO> ayahDTOs = ayahs.stream()
                .map(AyahDTO::new)
                .toList();

        return ResponseEntity.status(HttpStatus.OK).body(ayahDTOs);
    }

}
