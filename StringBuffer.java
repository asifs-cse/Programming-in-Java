import java.io.*;

public class StringBuffer {
    public static void main(String args[]){
        StringBuffer s1 = new StringBuffer();
        System.out.println(s1.capacity());
        System.out.println(s1.lenght);

        s1.append("abcdefghijklmnopq");
        System.out.println(s1.capacity());
        System.out.println(s1.length());
        StringBuffer s2= new StringBuffer("Welcome ");
        
        System.out.println(s2.charAt(4));
        s2.setCharAt(4, 'a');
        System.out.println(s2);

        s2.deleteCharAt(4);
        System.out.println(s2);

        s2.append(" Srinu");
        System.out.println(s2);
        
    }
    
}
