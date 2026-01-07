import java.util.Scanner;
class Prog {

    public static void main(String[] args) {
        int n;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        n=sc.nextInt();
        int fact =1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        System.out.println("Factorial of 5 is: " + fact);
    }
}
