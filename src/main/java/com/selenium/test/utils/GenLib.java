package com.selenium.test.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GenLib {

    public Properties getPropertyFile(String property_filename) throws IOException {
        Properties prop = null;
        InputStream input_stream = null;
        try{
            prop = new Properties();
            input_stream = new FileInputStream(System.getProperty("user.dir").concat("\\src\\main\\java\\com\\selenium\\test\\properties\\").concat(property_filename));
        }catch (FileNotFoundException e){
            throw new FileNotFoundException("property file '" + property_filename + "' not found in the classpath ");
        } finally {
            if (input_stream != null){
                input_stream.close();
            }
        }
        return  prop;
    }
}
