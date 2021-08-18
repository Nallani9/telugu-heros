package com.nallani.teluguheros.service;

import org.springframework.stereotype.Service;

import java.io.*;
import java.util.List;
import java.util.logging.Logger;

@Service
public class OutputFile {

    private static final Logger logger = Logger.getLogger(OutputFile.class.getName());

    public void writeFileToOutput(List<String> fileContent, String fileName) throws IOException {
        String newFileName = fileName.substring(0, fileName.length() - 4);

        File fout = new File(newFileName + "Object.txt");
        FileOutputStream fos = new FileOutputStream(fout);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
        for (int i = 0; i < fileContent.size(); i++) {
            bw.write(fileContent.get(i));
            bw.newLine();
        }
        bw.close();
        logger.info("file write completed successfully");
    }
}
