package Homework.Task_4;

import java.util.Scanner;

class Calculation {

    Scanner sc = new Scanner(System.in);
    int start = sc.nextInt();
    int end = sc.nextInt();

    public static int readNumber(int start, int end) {
        if (start < 0 || end < 0) throw new IllegalArgumentException("start or end is negative:" +
                " start = " + start + ", end = " + end);

        return x / y;
    }
}

