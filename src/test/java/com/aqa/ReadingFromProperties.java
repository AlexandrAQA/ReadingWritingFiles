package com.aqa;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingFromProperties {
    public static final String filePath = (System.getProperty("user.dir") + "\\src\\file.properties");

    @Test
    public void firstTest() throws IOException {
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(filePath);
        properties.load(fileInputStream);
        System.out.println(properties.getProperty("dob"));
    }
}

