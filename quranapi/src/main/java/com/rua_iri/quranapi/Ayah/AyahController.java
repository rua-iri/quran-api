package com.rua_iri.quranapi.Ayah;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rua_iri.quranapi.Ayah.Model.AyahDTO;
import com.rua_iri.quranapi.Ayah.Model.SurahDTO;
import com.rua_iri.quranapi.Ayah.services.GetAyahService;
import com.rua_iri.quranapi.Ayah.services.GetAyahsService;
import com.rua_iri.quranapi.Ayah.services.GetSurahService;
import com.rua_iri.quranapi.Ayah.services.GetSurahsService;
import com.rua_iri.quranapi.Ayah.services.SearchAyahService;

@RestController
public class AyahController {

    public AyahController(
            GetAyahsService getAyahsService,
            GetAyahService getAyahService,
            GetSurahService getSurahService,
            SearchAyahService searchAyahService,
            GetSurahsService getSurahsService) {
        this.getAyahsService = getAyahsService;
        this.getAyahService = getAyahService;
        this.getSurahService = getSurahService;
        this.searchAyahService = searchAyahService;
        this.getSurahsService = getSurahsService;
    }

    private GetAyahsService getAyahsService;
    private GetAyahService getAyahService;
    private GetSurahService getSurahService;
    private SearchAyahService searchAyahService;
    private GetSurahsService getSurahsService;

    @GetMapping("/ayah")
    public ResponseEntity<List<AyahDTO>> getAyah() {
        return this.getAyahsService.execute(null);
    }

    @GetMapping("/ayah/{id}")
    public ResponseEntity<AyahDTO> getAyahByID(@PathVariable Integer id) {
        return this.getAyahService.execute(id);
    }

    @GetMapping("/ayah/search/{keyword}")
    public ResponseEntity<List<AyahDTO>> searchAyahByKeyword(@PathVariable String keyword) {
        return this.searchAyahService.execute(keyword);
    }

    @GetMapping("/surahs")
    public ResponseEntity<List<SurahDTO>> getSurahs() {
        return this.getSurahsService.execute(null);
    }

    @GetMapping("/surah/{surahNumber}")
    public ResponseEntity<List<AyahDTO>> getSurah(@PathVariable Integer surahNumber) {
        return this.getSurahService.execute(surahNumber);
    }

}
