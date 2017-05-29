package com.example.hello;

import com.example.OO.Oops;
import com.example.jenkins.HelloB;

import java.util.Random;
import java.util.WeakHashMap;

/**
 * Created by think on 17-5-29.
 */
public class HelloA {
    HelloB helloB;
    Oops oops;

    public static void main(String[] args) {
        System.out.println(new HelloB());
    }

    public static void t1() throws InterruptedException {
        WeakHashMap<String, byte[][]> d = new WeakHashMap<String, byte[][]>();
        for (int i = 0; i < 100; i++) {

            int i1 = new Random().nextInt(10000);
            String key = String.valueOf(i1);
            d.put(key, new byte[100][100]);

            //System.out.println(d.size());
            System.gc();
            Thread.sleep(100);
        }
        System.out.println(d.size());
    }
}
