

import java.io.*;

class checkWord{
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str1,str2;

        str1= br.readLine();
        str2 = br.readLine();
        if(str1.contains(str2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}