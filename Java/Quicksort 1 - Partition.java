import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the quickSort function below.
    static int[] quickSort(int[] arr) {
        int p=arr[0];
        int[]result=new int[arr.length];
        ArrayList<Integer> rlist =new ArrayList<>();
        ArrayList<Integer> right =new ArrayList<>();
        ArrayList<Integer> left =new ArrayList<>();
        ArrayList<Integer> equal =new ArrayList<>();
        for (int i=1;i<arr.length;i++){
            if (arr[i]<p){
                left.add(arr[i]);
            }else if(arr[i]>p){
                right.add(arr[i]);
            }else{equal.add(arr[i]);}
        }
    for(int i=0; i<left.size();i++){
        rlist.add(left.get(i));
    }
    for(int i=0; i<equal.size();i++){
        rlist.add(equal.get(i));
    }
    rlist.add(p);
    for(int i=0; i<right.size();i++){
        rlist.add(right.get(i));
    }
    for(int i=0; i<rlist.size();i++){
        result[i]=(rlist.get(i));
    }
    return result;
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

        int[] result = quickSort(arr);

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
