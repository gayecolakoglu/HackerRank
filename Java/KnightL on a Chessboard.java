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
        int n=scanner.nextInt();
        int [][] path=new int[n-1][n-1];
        for (int i=0; i<n-1;i++){
            for (int j=0; j<n-1;j++){
                int count=move(i+1,j+1,n);
                System.out.print(count+" ");
                path[i][j]=count;
            }
            System.out.println();
        }
    }

    private static int move(int i, int j, int n) {
        boolean[][] isValid=new boolean[n][n];
        isValid[0][0]=true;
        int [][] count=new int [n][n];
        ArrayList<int[]> query = new ArrayList<>();
        int [] initial ={0,0};
        query.add(initial);
        int[][] movements={
                {i,j},{-i,-j},{i,-j},{-i,j},{j,-i},{-j,i},{j,i},{-j,-i}
        };

        while (!query.isEmpty()){
            int [] currentLocation=query.remove(0);
            for (int[] movement:movements){
                int row = currentLocation[0]+movement[0];
                int column = currentLocation[1]+movement[1];

                if(row>=0 && row<n && column>=0 && column<n && !isValid[row][column]){
                    isValid[row][column]=true;
                    int[] newloc={row,column};
                    query.add(newloc);
                    int oldcount=count[currentLocation[0]][currentLocation[1]];
                    count[row][column]=oldcount+1;
                }
            }
            if (currentLocation[0]==n-1 && currentLocation[1]==n-1){
                return count[n-1][n-1];
            }
        }
        return -1;

    }
}
