import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the staircase function below.
    static void staircase(int n) {
        int num=0;
        int space=0;
        for(int i=1; i<=n;i++){
            space=n-i;
            num=i;
            while(space>0){
                System.out.print(" ");
                space--;}
            while(num>0){
                System.out.print("#");
                num--;}    
            System.out.println();}    
        }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
