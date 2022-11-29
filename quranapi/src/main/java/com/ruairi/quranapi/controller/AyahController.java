package com.ruairi.quranapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ruairi.quranapi.model.Ayah;
import com.ruairi.quranapi.repository.AyahRepository;

@RestController
public class AyahController {

    @Autowired
    private AyahRepository ayahRepository;


    @GetMapping("/ayah/num")
    public Optional<Ayah> getAyahById(@RequestParam(value = "ayah", defaultValue = "1") int ayah) {
        return ayahRepository.findById((long) ayah);
    }

    @GetMapping("/quran")
    public List<Ayah> getSingleAyah(@RequestParam(value = "surah", defaultValue = "1") int surah, 
    @RequestParam(value = "ayah", defaultValue = "1") int ayat) {
        return ayahRepository.findBySurahAndAyah(surah, ayat);
    }


}
