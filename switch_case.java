package source;
import java.net.StandardSocketOptions;
import java.util.*;

public class switch_case {
    public static void main (String args[]) {
        Scanner sc = new Scanner (System.in);
        int button = sc.nextInt();

        switch (button) {
            case 1 : System.out.println("Hello");
            break;
            case 2 : System.out.println("Good");
            break;
            default : System.out.println("invalid");

        }
    }
}
