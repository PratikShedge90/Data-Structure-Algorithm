 class KthLargestElement {
     public static void main(String[] args) {

         int a[] = {6,7,3,5,2,4,1,8};
         int k = 4;

         for (int i=0; i<a.length-1; i++)
         {
             for (int j= i+1; j<a.length; j++)
             {
                 if (a[i] < a[j])
                 {
                     int temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }
             }
             if (i == k-1)
             {
                 System.out.println(k + "largest Element is " + a[i]);
                 break;
             }
         }
         System.out.println("---------------");
         for (int i=0; i<a.length; i++)
         {
             System.out.print(a[i] + " ");
         }
     }
}
