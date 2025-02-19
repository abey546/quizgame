import java.util.Scanner; // Importing Scanner for user input

public class QuizGame {
    public static void main(String[] args) {
        // Initialize variables
        int score = 0;
        int totalQuestions = 5;
        String userAnswer;

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Question 1
        System.out.println("Question 1: What is the capital of Kenya?");
        System.out.println("A) Berlin\nB) Madrid\nC) Nairobi\nD) Rome");
        System.out.print("Your answer: ");
        userAnswer = scanner.next().toUpperCase(); // Convert input to uppercase to handle case differences
        if (userAnswer.equals("C")) {
            score++;
        }

        // Question 2
        System.out.println("\nQuestion 2: What is 3 + 2?");
        System.out.println("A) 3\nB) 5\nC) 4\nD) 6");
        System.out.print("Your answer: ");
        userAnswer = scanner.next().toUpperCase();
        if (userAnswer.equals("B")) {
            score++;
        }

        // Question 3
        System.out.println("\nQuestion 3: Which planet is known as the Red Planet?");
        System.out.println("A) Earth\nB) Mars\nC) Jupiter\nD) Venus");
        System.out.print("Your answer: ");
        userAnswer = scanner.next().toUpperCase();
        if (userAnswer.equals("B")) {
            score++;
        }

        // Question 4
        System.out.println("\nQuestion 4: What is the smallest ocean on Earth?");
        System.out.println("A) Indian Ocean\nB) Atlantic Ocean\nC) Arctic Ocean\nD) Pacific Ocean");
        System.out.print("Your answer: ");
        userAnswer = scanner.next().toUpperCase();
        if (userAnswer.equals("C")) {
            score++;
        }

        // Question 5
        System.out.println("\nQuestion 5: Who is the current president of United state? ");
        System.out.println("A) Charles Dickens\nB) Donald Trump\nC) Joe Biden\nD) Barack Obama");
        System.out.print("Your answer: ");
        userAnswer = scanner.next().toUpperCase();
        if (userAnswer.equals("B")) {
            score++;
        }

        // Calculate and display the final score
        double percentageScore = ((double) score / totalQuestions) * 100;
        System.out.println("\nQuiz Completed!");
        System.out.println("Your final score: " + score + "/" + totalQuestions);
        System.out.printf("Percentage Score: %.2f%%\n", percentageScore);

        // Close the scanner
        scanner.close();
    }
}
