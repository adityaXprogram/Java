// Table using for loop
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = io.nextInt();
        // Table logic
        for(int i = 1; i<=10; i++){
            int result = number * i;
            System.out.println(number + " * " + i + " = " + result);
        }
        io.close();
    }
}
