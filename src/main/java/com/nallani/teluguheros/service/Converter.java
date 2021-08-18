package com.nallani.teluguheros.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nallani.teluguheros.model.Info;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.LinkedList;

@Service
public class Converter {

    LinkedList<String> ls = new LinkedList<>();

    public void convertToJson(Info info, String fileName) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            String jsonStr = mapper.writeValueAsString(info);
            System.out.println(jsonStr);
            ls.add(jsonStr);
            OutputFile outputFile = new OutputFile();
            outputFile.writeFileToOutput(ls, fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
