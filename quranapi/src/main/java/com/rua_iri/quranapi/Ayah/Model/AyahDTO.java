package com.rua_iri.quranapi.Ayah.Model;

import lombok.Data;

@Data
public class AyahDTO {
    private Integer id;
    private Integer surah; // 1
    private Integer ayah; // 0
    private String surrahname; // سُورَةُ الفَاتِحَةِ
    private String ayah_text; // سُورَةُ الفَاتِحَةِ
    private String ayah_text_no_diacratic; // سورة الفاتحة
    private Double hizb; // 0.25

    public AyahDTO(Ayah ayah) {
        this.id = ayah.getId();
        this.surah = ayah.getSurah();
        this.ayah = ayah.getAyah();
        this.surrahname = ayah.getSurrahname();
        this.ayah_text = ayah.getAyah_text();
        this.ayah_text_no_diacratic = ayah.getAyah_text_no_diacratic();
        this.hizb = ayah.getHizb();
    }

}
