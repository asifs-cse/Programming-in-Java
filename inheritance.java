class Employee{
    float salary = 40000;
}
public class inheritance extends Employee{
    int bonus = 10000;
    public static void main(String args){

        inheritance p = new inheritance();

        System.out.println("Programmer salary is: "+p.bonus);
        System.out.println("Programmer salary is: "+p.salary);

    }
}
