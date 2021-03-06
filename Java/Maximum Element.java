import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        Stack<Integer> maxValues = new Stack<Integer>();
        
        while(queries-- > 0) {
         switch(in.nextInt()) {
          case 1 : int item = in.nextInt();
                   if (!maxValues.isEmpty()) {
                     item = item > maxValues.peek() ? item : maxValues.peek();
                   }
               maxValues.push(item);
                   break;
          case 2 : maxValues.pop();
                   break;
          case 3 : System.out.println(maxValues.peek());
                   break;
     }
        }
        
        in.close();
    }
}
