
import java.util.Scanner;
import java.io.*;
public class checkWordNumber {
    public void main(String args[])throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner in = new Scanner(System.in);
        String input;
        input= br.readLine();
        String words[] = input.split(" ");

        for(int i =0;i<words.length; i++){
            System.out.print("Word"+(i+1)+"-"+words[i].length());
        }

    }
    
}
