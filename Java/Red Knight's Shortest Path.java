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
        int n = scanner.nextInt();

        int x_start = scanner.nextInt();
        int y_start = scanner.nextInt();
        int x_finish = scanner.nextInt();
        int y_finish = scanner.nextInt();

        int[] start = {x_start, y_start};
        int[] finish = {x_finish, y_finish};

        int[][] movements = {
                {-1, -2}, {1, -2}, {2, 0}, {1, 2}, {-1, 2}, {-2, 0}
        };

        String[] path = {"UL", "UR", "R", "LR", "LL", "L"};

        StringBuffer[][] sentence = new StringBuffer[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                sentence[i][j] = new StringBuffer();
            }
        }


        boolean[][] isValid = new boolean[n][n];

        ArrayList<int[]> query = new ArrayList<>();
        query.add(start);

        boolean isImpossible = true;

        while (!query.isEmpty()) {
            int[] currentLocation = query.remove(0);
//            System.out.println(Arrays.toString(currentLocation));
            int k = 0;
            for (int[] movement : movements) {
                int x = currentLocation[0] + movement[1];
                int y = currentLocation[1] + movement[0];
                if (x < n && y < n && x >= 0 && y >= 0 && !isValid[x][y]) {
                    isValid[x][y] = true;
                    int[] newLoc = {x ,y};
                    query.add(newLoc);
                    sentence[x][y].append(sentence[currentLocation[0]][currentLocation[1]]).
                            append(path[k]).append(" ");

//                    printStringBuffer(sentence);
                }
                k++;
            }

            if (currentLocation[0] == finish[0] && currentLocation[1] == finish[1]) {
                String str = sentence[currentLocation[0]][currentLocation[1] ].toString();
                int len = str.split(" ").length;
                System.out.println(len);
                System.out.println(str);
                isImpossible = false;
                break;
            }


        }

        if (isImpossible) {
            System.out.println("Impossible");
        }
//        System.out.print(sentence[1][0].toString());

    }

    static void  printStringBuffer(StringBuffer[][] sentence) {

        for (int i=0; i<sentence.length; i++) {
            boolean k = false;
            for (int j=0; j<sentence.length; j++) {
                if (!sentence[i][j].toString().equals("")) {
                    System.out.print(sentence[i][j].toString() + "----");
                    k = true;
                }

            }
            if (k)
            System.out.println();
        }
    }
}
