package ControlStatement.Inheritance;

import java.lang.annotation.Retention;

class Operaation{
    int square(int n){
        return n*n;
    }
}
class Circl{
    Operaation op; // aggregation
    double pi=3.14;

    double area(int radius){
        op = new Operaation();
        int rsqare = op.square(radius);
        return pi*rsqare;
    }
}
public class Aggregaton {
    public static void main(String args[]){
        Circl cr = new Circl();
        double result = cr.area(5);
        System.out.println(result);
    }
}
