import java.util.Scanner;
public class StarandTriangl {
    public static void main (String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("Bir sayı giriniz : ");
        int n = inp.nextInt();
        System.out.println("Üçgen mi elmas mı çizdirmek istersiniz ? \n1-Üçgen \n2-Elmas");
        int s = inp.nextInt();
        switch (s) {
            case 1 :
                for (int i = 0; i <= n; i++) {
                    for (int j = 0; j <= n-i; j++) {
                        System.out.print(" ") ;
                    }
                    for (int j = 1; j <= 2 * i + 1; j++) {
                        System.out.print("*");
                    }
                 System.out.println(" ");
                }break;
            case 2 :
             if (n%2 == 1){
                for (int i = 0; i <= n ; i++) {
                    for (int j = 0; j <= (n - i); j++) {
                    System.out.print(" ");
                }
                     for (int k = 1; k <= (2 * i + 1); k++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
                for (int i = n-1; i >= 0 ; i--) {
                     for (int j = (n-i); j >= 0; j--) {
                    System.out.print(" ");
                }
                        for (int k = (2*i+1); k >= 1; k--) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            }else { int a = n-1;
                for (int i = 0; i <=a; i++) {
                    for (int j = 0; j <= a-i ; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 2*i+1; k++) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
                for (int i = a-1; i >= 0; i--) {
                    for (int j = a-i; j>=0 ; j--) {
                        System.out.print(" ");
                    }
                    for (int k = (2*i+1); k >0 ; k--) {
                        System.out.print("*");
                    }
                    System.out.println(" ");
                }
            }break;
        }
    }
}
