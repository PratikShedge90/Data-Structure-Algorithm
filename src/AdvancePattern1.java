public class AdvancePattern1 {
    public static void main(String[] args) {

        int n = 4;
        // Upper Part Of Program
        for (int i=1; i<=n; i++)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            // Spaces
            int spaces = 2 * (n - i);
            for (int k=1; k<=spaces; k++)
            {
                System.out.print(" ");
            }

            // 2nd Part
            for (int l=1; l<=i; l++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
        // Lower Part Program
        for (int i=n; i>=1; i--)
        {
            for (int j=1; j<=i; j++)
            {
                System.out.print("*");
            }

            // Spaces
            int spaces = 2 * (n-i);
            for (int k = 1; k<=spaces; k++)
            {
                System.out.print(" ");
            }

            for (int l=1; l<=i; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
