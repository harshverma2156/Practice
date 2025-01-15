package source;
import java.util.*;

public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();      //for taking input from user sc.nextInt();
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Equal");
        } else {
            if (a<b) {
                System.out.println("A is smaller than B");
                    } else {
                System.out.println("A is greater than B");
                }

            }
        }
    }
