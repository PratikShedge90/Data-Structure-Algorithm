public class StarPattern6 {
    public static void main(String[] args) {
        /*
        Logic Version 1

        for(int i=1; i<=4; i++)
        {
           for(int j=4; j>=i; j--)
           {
               System.out.print(" ");
           }
           for (int k=1; k<=i; k++)
           {
               System.out.print(" *");
           }
            System.out.println();
        }
         */

        // Logic Version 2

        for(int i=1; i<=5; i++)
        {
            for(int j=5; j >= 1;  j-- )
            {
                if( j>i )
                {
                    System.out.print("-");
                }
                else
                {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

    }
}
