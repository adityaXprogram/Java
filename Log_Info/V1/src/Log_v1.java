import java.util.Scanner;
public class Log_v1 {
    boolean loginCheck(){
        Scanner io = new Scanner(System.in);
        //emailID and password
        final String emailID = "demo123@gmail.com";
        final String password = "demo123";
        //verifying emailID and Password
        System.out.print("EmailID: ");
        String ID = io.nextLine();
        System.out.print("Password: ");
        String Pass = io.nextLine();
        //Actual Logic
        if(ID.equals(emailID) && Pass.equals(password)){
            System.out.println("Login Successful");
            return true;
        }
        else{
            System.out.print("Login failed! Retry");
            return false;
        }
    }
    public static void main(String[] args) {
        Log_v1 obj1 = new Log_v1();
        obj1.loginCheck();
    }
}