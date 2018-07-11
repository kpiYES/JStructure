package com.jstructure.parser.api;

import javax.json.JsonObject;

/**
 * Service translates system directory structure into readable JSON format.
 */
public interface DirectoryParser {

    /**
     * Parses directory structure starting from path root in JSON format.
     *
     * @param path directory location in the system.
     * @return JSON object which represents the directory structure.
     */
    JsonObject parse(String path);
}
