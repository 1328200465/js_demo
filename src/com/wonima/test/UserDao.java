package com.wonima.test;

import org.springframework.web.servlet.ModelAndView;


public class UserDao {
    /**
     * 加密解密算法 执行一次加密，两次解密
     */
    public static String convertMD5(String inStr) {

        char[] a = inStr.toCharArray();
        for (int i = 0; i < a.length; i++) {
            a[i] = (char) (a[i] ^ 't');
        }
        String s = new String(a);
        return s;
    }

    public Integer login(UserDto userDto) {
        //
        return login(userDto);
    }

    public ModelAndView insertUser(UserDto userDto) {

        return insertUser(userDto);
    }

    /*
     * 验证用户名
     */
    public ModelAndView authUser(UserDto userDto) {

        return authUser(userDto);
    }
}
