import java.util.Scanner;

public class Exercise4 {
    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0 , i = 0 , j = 0 , k = 0 ;

        System.out.print("Nhap n = ");
        n = s.nextInt();

        for ( i  = 1 ; i <= n ; i++ )  
        {
            for ( j = i; j <= n -1 ; j++ ) { 
                System.out.print(" ");
            }
            for ( k = 1 ; k <= i*2 +1 ; k ++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}