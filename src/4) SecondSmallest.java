 class SecondSmallest {
     public static void main(String[] args)
     {
         int a[] = {6,8,1,2,5,3,7};

         int temp;
         for (int i=0; i< a.length; i++){
             for (int j=i+1; j<a.length; j++){

                 if(a[i] > a[j])
                 {
                     temp = a[i];
                     a[i] = a[j];
                     a[j] = temp;
                 }
             }
         }
         for(int i=0; i<a.length; i++){
             System.out.print(a[i] + " ");
         }
         System.out.println("Second Smallest Element : " + a[1]);
     }
}
