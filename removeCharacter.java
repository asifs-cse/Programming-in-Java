import java.io.*;
public class removeCharacter {
    public static void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word, word2="";
        word = br.readLine();
        
        char ch[]=word.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(Character.isLetter(ch[i])) word2=word2+ch[i];
        }
        System.out.println(word2);
    }
}
