package com.codelens.darajaapi.utils;

import lombok.extern.slf4j.Slf4j;
import org.bson.internal.Base64;

import java.io.UnsupportedEncodingException;

@Slf4j
public class HelperUtility {

    /**
     * @param value the value to be converted to a base64 string
     * @return returns base64String
     */
    public static String toBase64String(String value) {
        try {
            byte[] data = value.getBytes("ISO-8859-1");
            return Base64.encode(data);
        } catch (UnsupportedEncodingException e) {
            log.error(String.format("UnsupportedEncodingException -> %s", e.getLocalizedMessage()));
            return null;
        }
    }
}
