package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter pls Radius: ");
        double radius=scanner.nextDouble();
        double area=3.14*(radius*radius);
        System.out.println("The Area of a circle with Radius:"+radius +"is "+area );

    }

}
