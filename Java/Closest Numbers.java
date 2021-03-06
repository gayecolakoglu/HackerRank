import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the closestNumbers function below.
    static int[] closestNumbers(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[arr.length-1];
        List<Integer> list=new ArrayList<Integer>();  
        for(int i=0;i<arr.length-1;i++){
           if(arr[i+1]-arr[i]  <= diff){
                diff = arr[i+1]-arr[i];
           }
        }
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]==diff){
                list.add(arr[i]);
                list.add(arr[i+1]);
            }
        }
         int[] A=new int[list.size()];
        for(int x=0 ;x<list.size();x++){
            A[x]=list.get(x);
        }
        return A;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = closestNumbers(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
