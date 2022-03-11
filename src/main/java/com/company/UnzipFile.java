package com.company;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipFile {

    String fileName;
    String xmlOriginalName;

    UnzipFile(String fileName){
        this.fileName=fileName;
    }

    public void run() {
        String zipFileName = this.fileName+".zip";
        File destDirectoryFolder = new File(".");
        if (!destDirectoryFolder.exists()) {
            destDirectoryFolder.mkdir();
        }
        byte[] buffer = new byte[1024];

        ZipInputStream zis = null;
        try {
            zis = new ZipInputStream(new FileInputStream(zipFileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        ZipEntry zipEntry = null;
        try {
            zipEntry = zis.getNextEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(zipEntry !=null) {
            String currFileName=zipEntry.getName();
            String sub=currFileName.substring(currFileName.length()-4,currFileName.length());
            if(sub.equals(".xml"))
                xmlOriginalName = currFileName;

            String filePath = "." + File.separator + currFileName;
            System.out.println("Unzipping "+filePath);
            if(!zipEntry.isDirectory()) {
                FileOutputStream fos = null;
                try {
                    fos = new FileOutputStream(filePath);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                int len=0;
                while (true){
                    try {
                        if (!((len = zis.read(buffer)) >0)) break;
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        fos.write(buffer,0,len);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            else {
                File dir = new File(filePath);
                dir.mkdir();
            }
            try {
                zis.closeEntry();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                zipEntry = zis.getNextEntry();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            zis.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            zis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Unzipping complete");
        System.out.println(".\\"+xmlOriginalName);
        System.out.println(".\\"+fileName+".xml");
        File file = new File(".\\"+xmlOriginalName);
        File rename = new File(".\\"+fileName+".xml");
        boolean flag = file.renameTo(rename);
        if (flag)
            System.out.println("File Successfully Rename");
    }

}