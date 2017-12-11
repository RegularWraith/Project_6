package Homework.Task_4;

import  java.util.Random;

public class Main {
    public static void main(String[] args) {
        int end = 100;
        int start = 1;
        Random randomNum = new Random();
        int numbers[] = new int[10];
        int i;

        try {
            int number = Integer.parseInt(yourString);

        } catch (NumberFormatException ex) {
            System.out.println("Not a valid number!");
        } catch(IllegalArgumentException e){
            System.err.println(e.getMessage() + "\n" + "In the area calculation method," +
                    " an argument with a negative value was inputed!" + "\n");
            e.printStackTrace();

            throw e;
        }

        for (i = 0; i < numbers.length; i++) {
            numbers[i] = start + randomNum.nextInt(end);
        }
        System.out.println("Result is : " + numbers[i]);
    }
}
