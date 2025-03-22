package com.rua_iri.quranapi;

import org.springframework.http.ResponseEntity;

public interface Query<I, O> {

    ResponseEntity<O> execute(I input);

}
