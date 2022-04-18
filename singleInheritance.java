class AAA{
    public void show(){
        System.out.println("Parent show method");

    }
    public void display(){
        System.out.println("Parent Display method");
    }
}
class BBB extends AAA{
    public void show(){
        super.show();
        System.out.println("Chile show method");
    }
    public void msg(){
        
    }
}
public class singleInheritance {
    public static void main(String args){
        
    }
}
