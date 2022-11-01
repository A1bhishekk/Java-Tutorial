package Conditionals;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=ip.nextInt();

        String ans;
        ans = (num%2==0) ? "Even" : "Odd";
        System.out.println(ans);
    }

    
}
