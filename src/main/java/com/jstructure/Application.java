package com.jstructure;

import com.jstructure.parser.api.DirectoryParser;
import com.jstructure.parser.impl.DirectoryParserImpl;
import com.jstructure.service.api.PropertyService;
import com.jstructure.service.api.WriterService;
import com.jstructure.service.impl.PropertyServiceImpl;
import com.jstructure.service.impl.WriterServiceImpl;

import javax.json.JsonObject;

/**
 * Application entry point.
 */
public class Application {

    private static PropertyService propertyService = new PropertyServiceImpl();
    private static WriterService writerService = new WriterServiceImpl();
    private static DirectoryParser directoryParser = new DirectoryParserImpl();

    public static void main(String[] args) {
        // NOTE
        // this values should be taken from property file
        // e.g. src/main/resources/application.properties
        String input = propertyService.getValue("input.path");
        String output = propertyService.getValue("output.path");


        JsonObject object = directoryParser.parse(input);
        writerService.write(object, output);
    }
}
