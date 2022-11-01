package Taking_Input;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Principal : ");
        float p = ip.nextFloat();
        System.out.print("Enter Rate : ");
        float r = ip.nextFloat();
        System.out.print("Enter Time : ");
        float t = ip.nextFloat();
        float si = (p*r*t)/100;
        System.out.println("Simple Interest is : $"+si);
        System.out.println("Total Amount id : $"+(si+p));
        
    }
    
    
}
