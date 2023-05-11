package com.teste.notas.core.domain.shared.helpers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectMapperJson {
    private ObjectMapperJson() {
        throw new IllegalStateException("Utility class");
    }

    public static String toStringJson(Object object) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.writeValueAsString(object);

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }
}
