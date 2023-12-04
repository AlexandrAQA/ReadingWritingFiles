package com.aqa;

import org.testng.annotations.Test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles {

    @Test
    public void WritingFilesTests() throws IOException {
        //Stream connection
        File file = new File("C:\\My_Files\\java_projects\\ReadingWritingFiles\\files\\test.txt");
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter writer = new BufferedWriter(fileWriter);

        //writing inside the file
        writer.write("First line");
        writer.newLine();
        writer.write("Second Line");
        writer.newLine();
        writer.write("Third Line");

        //closing stream
        writer.close();


    }
}
