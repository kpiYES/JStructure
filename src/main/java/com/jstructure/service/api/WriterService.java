package com.jstructure.service.api;

import javax.json.JsonObject;

/**
 * Service for persisting JSON objects.
 */
public interface WriterService {

    /**
     * Writes given object to file.
     *
     * @param object JSON object to persist.
     * @param path   output path.
     */
    void write(JsonObject object, String path);
}
