package com.rua_iri.quranapi.Ayah.Model;

import lombok.Data;

@Data
public class SurahDTO {

    private Integer id;
    private Integer surah; // 1
    private String surrahname; // سُورَةُ الفَاتِحَةِ

    public SurahDTO(Ayah ayah) {

        this.id = ayah.getId();
        this.surah = ayah.getSurah();
        this.surrahname = ayah.getSurrahname();

    }

}
