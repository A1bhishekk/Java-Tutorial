package Loops;

import java.util.Scanner;

public class NoOfDigit {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = ip.nextInt();
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        System.out.println(count);
    }
    
    
}
