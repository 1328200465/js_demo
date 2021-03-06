package com.wonima.demo;

import java.math.BigInteger;
import java.security.MessageDigest;


/**
 * Java三行代码搞定MD5加密
 * <p>
 * 对字符串md5加密
 *
 * @param str
 * @return
 */
public class MD5Demo {
    public static String getMD5(String str) throws SpeedException {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(str.getBytes());
            // digest()最后确定返回md5 hash值，返回值为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示，得到字符串形式的hash值
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            throw new SpeedException("MD5加密出现错误");
        }
    }

    public static void main(String[] args) throws SpeedException {
        System.out.println(getMD5("123456"));
        ;
    }
}
