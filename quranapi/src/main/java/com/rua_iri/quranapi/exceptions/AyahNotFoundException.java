package com.rua_iri.quranapi.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class AyahNotFoundException extends RuntimeException {

    public AyahNotFoundException() {
        super(ErrorMessages.AYAH_NOT_FOUND.getMessage());
    }

}
