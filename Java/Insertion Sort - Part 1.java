import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the insertionSort1 function below.
    static void insertionSort1(int n, int[] arr) {
        int temp=arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(temp<arr[i]){
                arr[i+1]=arr[i];
            } 
            else{
                arr[i+1]=temp;
                break;
            }
            for(int y:arr){
                System.out.print(y+" ");
        }
            System.out.println(" ");
            
        }if(arr[0]>temp){
            arr[0] = temp;
        }
        for(int a : arr){
                System.out.print(a+" ");
                }
            System.out.println();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
