import java.util.Scanner;
public class NumberReverseWithoutZeros {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int num = io.nextInt();
        int reverse = 0;
        while(num>0){
            int lastDigit = num % 10;
            reverse = reverse * 10 + lastDigit;
            num = num / 10;
        }
        System.out.print(reverse);
    }
}
