package com.rua_iri.quranapi.Ayah.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "quran")
public class Ayah {

    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "surah")
    private Integer surah; // 1

    @Column(name = "ayah")
    private Integer ayah; // 0

    @Column(name = "ayah_text")
    private String ayah_text; // سُورَةُ الفَاتِحَةِ

    @Column(name = "ayah_text_no_diacratic")
    private String ayah_text_no_diacratic; // سورة الفاتحة

    @Column(name = "hash")
    private String hash; // 22b81fd12c136d4cf67a37de941908d83eaf8e97571c4983f9308d30d52ad8f9

    @Column(name = "hizb")
    private Double hizb; // 0.25

    @Column(name = "page")
    private Integer page; // 1

    @Column(name = "pagehindi")
    private Integer pagehindi; // ١

    @Column(name = "index")
    private Integer index; // 1

    @Column(name = "surrahname")
    private String surrahname; // سُورَةُ الفَاتِحَةِ

    @Column(name = "surrahname_no_diacratic")
    private String surrahname_no_diacratic; // سورة الفاتحة

    @Column(name = "chapter")
    private Integer chapter; // 1

    @Column(name = "sajdah")
    private Integer sajdah; // 0

}
