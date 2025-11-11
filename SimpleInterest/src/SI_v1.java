import java.util.Scanner;
public class SI_v1 {
    public static void main(String[] args) {
        Scanner io = new Scanner(System.in);
        //declaring value
        float principal;
        float rate;
        float time;
        float simpleInterest;
        float amount;
        //taking principal
        System.out.print("Enter principal: ");
        principal = io.nextFloat();
        //taking rate
        System.out.print("Enter rate: ");
        rate = io.nextFloat();
        //taking time
        System.out.print("Enter time: ");
        time = io.nextFloat();
        //calculating SimpleInterest and amount
        simpleInterest = (principal*rate*time)/100;
        amount = simpleInterest + principal;
        //output section
        System.out.println("Given\n"+"Principal: "+principal+"\nRate: "+rate+"\nTime: "+time);
        System.out.println("Interest: "+simpleInterest);

    }
}
