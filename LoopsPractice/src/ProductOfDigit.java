import java.util.Scanner;
public class ProductOfDigit {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int num = io.nextInt();
        int product = 1;
        while(num > 0){
            product = product * (num % 10);
            num /= 10;
        }
        System.out.print(product);
        io.close();
    }
}
