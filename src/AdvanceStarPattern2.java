public class AdvanceStarPattern2 {
    public static void main(String[] args)
    {
        int n=5;

        for (int i=1; i<=n; i++)
        {
            // Spaces
            for (int j=1; j<= n-i; j++)
            {
                System.out.print(" ");
            }

            // Stars
            for (int k=1; k<= n; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
