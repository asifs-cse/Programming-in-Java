package ControlStatement.Inheritance;
class Animal{
    void eat(){System.out.println("Eatingn...");}
}
class Dog extends Animal{
    void bark(){System.out.println("Barking");}
}
class BabyDog extends Dog{
    void weep(){System.out.println("weeping...");}
}
public class multiLevelInheritance {
    public static void main(String args[]){
        BabyDog bd = new BabyDog();
        bd.eat();
        bd.bark();
        bd.weep();
    }
}
