import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static int cookies(int k, int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i : A)
            pq.add(i);
        int iteration = 0;
        while (pq.peek() < k) {
            if (pq.size() < 2)
                return -1;
            int a = pq.poll();
            int b = pq.poll();
            pq.add(a + 2 * b);
            iteration++;
        }
        return iteration;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
            arr[i] = sc.nextInt();
        }
        int iterations = cookies(b, arr);
        System.out.print(iterations);
        sc.close();
    }
}
