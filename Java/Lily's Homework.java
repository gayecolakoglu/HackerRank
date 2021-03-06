import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[]  arr= new int[scanner.nextInt()];
        for (int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();

        }
        int[] arr2=Arrays.copyOf(arr,arr.length);
        int[] sorted=Arrays.copyOf(arr,arr.length);
        Arrays.sort(sorted);
        int[] reverse=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            reverse[i]=sorted[arr.length-1-i];
        }
        int c1=calculate(arr,sorted);
        int c2=calculate(arr2,reverse);
        System.out.println(c1<c2 ? c1 : c2);
    }
    static int calculate(int[] arr,int[] sorted) {
        HashMap<Integer, Integer> myMap = new HashMap<Integer, Integer>();
        int value;
        int count=0;
        for(int i=0;i<arr.length;i++){
            myMap.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++){
            if(sorted[i]!=arr[i]){
                value=arr[i];
                arr[i]=sorted[i];
                arr[myMap.get(sorted[i])]=value ;
                myMap.put(value,myMap.get(sorted[i]));
                count++;
            }
        }
        return count;
    }
}
