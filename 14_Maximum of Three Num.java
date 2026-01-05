import java.util.Scanner;
public class Prog {


    public static void main(String[] args) {
        int a, b , c; // Example numbers
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter First number :");
          a=sc.nextInt();
          System.out.print("Enter Second number :");
          b=sc.nextInt();        
          System.out.print("Enter Third number :");
          c=sc.nextInt();

         if(a>=b && a>=c){
            System.out.print("Maximum number is "+a);
        }
        else if(b>=a && b>=c){
            System.out.println("Maximum number is "+b);
        }
        else{
            System.out.println("Maximum number is "+c);
        }
        

    }
    
 }
