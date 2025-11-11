public class Pattern2 {
    void While2(){
        System.out.println("Using while loop:");
        int r = 1;
        while(r<=4){
            int c = 4;
            while(c >= r){
                System.out.print("*");
                c--;
            }
            System.out.println();
            r++;
        }
    }
    void For2(){
        System.out.println("Using for loop: ");
        for(int r = 1; r<=4; r++){
            for(int c = 4; c>=r; c--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern2 obj2 = new Pattern2();
        obj2.While2();
        obj2.For2();
    }
}
