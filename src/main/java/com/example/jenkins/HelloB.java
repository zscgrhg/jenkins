package com.example.jenkins;

import com.example.OO.Oops;
import com.example.hello.HelloA;

import java.util.Random;
import java.util.WeakHashMap;

/**
 * Created by think on 17-5-29.
 */
public class HelloB {
    HelloA helloA;
    Oops oops;

    public static void main(String[] args) {
        System.out.println(new HelloA());
    }

    public static void t2() throws InterruptedException {
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
