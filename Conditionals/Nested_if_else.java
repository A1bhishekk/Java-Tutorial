package Conditionals;
import java.util.Scanner;

public class Nested_if_else { public static void main(String[] args) {
    Scanner ip = new Scanner(System.in);

    System.out.print("Enter a Number : ");
    int a = ip.nextInt();

    if(a%2==0){
        System.out.println("Given no is Even ");
        if(a%3==0){
            System.out.println("Given no is Divisible by 6 ");
        } 
    }
    else{
        System.out.println("Given no is not Divisible by 6  ");
    }
}


    
}
