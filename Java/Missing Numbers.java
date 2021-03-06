import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the missingNumbers function below.
    static int[] missingNumbers(int[] arr, int[] brr) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        
        for(int i=0; i<brr.length;i++){
            if(myMap.containsKey(brr[i])){
                myMap.put(brr[i],myMap.get(brr[i])+1);
            }else{myMap.put(brr[i],1);}
        }
        for(int i=0; i<arr.length;i++){
            if(myMap.containsKey(arr[i])){
                if(myMap.get(arr[i])-1==0){
                    myMap.remove(arr[i]);
                }else{
                myMap.put(arr[i],myMap.get(arr[i])-1);
                }
            }
        }
        
        for(int i : myMap.keySet()) {
            while(myMap.get(i)>1){
                myMap.put(i,myMap.get(i)-1);
            }
        }
        

        int[] res = new int[myMap.size()];
        int k=0;
        for(int i : myMap.keySet()){
            res[k] = i;
            k++;
        }
        Arrays.sort(res);

        return res;

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

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] brr = new int[m];

        String[] brrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int brrItem = Integer.parseInt(brrItems[i]);
            brr[i] = brrItem;
        }

        int[] result = missingNumbers(arr, brr);

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
