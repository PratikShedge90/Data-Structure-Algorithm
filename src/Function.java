import java.util.Scanner;

class Function {

    public static int CalculateSum(int num1, int num2)
    {
        int result = num1 + num2;
        System.out.println("The Addition of Two Numbers is :"  + result);
        return result;
    }

     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         System.out.println("Please Enter the First Number:");
         int num1 = sc.nextInt();
         System.out.println("Please Enter the Second Number: ");
         int num2 = sc.nextInt();

         CalculateSum(num1,num2);

     }
}
