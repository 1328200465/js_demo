package com.wonima.test;

import com.google.common.base.Strings;
import com.wonima.jiami.BASE64;
import lombok.SneakyThrows;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

public class test01 {
    //HMAC
    private final static String KEY_MAC = "HmacMD5";
    private final static String[] hexDigits = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public test01() {

    }

    //BASE64
    @SneakyThrows
    public static byte[] decryptBASE64(String key) {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    public static String encryptBASE64(byte[] key) {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    public static String encryptBase64(byte[] key) {
        return (new BASE64Encoder()).encodeBuffer(key);
    }

    @SneakyThrows
    public static byte[] decryptBase64(String key) {
        return (new BASE64Decoder()).decodeBuffer(key);
    }

    public static String encryptHMAC(String data, String key) {
        if (Strings.isNullOrEmpty(data)) {
            return null;
        }
//    byte[] bytes=encryptHMAC(data.getBytes(),key);
        return null;
    }

    private static String ByteArrayToHexString(byte b) {
        int ret = b;
        if (ret < 0) {
            ret += 256;
        }
        int m = ret / 16;
        int n = ret % 16;
        return hexDigits[m] + hexDigits[n];
    }

    private static String byteArrayToHexString(byte[] bytes) {
        return null;
    }


    @SneakyThrows
    public static void main(String[] args) {
//    BASE64
        String str = "12345678";
        String result1 = BASE64.encryptBASE64(str.getBytes());
        System.out.println("result1=============加密数据=====>>" + result1);
        byte result2[] = BASE64.decryptBASE64(result1);
        String str2 = new String(result2);
        System.out.println("str2======解密数据=======>>" + str2);
    }

}