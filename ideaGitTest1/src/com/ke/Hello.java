package com.ke;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Git Test!");

        int x = 1;
        int y = 2;
        System.out.println(x + "+" + y + "=" + add(x, y));
    }

    /**
     * 加法
     */
    private static int add(int x, int y) {
        return x + y;
    }
}
