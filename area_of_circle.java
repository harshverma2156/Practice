package source;
import java.util.*;


public class area_of_circle {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextInt();
        double b = Math.PI * radius * radius;

        System.out.println("The area of circle is : " + b);


    }
}
