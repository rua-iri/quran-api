package com.ruairi.quranapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "quran")
public class Ayah {

    private long id;
    private int surah;
    private int ayah;
    private String surahName;
    private String textContent;
    private int pageNum;
    

    public Ayah() {

    }

    public Ayah(long id, int ayah, int surah, String surahName, String textContent, int pageNum) {
        this.id = id;
        this.ayah = ayah;
        this.surah = surah;
        this.surahName = surahName;
        this.textContent = textContent;
        this.pageNum = pageNum;
    }

    @Id
    @Column(name = "index")
    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "surah")
    public int getSurah() {
        return this.surah;
    }

    public void setSurah(int surah) {
        this.surah = surah;
    }

    @Column(name = "ayah")
    public int getAyah() {
        return this.ayah;
    }

    public void setAyah(int ayah) {
        this.ayah = ayah;
    }

    @Column(name = "surrahname")
    public String getSurahName() {
        return this.surahName;
    }

    public void setSurahName(String surahName) {
        this.surahName = surahName;
    }

    @Column(name = "ayah_text")
    public String getTextContent() {
        return this.textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    @Column(name = "page")
    public int getPageNum() {
        return this.pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

}
