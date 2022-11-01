package Taking_Input;

import java.util.*;

public class Input {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter Your Name : ");
        String name = ip.nextLine();
        System.out.print("Enter Your Age : ");
        int age = ip.nextInt();
        System.out.println("Your Name is "+name+" and your age is "+age);
    }
}
