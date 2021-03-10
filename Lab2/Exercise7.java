import java.util.Scanner;

public class Exercise7 {
 public static void main(String args[])
   {
      int x, y, i, j;
      Scanner s = new Scanner(System.in);
 
      System.out.println("Input number of rows of matrix");
      x = s.nextInt();
      System.out.println("\nInput number of columns of matrix");
      y  = s.nextInt();
 
      int array1[][] = new int[x][y];
      int array2[][] = new int[x][y];
      int sum[][] = new int[x][y];
 
      System.out.println("\nInput elements of first matrix");
 
      for (  i = 0 ; i < x ; i++ ){
         for ( j = 0 ; j < y ; j++ ){
            System.out.print("["+ (i+1) + "]["+ (j+1) + "]  =  ");
            array1[i][j] = s.nextInt();
        } 
    }
      System.out.println("\nInput the elements of second matrix");
 
      for ( i = 0 ; i < x ; i++ )
         for ( j = 0 ; j < y ; j++ ){
            System.out.print("["+ (i+1) + "]["+ (j+1) + "]  =  ");
            array2[i][j] = s.nextInt();
        }
 
      for ( i = 0 ; i < x ; i++ )
         for ( j = 0 ; j < y ; j++ )
             sum[i][j] = array1[i][j] + array2[i][j]; 
 
      System.out.println("\nSum of two matrices :");
 
      for ( i = 0 ; i < x ; i++ )
      {
         for ( j = 0 ; j < y ; j++ )
            System.out.print(sum[i][j]+"\t");
 
         System.out.println();
      }
   }
}
