package ControlStatement;
import java.util.Scanner;
public class TernaryOperator {
    public static void main(String args[]){
        int num; //create variable
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        System.out.println(num%2==0? "Ever numer":"Odd number");
    }
}
