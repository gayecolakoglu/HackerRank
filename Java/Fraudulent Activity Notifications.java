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

        int[] expenditure = new int[scanner.nextInt()];
        int d = scanner.nextInt();
        for(int i=0; i<expenditure.length; i++) {
            expenditure[i] = scanner.nextInt();
        }


        System.out.println(activityNotifications(expenditure, d));
    }
    static int activityNotifications(int[] expenditure, int d) {
        int notification=0;
        int[] medArr=new int[201];


        for(int j=0;j<d;j++){
            medArr[expenditure[j]]++;
        }

        int j=0;
        for(int i=d;i<expenditure.length;i++){
            double median=calculateMedian(medArr,d);
            if(expenditure[i]>=median*2){
                notification++;
            }
            medArr[expenditure[j]]--;
            medArr[expenditure[i]]++;
            j++;
        }



        return notification;
    }

    private static double calculateMedian(int[] medArr, int d) {
        int length=medArr.length;
        int count=0;
        double med=0;
        if(d%2!=0){
            for (int i=0;i<length;i++){
                count+=medArr[i];//grubu belirliyor
                if (count>d/2){
                    med=i;
                    break;
                }
            }
        }else {
            double med1=0;
            double med2=0;
            for (int i=0;i<length;i++) {
                count += medArr[i];
                if (count > d / 2-1 && med1 == 0) {
                    med1 = i;
                }
                if (count > d / 2 && med2 == 0) {
                    med2 = i;
                    break;
                }
            }
            med=(med1+med2)/2;
        }
        return med;
    }


}
