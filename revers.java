import java.io.BufferedReader;
import java.io.InputStreamReader;

public class revers {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //input object
        String str1, str2="";
        int i;
        str1 = br.readLine(); 
        char ch[]=str1.toCharArray();
        for(i=ch.length; i>=0; i--){
            str2 = str2+ch[i];
        }
        System.out.print(str2);
    }
    
}
