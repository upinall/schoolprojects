import java.util.*;
public class QuizScoreStatistics {
    public static void main (String args[]) {
        // Write your code here
        Scanner inputDevice = new Scanner(System.in);
        int count = 0;
        int score = 1;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, sum = 0;
        System.out.println("Enter the scores: ");
        do {
            score = inputDevice.nextInt();
            if (score != 99){
                if(score < 0 || score > 10){
                    System.out.println("Score must be between 10 and 0");
                } else {
                    count++;
                    if (score < min) {
                        min = score;
                    }
                    if (score > max) {
                        max = score;
                    }
                    sum = sum + score;
                }
            }
        } while (score != 99);
        inputDevice.close();
        System.out.println("Number of valid scores entered: " + count);
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.println("Arithematic Average: " + sum/ (double) count);
    }
}
