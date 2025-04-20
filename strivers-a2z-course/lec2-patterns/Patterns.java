import java.util.Scanner;
public class Patterns{

       public static void pattern1(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++)
                    System.out.print("*");
                System.out.println();
            }
       }
       public static void pattern2(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                    System.out.print("*");
                System.out.println();
            }
       }
       public static void pattern3(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                    System.out.print(j);
                System.out.println();
            }
       }
       public static void pattern4(int n){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++)
                    System.out.print(i);
                System.out.println();
            }
       }

       public static void pattern5(int n){
          for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
          }
       }

       public static void pattern6(int n){
          for (int i=n;i>=1;i--){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
          }
       }
       public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            int choice = 0;
            while(choice!=-1){
                System.out.println("^^^^^^^^^^^^^MENU^^^^^^^^^^^^^");
                System.out.println("1. Pattern 1");
                System.out.println("****");
                System.out.println("****");
                System.out.println("****");
                System.out.println("****");
                System.out.println("2. Pattern 2");
                System.out.println("*");
                System.out.println("**");
                System.out.println("***");
                System.out.println("****");
                System.out.println("3. Pattern 3");
                System.out.println("1");
                System.out.println("12");
                System.out.println("123");
                System.out.println("1234");
                System.out.println("4. Pattern 4");
                System.out.println("1");
                System.out.println("22");
                System.out.println("333");
                System.out.println("4444");
                System.out.println("5. Pattern 5");
                System.out.println("****");
                System.out.println("***");
                System.out.println("**");
                System.out.println("*");
                System.out.println("6. Pattern 6");
                System.out.println("1234");
                System.out.println("123");
                System.out.println("12");
                System.out.println("1");
                System.out.println("Enter your choice or -1 to exit:");
                choice = scanner.nextInt();
                if(choice==1){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.pattern1(n);
                }
                else if(choice==2){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.pattern2(n);
                }
                else if(choice==3){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.pattern3(n);
                }
                else if(choice==4){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.pattern4(n);
                }
                else if(choice==5){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.pattern5(n);
                }
                else if(choice==6){
                    System.out.println("Enter n:");
                    int n = scanner.nextInt();
                    Patterns.pattern6(n);
                }
                else
                    System.out.println("Invalid choice.");
                
            }
       }
}