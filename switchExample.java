import java.io.*;
import java.util.Scanner;
public class switchExample {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n;
        System.out.print("Enter any number 1 to 5: ");
        n = input.nextInt();

        switch(n){
            case 1: System.out.println("One");
            break;
            case 2: System.out.println("Two");
            break;
            case 3: System.out.println("Three");
            break;
            case 4: System.out.println("Four");
            break;
            case 5: System.out.println("Five");
            break;
        }
    }
    
}
