class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}
public class singleInheritance2 {
    public static void main(String args[]){
        Dog a1 = new Dog();
        a1.eat();
        a1.bark();
    }
}
