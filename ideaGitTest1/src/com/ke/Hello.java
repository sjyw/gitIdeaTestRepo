package com.ke;

public class Hello {

    public static void main(String[] args) {
        System.out.println("Hello Git Test!");

        int x = 1;
        int y = 2;
        System.out.println(x + "+" + y + "=" + add(x, y));
        System.out.println(x + "-" + y + "=" + sub(x, y));
        System.out.println(x + "-" + y + "=" + sub(x, y));
    }

    /**
     * 加法
     */
    private static int add(int x, int y) {
        return x + y;
    }

    /**
     * 减法
     */
    private static int sub(int x, int y) {
        return x - y;
    }
}
