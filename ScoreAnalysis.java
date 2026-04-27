package homeworks;
import java.util.Random;

public class ScoreAnalysis {

    public static void main(String[] args) {

        // Create array of size 100
        int[] scores = new int[100];

        // Generate 100 random scores (0–99)
        Random rand = new Random();
        for (int i = 0; i < scores.length; i++) {
            scores[i] = rand.nextInt(100); // 0 to 99
        }

        // Display scores
        System.out.println("Generated Scores:");
        display(scores);

        // Count scores >= average
        int countAboveAvg = countAboveOrEqualAverage(scores);
        System.out.println("\nNumber of scores >= average: " + countAboveAvg);

        //count ranges
        System.out.println("\nScore distribution:");
        countRanges(scores);
    }

    // Method to display scores (10 per line)
    public static void display(int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + "\t");

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    // Method to count scores >= average
    public static int countAboveOrEqualAverage(int[] scores) {
        double sum = 0;

        // Compute sum
        for (int score : scores) {
            sum += score;
        }

        double average = sum / scores.length;
        System.out.println("\nAverage score: " + average);

        // Count scores >= average
        int count = 0;
        for (int score = 0; score < scores.length; score++) {
            if (score >= average) {
                count++;
            }
        }

        return count;
    }

    // Bonus: Method to count scores in ranges
    public static void countRanges(int[] scores) {
        int[] ranges = new int[10]; 

        for (int i = 0; i < scores.length; i++) {
            ranges[scores[i] / 10]++;
        }

        for (int i = 0; i < ranges.length; i++) {
            int start = i * 10;
            int end = start + 9;
            System.out.println(start + "-" + end + ": " + ranges[i]);
        }
    }
}
