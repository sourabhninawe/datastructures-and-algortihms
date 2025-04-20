import java.util.Scanner;
public class Patterns{

       public static void nxnStars(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                    System.out.print("*");
                System.out.println();
            }
       }
       public static void downwardFallingStars(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                    System.out.print("*");
                System.out.println();
            }
       }
       public static void downwardFallingNumbersPattern1(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                    System.out.print(j);
                System.out.println();
            }
       }
       public static void downwardFallingNumbersPattern2(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                    System.out.print(i);
                System.out.println();
            }
       }
       public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            while(choice!=-1){
                System.out.println("^^^^^^^^^^^^^MENU^^^^^^^^^^^^^");
                System.out.println("1. nxn grid of stars");
                System.out.println("****");
                System.out.println("****");
                System.out.println("****");
                System.out.println("****");
                System.out.println("2. Downward falling stars");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("3. Downward falling numbers Pattern 1");
                System.out.println("1");
                System.out.println("12");
                System.out.println("123");
                System.out.println("1234");
                System.out.println("3. Downward falling numbers Pattern 2");
                System.out.println("1");
                System.out.println("22");
                System.out.println("333");
                System.out.println("4444");
                System.out.println("Enter your choice or -1 to exit:");
                choice = scanner.nextInt();
                if(choice==1){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.nxnStars(n);
                }
                else if(choice==2){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.downwardFallingStars(n);
                }
                else if(choice==3){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.downwardFallingNumbersPattern1(n);
                }
                else if(choice==4){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.downwardFallingNumbersPattern2(n);
                }
                else
                    System.out.println("Invalid choice.");
                
            }
       }
}