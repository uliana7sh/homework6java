package org.example;

import java.util.Scanner;

public class Main1 {
    public static void main (String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter pls your Name");
        String name=scanner.nextLine();
        System.out.println("Hello ,"+ name + "!");
        scanner.close();
    }
}
