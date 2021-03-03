import java.util.Scanner;
public class Exercise5 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st double number: ");
        double firstDouble = in.nextDouble();
        System.out.print("Input 2nd double number: ");
        double secondDouble = in.nextDouble();

        System.out.printf("Sum of two double numbers : %.2f%n", firstDouble + secondDouble);
        System.out.printf("Difference of two double numbers : %.2f%n", firstDouble - secondDouble);
        System.out.printf("Product of two double numbers : %.2f%n", firstDouble * secondDouble);
        System.out.printf("Quotient of two double numbers: %.2f%n",  firstDouble/ secondDouble ) ;
    }
}