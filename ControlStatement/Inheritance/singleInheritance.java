package ControlStatement.Inheritance;
class Animal{
    void eat(){System.out.println("Eating...");}
}
class Dog extends Animal{
    void bark(){System.out.println("barking...");}
}
public class singleInheritance {
    public static void main(String args[]){
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}
