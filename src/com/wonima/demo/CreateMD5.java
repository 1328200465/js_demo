package com.wonima.demo;


import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


/**
 * Java实现MD5加密算法（使用MessageDigest）
 * MD5加密算法，即"Message-Digest Algorithm 5 (信息-摘要算法)"，它由MD2、MD3、
 * MD4发展而来的一种单向函数算法（也就是HASH算法），它是国际著名的公钥加密算法标准RSA的第一设计者
 * R.Rivest于上个世纪90年代初开发而来的。MD5的最大作用在于，将不同格式的大容量文件信息在用数字签名
 * 软件来签署私人秘钥前"压缩"成一种保密格式，关键之处在于--这种"压缩"是不可逆的。Java JDK已经自带
 * 了MD5的实现，只要简单调用下就可以。
 *
 * @author Administrator
 */
public class CreateMD5 {

    //静态方法，便于工具类
    public static String getMd5(String plainText) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte b[] = md.digest();

            int i;

            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            //32位加密
            return buf.toString();
            // 16位的加密
            // return buf.toString().substring(8,24);
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        //测试
        System.out.println(CreateMD5.getMd5("hello"));
    }
}

