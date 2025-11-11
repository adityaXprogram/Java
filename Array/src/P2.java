public class P2 {
    public static void main(String[] args) {
        //To know the length of array element we use array.length
        int[] example = {40, 20, 30, 60};
        System.out.println(example.length);
        //Display the array(simple way)
        System.out.println("Printing using simple way");
        System.out.println(example[0]);
        System.out.println(example[1]);
        System.out.println(example[2]);
        System.out.println(example[3]);
        //Display the array(For loop)
        System.out.println("Printing using for loop");
        for(int i = 0; i < example.length; i++){
            System.out.println(example[i]);
        }
        /*Display the array(for-each loop)
        for (type variable : array name) {
         code block to be executed
        }*/
        System.out.println("Printing using for-each loop");
        for(int j : example){
            System.out.println(j);
        }
    }
}
