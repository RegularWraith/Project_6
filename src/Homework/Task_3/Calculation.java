package Homework.Task_3;

public class Calculation {
    public static double div(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("divisor is 0");
        }
    return x / y;
}
}
