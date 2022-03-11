package com.company;

import jakarta.xml.bind.JAXBException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws JAXBException {

        String link = "https://leidata.gleif.org/api/v1/concatenated-files/rr/20210930/zip";
        String fileName = "db";
        File out = new File(fileName+".zip");
        new Download(link, out).run();
        new UnzipFile(fileName).run();

        try {
            boolean result = Files.deleteIfExists(Paths.get(fileName+".zip"));
            if (result) {
                System.out.println("File is deleted!");
            } else {
                System.out.println("Sorry, unable to delete the file.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            DbJAXB.unmarshall("db.xml");
        } catch (JAXBException e) {
            e.printStackTrace();
        }




    }
}
