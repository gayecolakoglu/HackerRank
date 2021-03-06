import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
       String result=new String("");
       if(String.valueOf(s.charAt(s.length()-2)).equals("A")){
           if(s.substring(0,2).equals("12")){
               result+="00"+s.substring(2,s.length()-2);
           }else{result+=s.substring(0,s.length()-2);}
       }
       else{
           if(s.substring(0,2).equals("12")){
           result+=s.substring(0,s.length()-2); }
           else{
               result+=Integer.parseInt(s.substring(0,2))+12+s.substring(2,s.length()-2);
           }
       }
    return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
