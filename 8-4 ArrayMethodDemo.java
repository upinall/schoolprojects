public class ArrayMethodDemo {
    public static void main (String args[]) {
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7};
        int limit = 12;
        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);
    }
    public static void display(int[] numbers) {
        // Write your code here
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void displayReverse(int[] numbers) {
        // Write your code here
        for (int i = 0;i < numbers.length; i++){
            System.out.print(numbers[numbers.length-i-1] + " ");
        }
        System.out.println();
    }
    public static void displaySum(int[] numbers) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println(sum);
    }
    public static void displayLessThan(int[] numbers, int limit) {
        // Write your code here
        for (int i = 0; i < numbers.length; i++){
            if(numbers [i] < limit)
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
    public static void displayHigherThanAverage(int[] numbers) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        double avg = sum / (double)numbers.length;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > avg)
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
