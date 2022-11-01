package Conditionals;

import java.util.Scanner;

public class If_Else {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int a = ip.nextInt();

        if(a%2==0){
            System.out.println("Given no is Even ");
        }
        else{
            System.out.println("Given no is Odd  ");
        }
    }

}
