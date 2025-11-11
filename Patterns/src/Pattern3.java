public class Pattern3 {
    void While3(){
        System.out.println("Using while loop: ");
        int r = 1;
        while(r<=4){
            int space = 3;
            while(space >= r){
                System.out.print(" ");
                space--;
            }
            int c = 1;
            while(c <= r){
                System.out.print("*");
                c++;
            }
            System.out.println();
            r++;
        }
    }
    void For3(){
        System.out.println("Using for loop: ");
        for(int r = 1; r <= 4; r++){
            for(int space = 3; space >= r; space--){
                System.out.print(" ");
            }
            for(int c = 1; c <= r; c++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Pattern3 obj3 = new Pattern3();
        obj3.While3();
        obj3.For3();
    }
}
