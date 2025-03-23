package com.rua_iri.quranapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class SurahNotFoundException extends RuntimeException {

    public SurahNotFoundException() {
        super(ErrorMessages.SURAH_NOT_FOUND.getMessage());
    }

}
