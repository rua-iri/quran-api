package com.rua_iri.quranapi.exceptions;

public enum ErrorMessages {
    AYAH_NOT_FOUND("Ayah not found"),
    SURAH_NOT_FOUND("Surah not found");

    private final String message;

    ErrorMessages(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
