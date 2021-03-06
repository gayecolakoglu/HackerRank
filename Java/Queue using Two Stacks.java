import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int choice=0;
        Stack<Integer> s1=new Stack<Integer>();
        Stack<Integer> s2=new Stack<Integer>();


        for(int i=0;i<n;i++)
        {
            choice=sc.nextInt();
            if(choice==1)
            {
                s1.push(sc.nextInt());

            }else
            {
                if(s2.isEmpty())
                {
                    while(!s1.isEmpty())
                    {

                        s2.push(s1.pop());
                    }

                }
            }
            if(choice==2)
            {
                s2.pop();
            }
            if(choice==3)
            {
                System.out.println(s2.peek());
            }

        }



    }
}
