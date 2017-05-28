package com.example.jenkins;

/**
 * Created by think on 17-5-28.
 */
public class Anycall {
    private static Anycall ourInstance = new Anycall();

    public static Anycall getInstance() {
        return ourInstance;
    }

    private Anycall() {
    }
}
