package com.mvp.view;

import java.util.Scanner;

public class PostOffice {

    public static void main(String[] args) {
        System.out.println("Hi, please enter your box for validating");
        System.out.println("first enter the length of box : ");
        Scanner scanner = new Scanner(System.in);
        float length = scanner.nextFloat();
        System.out.println("then enter the width of box : ");
        float width = scanner.nextFloat();
        System.out.println("finally enter the height of box :");
        float height = scanner.nextFloat();

        // create presenter instance in a custom view
        Window postOfficeWindow = new Window();
        postOfficeWindow.receivedBox(length, width, height);
    }
}
