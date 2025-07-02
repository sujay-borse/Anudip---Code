class Demo{
    int add() {
        int a = 10;
        int b = 20;
        int c = a + b;
        return c;
    }
}
public class Hell {

    public static void main(String[] args) {
        Demo d= new Demo();
        int result = d.add();
        System.out.println("The sum is: " + result);

    }
}
