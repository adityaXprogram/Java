import java.util.Scanner;
public class Table_v1 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        System.out.print("Enter a number to print its table: ");
        int tNum = io.nextInt();
        int i;
        int result;
        for (i =1; i <=10; i++){
            result = tNum * i;
            System.out.println(tNum +" x "+i+" = "+result);
        }
    }
}