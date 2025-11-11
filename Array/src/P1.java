public class P1 {
    public static void main(String[] args) {
        /*Array is used to store multiple values in a single variable, instead of declaring variables for each value.
          There are three ways to create an array.*/
        //Way 1
        int[] num1;
        num1 = new int[5];
        num1[0] = 10;
        num1[1] = 20;
        num1[2] = 30;
        num1[3] = 40;
        num1[4] = 50;
        System.out.println(num1[0]);
        //Way 2
        int[] num2 = new int[5];
        num2[0] = 10;
        num2[1] = 20;
        num2[2] = 30;
        num2[3] = 40;
        num2[4] = 50;
        System.out.println(num2[1]);
        //Way 3
        int[] num3 = {10,20,30,40,50};
        System.out.println(num3[2]);
    }
}
