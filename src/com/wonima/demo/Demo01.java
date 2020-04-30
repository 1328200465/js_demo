package com.wonima.demo;

import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * 对字符串进行加密
 *
 * @param str 待加密的字符串
 * @return 加密后的字符串
 * @throws NoSuchAlgorithmException  没有这种产生消息摘要的算法
 * @throws UnsupportedEncodingException
 */
public class Demo01 {

    public static String EncoderByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定算法
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        BASE64Encoder base64en = new BASE64Encoder();
        //加密后的字符串
        String newstr = base64en.encode(md5.digest(str.getBytes("utf-8")));
        return newstr;
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {

        byte[] b = "中".getBytes("utf-8");
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
        byte[] a = new byte[4];
        byte[] b_gbk = "深".getBytes("GBK");
        byte[] b_utf8 = "深".getBytes("UTF-8");
        byte[] b_iso88591 = "深".getBytes("ISO8859-1");
        byte[] b_unicode = "深".getBytes("unicode");

        for (int x = 0; x < a.length; x++) {
            System.out.println(a[x]); //通过循环控制索引
        }

        String s_gbk = new String(b_gbk, "GBK");
        String s_utf8 = new String(b_utf8, "UTF-8");
        String s_iso88591 = new String(b_iso88591, "ISO8859-1");
        String s_unicode = new String(b_unicode, "unicode");

        MessageDigest md5 = MessageDigest.getInstance("MD5");
        String str = "0123456789";
        System.out.println(b_gbk);
        System.out.println(b_utf8);
        System.out.println(b_iso88591);
        System.out.println(b_unicode);

        System.out.println(s_gbk);
        System.out.println(s_utf8);
        System.out.println(s_iso88591);
        System.out.println(s_unicode);
        System.out.println(str);
        System.out.println(str.getBytes("utf-8"));
        System.out.println(md5.digest(str.getBytes("utf-8")));
        System.out.println(EncoderByMd5(str));
    }
}