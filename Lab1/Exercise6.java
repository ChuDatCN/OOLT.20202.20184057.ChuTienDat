import java.util.Scanner;
public class Exercise6 {
    public static void main (String[] args) {
        float a=0 , b=0 ,c = 0  ,d =0;
        float a11 , a12 , a21, a22, b1 ,b2 , x ,y, D, D1 ,D2 ;
        float nghiem=0;
        int chon =0;
        Scanner s = new Scanner(System.in);
        do{
            System.out.println("");
            System.out.println("    Solve math :");
            System.out.println("    1. Giai phuong trinh bac nhat 1 an");
            System.out.println("    2. Giai phuong trinh bac nhat 2 an ");
            System.out.println("    3. Giai phuong trinh bac hai  1 an " );
            System.out.println("    4. Thoat chuong trinh");
            System.out.print("----> Ban chon chuc nang: ");
            chon = s.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("Nhap a = ");
                    a = s.nextFloat();
                    System.out.print("Nhap b = ");
                    b = s.nextFloat();
                    
                    if (a ==0) {  
                        if ( b == 0){
                            System.out.println("Phuong trinh vo so nghiem");
                        }else{  // a=0 va b !=0 
                            System.out.println("Phuong trinh vo nghiem");
                        }
                    }else {
                        if (b== 0) {
                            nghiem = 0;
                        }else {
                            nghiem = -b/a;
                        }// tranh truong hop nghiem  = 0
                        System.out.println("Phuong trinh co 1 nghiem la : " + nghiem);
                    }
                    break;
                case 2: 
                
                System.out.print("Ta co' 2 phuong trinh : \n \t\ta11 * x + a12 * y = b1\n \t\ta21 * x + a22 * y = b2\n");
                System.out.print("Nhap cac gia tri: \n");
                System.out.print("a11 = ");
                a11 = s.nextFloat();
                System.out.print("a12 = ");
                a12 = s.nextFloat();
                System.out.print("b1 = ");
                b1 = s.nextFloat();
                System.out.print("a21 = ");
                a21 = s.nextFloat();
                System.out.print("a22 = ");
                a22 = s.nextFloat();
                System.out.print("b2 = ");
                b2 = s.nextFloat();
                D = a11 * a22 - a21 *a12;
                D1 = b1 *a22 - b2 * a12;
                D2 = a11 * b2 - a21*b1;
                if (D == 0 ){
                    if  ( (D1 == D2) &&(D1 ==0) ) {
                        System.out.println("Phuong trinh co vo so nghiem");
                    }else System.out.println("Phuong trinh vo nghiem");
                }else {
                    x = D1 /D ;
                    y = D2 /D ;
                    System.out.println("Phuong trinh co nghiem x = " + x );
                    System.out.println(" y = " +y );
                }
                
                break;
                case 3: 
                System.out.println("Biet phuong trinh co' dang  a * x^2 + b * x + c = 0 ");
                System.out.println("Nhap cac gia tri: ");
                System.out.print("  a = ");
                a = s.nextFloat();
                System.out.print("  b = ");
                b = s.nextFloat();
                System.out.print("  c = ");
                c = s.nextFloat();
                if (a == 0) {
                    if (b == 0 ) {
                        if (c == 0 ) System.out.println("Phuong trinh vo so nghiem");
                        else System.out.println("Phuong trinh vo nghiem");
                    }else {
                        if (c == 0 ) {  // tranh truong hop nghiem = -0 
                            nghiem = 0;
                        }else {
                            nghiem = -c / b ;
                        }
                        System.out.println("Phuong trinh co 1 nghiem x = : " + nghiem);
                    }
                }else {
                    float delta  = (float) Math.pow(b,2) - 4 * a * c;
                    if (delta < 0) {
                        System.out.println("Phuong trinh vo nghiem");
                    }else if ( delta ==0 ) {
                        x = -b/ (2 * a);
                        System.out.println("Phuong trinh co nghiem kep x = " + x);
                    }else { // delta>0
                        System.out.println("Phuong trinh co 2 nghiem phan biet: ");
                        float x1 = (-b + (float) Math.sqrt(delta)) / (2 * a);
                        float x2 = (-b - (float) Math.sqrt(delta)) / (2 *a );
                        System.out.printf("Nghiem x1 = %.2f ", x1 );
                        System.out.printf("Nghiem x2 = %.2f", x2 );
                    }
                }
                break;



                    
                case 4: System.out.println("End.");
                break;
                default: System.out.println("Nhap sai lua chon!");
                    break;
                }
        }while(chon != 4);
        s.close();
        System.out.println("");
        System.exit(0);
    }
}