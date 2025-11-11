import java.util.Scanner;
public class Circle {
    public static void main(String[] args) {
        Scanner K2 = new Scanner(System.in);
        System.out.print("Enter the radius: ");
         int a = K2.nextInt();
         float b = 22f/7f;
         float c = b * (a*a);
        System.out.println("Area of circle: "+c);
    }
}
