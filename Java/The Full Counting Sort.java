import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution {

    // Complete the countSort function below.
    

    public static void main(String[] args) throws IOException {
        
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        
        HashMap<String,StringBuffer> myMap = new HashMap<>();
    
        for(int i=0; i<n/2; i++){
            String key=scanner.next();
            String value=scanner.next();
            
            if(myMap.get(key)==null){
                myMap.put(key,new StringBuffer("- "));
            }else{
                myMap.put(key,myMap.get(key).append("- "));
            }
        }
         for(int i=n/2; i<n; i++){
             String key=scanner.next();
             String value=scanner.next();
            
             if(myMap.get(key)==null){
                myMap.put(key,new StringBuffer(value+" "));
            }else{
                myMap.put(key,myMap.get(key).append(value+" "));
            }
         }
         for(int i=0; i<100; i++){
             String j=Integer.toString(i);
             if(myMap.get(j)!=null){
                 System.out.print(myMap.get(j).toString());
                 
             }
         }

    }
}
