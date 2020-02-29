package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Starting project");
        boolean one = true;
        int two = 1;
        byte three = 0;
        long four = 123456;
        char five = 'c';
        float six = 2/3;
        double seven = 2/3;
        String eight = "sdaasd";
        System.out.println("bool: " + one +
                ", int: " + two +
                ", byte: " + three +
                ", long: " + four +
                ", char: " + five +
                ", float: " + six +
                ", double: " + seven +
                ", string: " + eight
        );

        byte v_byte = 120;
        short v_short = 129;
        char v_char = 'a';
        int v_int = 65999;
        long v_long = 4294967296l;
        float v_float = 0.33333334f;
        double v_double1 = 0.3333333333333333;
        double v_double2 = true ? 1 : 0;

        for (char ch = 'a'; ch <= 'z'; System.out.print(ch++ + " "));

        long begin = new java.util.Date().getTime();
        for (int i = 0; i < 100000000; i++);
        long end = new java.util.Date().getTime();
        System.out.println("\nint loop: " + (end - begin));

        begin = new java.util.Date().getTime();
        for (long i = 0; i < 100000000; i++);
        end = new java.util.Date().getTime();
        System.out.println("long loop: " + (end - begin));

        int[] mas = {12,43,12,-65,778,123,32,76};

        int max = Integer.MIN_VALUE;
        for (int num : mas) {
            max = Math.max(max, num);
        }
        System.out.println(max);
    }
}
