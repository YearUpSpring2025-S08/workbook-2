package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CellPhone phone = new CellPhone();

        System.out.println("Serial Number: ");

        phone.setSerialNumber(Integer.parseInt((scanner.nextLine())));

        System.out.println("Model: ");
        phone.setModel(scanner.nextLine());

        System.out.println("carrier: ");
        phone.setCarrier(scanner.nextLine());

        System.out.println("phonenumber: ");
        phone.setPhoneNumber(scanner.nextLine());

        System.out.println("owner: ");
        phone.setOwner(scanner.nextLine());

        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());


        phone.dial("212-555-9999");
        phone.dial("600-400-0000");


    }
}