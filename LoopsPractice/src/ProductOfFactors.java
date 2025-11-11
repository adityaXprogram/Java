import java.util.Scanner;
public class ProductOfFactors {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        int num = io.nextInt();
        int factor = 1;
        int sum = 0;
        while(factor <= num){
            if(num % factor == 0){
                sum = sum + factor;
            }
            factor++;
        }
        System.out.print("Sum of factor of "+num+" is "+sum);
    }
}
