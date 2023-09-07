package com.epam.utils;

public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        //code!
        try {
            return Double.parseDouble(str) > 0;
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
    }
}
