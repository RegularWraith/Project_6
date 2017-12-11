package Homework.Task_3;

import java.util.Scanner;

import static Homework.Task_3.Calculation.div;

public class Main {
    public static void main(String[] args) {
        double result = 0;
        Scanner sc = new Scanner(System.in);
        double x = sc.nextInt();
        double y = sc.nextInt();
        try{
            result = div(x,y);
        }catch(IllegalArgumentException e){
            System.err.println(e.getMessage() + "\n" + "In the area calculation method," +
                    " an argument with value 'zero' was inputed!" + "\n");
            e.printStackTrace();
            throw e;

        }
        System.out.println("Result is : " + result);
    }
}
