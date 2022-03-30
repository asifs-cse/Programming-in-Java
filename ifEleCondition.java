package ControlStatement;
import java.util.Scanner;
public class ifEleCondition {
    public static void main(String arge[]){
        int num;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number: ");
        num = input.nextInt();

        if(num%2==0){
            System.out.println("Even number!");
        }else{
            System.out.println("Odd number!");
        }
    }
}
