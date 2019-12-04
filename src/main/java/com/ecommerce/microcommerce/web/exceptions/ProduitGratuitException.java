package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@ResponseStatus(HttpStatus.NOT_IMPLEMENTED)
public class ProduitGratuitException extends RuntimeException {

    public ProduitGratuitException(String s) {
        super(s);
    }
}