import java.io.BufferedReader;
import java.io.InputStreamReader;

public class removeChareacter2 {
    public static void main(String args[]) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        int sum =0, i=0;

        str1 = br.readLine();
        char ch[] = str1.toCharArray();

        for(i=0; i<ch.length; i++){
            if(Character.isDigit(ch[i])) 
                //sum= sum+Integer.parseInt(ch[i]+""); 
                sum = sum+(ch[i]-48);
        }
        System.out.print(sum);
    }
    
}
