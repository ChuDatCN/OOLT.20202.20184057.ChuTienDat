import java.util.Scanner;
import java.util.Arrays;
public class Exercise6 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0 , x = 0 ,i = 0, sum = 0  ; 
        System.out.print(" Array's number : ");
        x = s.nextInt();
        

        int array[] = new int[x];
        System.out.println("Enter :");
        for (i = 0 ; i < x ; i ++){
            System.out.print("A[" + i + "] = ");
            array[i] = s.nextInt();
            sum  = sum + array[i];
        }
        Arrays.sort(array);
        System.out.println("The sorted array is : ");
        for (i = 0 ; i < x ; i ++){
            System.out.println("A[" + i + "] = "+ array[i]);
        }
        
        System.out.println("The sum of array is : " +  sum );
        System.out.println(" The average value of array is : " + (sum/x));
    }
}