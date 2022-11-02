package Practice_Set;

import java.util.Scanner;

public class Fibonacci_Series {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = ip.nextInt();
        int a=0,b=1,c;
        // System.out.println(a);
        // System.out.println(b);
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
    
}
