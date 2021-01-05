package com.codelens.darajaapi.utils;

import lombok.extern.slf4j.Slf4j;
import org.bson.internal.Base64;

import java.nio.charset.StandardCharsets;

@Slf4j
public class HelperUtility {

    /**
     * @param value the value to be converted to a base64 string
     * @return returns base64String
     */
    public static String toBase64String(String value) {
        byte[] data = value.getBytes(StandardCharsets.ISO_8859_1);
        return Base64.encode(data);
    }
}
