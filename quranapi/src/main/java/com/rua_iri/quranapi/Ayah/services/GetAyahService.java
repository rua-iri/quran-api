package com.rua_iri.quranapi.Ayah.services;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.rua_iri.quranapi.Query;
import com.rua_iri.quranapi.Ayah.AyahRepository;
import com.rua_iri.quranapi.Ayah.Model.Ayah;
import com.rua_iri.quranapi.Ayah.Model.AyahDTO;
import com.rua_iri.quranapi.exceptions.AyahNotFoundException;

@Service
public class GetAyahService implements Query<Integer, AyahDTO> {

    public GetAyahService(AyahRepository ayahRepository) {
        this.ayahRepository = ayahRepository;
    }

    private AyahRepository ayahRepository;

    @Override
    public ResponseEntity<AyahDTO> execute(Integer input) {

        Optional<Ayah> ayahOptional = ayahRepository.findById(input);

        if (ayahOptional.isPresent()) {
            return ResponseEntity.ok(new AyahDTO(ayahOptional.get()));
        }

        throw new AyahNotFoundException();

    }

}
