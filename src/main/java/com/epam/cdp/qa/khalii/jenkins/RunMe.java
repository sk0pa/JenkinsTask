package com.epam.cdp.qa.khalii.jenkins;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import org.apache.commons.io.FileUtils;
import java.util.Properties;

public class RunMe {
  public static void main(String[] args) throws IOException {
    Properties properties = new Properties();
    properties.load(RunMe.class.getClassLoader().getResourceAsStream("properties.ini"));
    FileUtils.copyURLToFile(new URL(properties.getProperty("url")), new File(properties.getProperty("path")));
  }
}
