package Conditionals;

import java.util.Scanner;

public class AgeGroup {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter Your age : ");
        int a = ip.nextInt();

        if(a<=12){
            System.out.println("You are a Child ");
        }
        else if(a>12 && a<=18){
            System.out.println("You can drive a bike ");
        }
        else{
            System.out.println("You can drive a car  ");
        }
    }
    
}
