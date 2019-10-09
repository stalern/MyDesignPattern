package com.stalern.util;

/**
 * 对字符串的工具类
 * @author stalern
 * @date 2019/10/5--19:36
 */
public class StringUtils {
    private StringUtils(){}
    public static boolean isBlank(String str) {
        int strLen = length(str);
        if (strLen == 0) {
            return true;
        }
        for (int i = 0; i < strLen; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    private static int length(String str) {
        return str == null ? 0 : str.length();
    }
}