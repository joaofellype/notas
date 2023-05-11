package com.teste.notas.core.domain.shared.validators;

import com.teste.notas.core.domain.shared.exceptions.DomainException;

public class ObjectValidator {

    private ObjectValidator() {
        throw new IllegalStateException("Object Validator");
    }

    public static void isNullAndThrow(Object obj, String message){
        if(obj == null)
            throw new DomainException(message);

    }
}
