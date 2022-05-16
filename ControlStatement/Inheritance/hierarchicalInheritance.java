package ControlStatement.Inheritance;
class Animal{
    void eat(){System.out.print("eating");}
}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}
class Cat extends Animal{
    void meow(){
        System.out.println("meow");
    }
}
public class hierarchicalInheritance {
    public static void main(String args[]){
        Cat c = new Cat();
        Dog d = new Dog();

        c.eat();
        c.meow();
        d.eat();
        d.bark();
    }
}
