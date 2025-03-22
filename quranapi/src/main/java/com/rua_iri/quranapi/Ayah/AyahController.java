package com.rua_iri.quranapi.Ayah;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rua_iri.quranapi.Ayah.Model.AyahDTO;
import com.rua_iri.quranapi.Ayah.services.GetAyahService;
import com.rua_iri.quranapi.Ayah.services.GetAyahsService;

@RestController
public class AyahController {

    public AyahController(GetAyahsService getAyahsService, GetAyahService getAyahService) {
        this.getAyahsService = getAyahsService;
        this.getAyahService = getAyahService;
    }

    private GetAyahsService getAyahsService;
    private GetAyahService getAyahService;

    @GetMapping("/ayah")
    public ResponseEntity<List<AyahDTO>> getAyah() {
        return this.getAyahsService.execute(null);
    }

    @GetMapping("/ayah/{id}")
    public ResponseEntity<AyahDTO> getAyahByID(@PathVariable Integer id) {
        return this.getAyahService.execute(id);
    }

}
