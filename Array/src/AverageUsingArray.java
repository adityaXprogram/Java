public class AverageUsingArray {
    public static void main(String[] args) {
        int[] numbers = {69, 70, 80, 10, 90, 6};
        int eL = numbers.length;
        int sum = 0;
        for(int i = 0; i<numbers.length;i++){
//            System.out.println(numbers[i]);
            sum += numbers[i];
        }
        float average = sum / (float)eL;
        System.out.print("Average: "+average);
    }
}