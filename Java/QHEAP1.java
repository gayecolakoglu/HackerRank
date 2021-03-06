import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        for(int i=0; i<n; i++) {
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    heap.add(scanner.nextInt());
                    break;
                case 2:
                    heap.remove(scanner.nextInt());
                    break;
                case 3:

//                    heap.print();
                    System.out.println(heap.peek());
                    break;
            }
        }

    }
}
