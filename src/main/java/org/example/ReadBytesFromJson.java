package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadBytesFromJson implements AutoCloseable {
    public String ReadBytesFromJson() {
        String json;
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("D:/projects/untitled/test.json");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            json = new String(inputStream.readAllBytes(), "UTF-8");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return json;
    }

    @Override
    public void close() throws IOException {

    }
}
