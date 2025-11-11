public class Pattern5 {
    void While5(){
        System.out.println("Using while loop: ");
        int r = 1;
        while(r <= 4){
            int space = 3;
            while(space >= r){
                System.out.print(" ");
                space--;
            }
            int c = 1;
            while(c <= (2 * r - 1)){
                System.out.print("*");
                c++;
            }
            System.out.println();
            r++;
        }
    }
    void For5(){
        System.out.println("Using for loop: ");
        for(int r = 1; r <= 4; r++){
            for(int space = 3; space >= r; space--){
                System.out.print(" ");
            }
            for(int c = 1; c<= (2 * r - 1); c++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern5 obj5 = new Pattern5();
        obj5.While5();
        obj5.For5();
    }
}
