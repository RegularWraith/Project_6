package Homework.Task_1;

public class Calculation {
    public static int squareRectangle(int x, int y) {
        if (x < 0 || y < 0) throw new IllegalArgumentException("x or y is negative: x = " + x + ", y = " + y);
        return x * y;
    }
}
