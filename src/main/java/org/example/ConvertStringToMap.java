package org.example;

import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ConvertStringToMap {
    public void ConvertStringToMap(String json) {
        Map map = null;
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            map = objectMapper.readValue(json, HashMap.class);
            System.out.println(map.values());
            LinkedHashMap m = (LinkedHashMap) map.get("book");
            System.out.println(m.get("id"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
