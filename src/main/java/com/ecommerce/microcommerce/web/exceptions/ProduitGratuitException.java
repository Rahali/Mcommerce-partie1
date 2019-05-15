package com.ecommerce.microcommerce.web.exceptions;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
public class ProduitGratuitException extends RuntimeException {

    public ProduitGratuitException(String s) {
        super(s);
    }
}
