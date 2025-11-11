public class Pattern1 {
    void While(){
        System.out.println("Using while loop:");
        int r = 1;
        while(r<=4){
            int c = 1;
            while(c<=r){
                System.out.print("*");
                c++;
            }
            System.out.println();
            r++;
        }
    }
    void For(){
        System.out.println("Using for loop: ");
        for(int r = 1; r <= 4; r++){
            for(int c = 1; c <=r; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern1 obj1 = new Pattern1();
        obj1.While();
        obj1.For();
    }
}
