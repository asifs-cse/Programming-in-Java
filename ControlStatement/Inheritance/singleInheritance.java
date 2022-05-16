package ControlStatement.Inheritance;
class Animal{
    void eat(){System.out.println("Eating...");} //base class method
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");} //sub class method
}
public class singleInheritance {
    public static void main(String args[]){
        Dog d = new Dog(); //create object
        d.bark(); //class sub class method
        d.eat(); //call base class method
    }
}
