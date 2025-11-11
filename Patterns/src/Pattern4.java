public class Pattern4 {
    void While4() {
        System.out.println("USing while loop: ");
        int r = 1;
        while (r <= 4) {
            int space = 2;
            while (space <= r) {
                System.out.print(" ");
                space++;
            }
            int c = 4;
            while (c >= r) {
                System.out.print("*");
                c--;
            }
            System.out.println();
            r++;
        }
    }

    void For4() {
        System.out.println("Using for loop: ");
        for (int r = 1; r <= 4; r++) {
            for (int space = 2; space <= r; space++) {
                System.out.print(" ");
            }
            for (int c = 4; c >= r; c--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Pattern4 obj4 = new Pattern4();
        obj4.While4();
        obj4.For4();
    }
}