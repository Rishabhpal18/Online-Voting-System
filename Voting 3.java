import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Voter ID:");
        int voterId = scanner.nextInt();

        System.out.println("Enter Candidate ID you want to vote for:");
        int candidateId = scanner.nextInt();

        boolean success = votingSystem.castVote(voterId, candidateId);
        if (success) {
            System.out.println("Thank you for voting!");
        } else {
            System.out.println("Vote failed. Please try again.");
        }

        scanner.close();
    }
}
