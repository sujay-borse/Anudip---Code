// Triangle pattern with numbers starting from 1
import java.util.*;

class Hell {

    
    public static void main(String[] args) {
       int n = 5; // number of rows
       int num=1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    
    }
}
