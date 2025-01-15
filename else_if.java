package source;
import java.util.*;

public class else_if {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if ( a== b){
            System.out.println("9" +
                    "Equal");
        }
        else if (a<b) {
            System.out.println("A is smaller");
        }
        else {
            System.out.println("A is greater");
        }
    }
}
