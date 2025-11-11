import java.util.Scanner;
public class TrafficSignal_v1 {
    final String stp = "Red";
    final String gReady = "Yellow";
    final String go = "Green";
    String color;
    void gatheringInfo(){
        Scanner io = new Scanner(System.in);
        System.out.println("Welcome! to traffic signal control panel.");
        System.out.println("Choose Red(Stop), Yellow(Get Ready), Green(Go)");
        System.out.print("Color: ");
        color = io.nextLine();
        io.close();
    }
    void tSLogic(){
        switch(color){
            case stp -> System.out.print("Stop");
            case gReady -> System.out.print("Get Ready");
            case go -> System.out.print("Go");
            default -> System.out.print("Choose valid signal color.");
        }
    }
    public static void main(String[] args) {
        TrafficSignal_v1 dem = new TrafficSignal_v1();
        dem.gatheringInfo();
        dem.tSLogic();
    }
}
