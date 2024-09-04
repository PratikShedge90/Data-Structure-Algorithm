import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class MaximumElement {
     public static void main(String[] args) throws IOException {

         int a[] = {4,3,5,2,1,6};

         int max = a[0];
         for (int i=1; i<a.length; i++)
         {
             if(a[i] > max )
             {
                 max = a[i];
             }
         }
         System.out.println("Maximum Element is : " + max);






     }
}
