package com.aqa;

import org.testng.annotations.Test;

import java.io.*;

public class ReadingFiles {
    @Test
    public void readingFilesTest(){
        File file = new File
                ("C:\\My_Files\\java_projects\\ReadingWritingFiles\\files\\test.txt");
        try {
            //connecting Streams
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            //read text file
            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            //closing
            bufferedReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
