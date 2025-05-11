package org.example.common;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class Context {

    private Map<String, String> context = new HashMap<>();


    public void put(String key, String value) {
        context.put(key, value);
    }

    public String get(String key) {
        return context.get(key);
    }
}
