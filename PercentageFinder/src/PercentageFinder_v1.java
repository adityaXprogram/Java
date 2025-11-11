import java.util.Scanner;
public class PercentageFinder_v1 {
    Scanner io = new Scanner(System.in);
    float sub1;
    float sub2;
    float sub3;
    float sub4;
    float sub5;
    char a;
    float totalMarks;
    float obtainedMarks;
    float percentage;
    float average;
    void gettingMarks(){
        System.out.print("Enter total marks: ");
        totalMarks = io.nextFloat();
        System.out.print("Enter marks of first subject: ");
        sub1 = io.nextFloat();
        System.out.print("Enter marks of second subject: ");
        sub2 = io.nextFloat();
        System.out.print("Enter marks of third subject: ");
        sub3 = io.nextFloat();
        System.out.print("Enter marks of fourth subject: ");
        sub4 = io.nextFloat();
        System.out.print("Enter marks of fifth subject: ");
        sub5 = io.nextFloat();
    }
    void calculation(){
        obtainedMarks = sub1 + sub2 + sub3 + sub4 + sub5;
        System.out.println("Total Marks: "+ obtainedMarks);
        percentage = (obtainedMarks / totalMarks) * 100;
        System.out.println("Percentage: "+percentage+"%");
        System.out.println("a - Average\ne - Exit");
        a = io.next().charAt(0);
        switch (a){
            case 'a' -> {
                average = obtainedMarks / 5;
                System.out.print("Average: "+average);
            }
            case 'e' -> System.exit(0);
            default -> System.out.print("Select correct option.");
        }
    }

    public static void main(String[] args) {
        PercentageFinder_v1 dem = new PercentageFinder_v1();
        dem.gettingMarks();
        dem.calculation();
    }
}
