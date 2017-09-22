package com.example.administrator.dabao;

import org.junit.Test;

/**
 * Created by Administrator on 2016-10-15.
 */

public class MyTest {
    @Test
    public void getResult(){
        String str="中国A";
        String str1="A";

        byte[] bytes1=str1.getBytes();
        byte[] bytes=str.getBytes();

        int length1=bytes1.length;
        int length=bytes.length;
        System.out.print(length1+"  "+length+"str.length()="+str.length()+"  str1.length()="+str1.length());
    }
}
