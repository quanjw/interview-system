package com.quanjiawei.utils;

//import sun.misc.BASE64Encoder;
import java.security.MessageDigest;
import java.util.Base64;

public class MD5Util {

    /**
     * 密码加密
     * @param password
     * @return
     * @throws Exception
     */
    public static String  md5(String password){
        try {
            //1.创建加密对象
            MessageDigest md5 = MessageDigest.getInstance("md5");
            //2.加密密码
            byte[] by = md5.digest(password.getBytes());
            //3.创建编码对象
            //BASE64Encoder encoder = new BASE64Encoder();
            // return encoder.encode(by);
            Base64.Encoder encoder = Base64.getEncoder();
            //4.对结果编码
            return encoder.encodeToString(by);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
