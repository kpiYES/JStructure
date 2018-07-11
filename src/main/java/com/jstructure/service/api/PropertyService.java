package com.jstructure.service.api;

/**
 * Service provides simple interface for accessing java properties.
 */
public interface PropertyService {

    /**
     * Method for accessing java properties by key.
     *
     * @param key property identifier.
     * @return property value.
     */
    String getValue(String key);
}
