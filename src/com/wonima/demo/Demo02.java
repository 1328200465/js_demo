package com.wonima.demo;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

/**
 * 判断用户密码是否正确
 *
 * @param newpasswd 用户输入的密码
 * @param oldpasswd 数据库中存储的密码－－用户密码的摘要
 * @return
 * @throws NoSuchAlgorithmException
 * @throws UnsupportedEncodingException
 */
public class Demo02 {

    public static boolean checkpassword(String newpasswd, String oldpasswd) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        if (Demo01.EncoderByMd5(newpasswd).equals(oldpasswd)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        System.out.println("old:" + Demo01.EncoderByMd5("123"));
        System.out.println("new:" + Demo01.EncoderByMd5("123456789"));
        System.out.println(checkpassword("123", Demo01.EncoderByMd5("123")));

    }
}
//        old:ICy5YqxZB1uWSwcVLSNLcA==
//        new:JfnnlDI7RTiF9RgfG2JNCw==
//        true