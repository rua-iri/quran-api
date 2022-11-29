package com.ruairi.quranapi.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AyahController {

    @GetMapping("/ayah")
    public Ayah ayah(@RequestParam(value="ayah", defaultValue="1") String ayah) {
        return new Ayah(10, ayah);
    }

    
}
