import java.util.Scanner;

class Prog{

    public static void main(String[] args){

        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number :");
        a = sc.nextInt();

        if(a%2==0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }
}
