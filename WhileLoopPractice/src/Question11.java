public class Question11 {
    public static void main(String[] args) {
       int r = 1;
       while(r<=4){
           int c1 = 3;
           while(c1>=r){
               System.out.print(" ");
               c1--;
           }
           int c2 = 1;
           while(c2 <= (2*r-1)){
               System.out.print("*");
               c2++;
           }
           System.out.println();
           r++;
       }

    }
}