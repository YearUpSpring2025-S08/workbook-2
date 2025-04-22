package com.pluralsight;

public class Counting {

    public static void main(String[] args) throws InterruptedException {

        int i = 1;
        int sum = 0;
        while (i <= 10) {
            sum += i;

            System.out.println("i = " + i);
            System.out.println("sum = " + sum);
            System.out.println();

            Thread.sleep(1000);

            i++;
        }
        System.out.println("------------------------------");
        System.out.println("Sum = " + sum);

    }
}
