import java.sql.*;

public class VotingSystem {
    public boolean castVote(int voterId, int candidateId) {
        try (Connection conn = DatabaseUtility.getConnection()) {
            // Check if the voter has already voted
            String checkQuery = "SELECT has_voted FROM Voter WHERE voter_id = ?";
            PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
            checkStmt.setInt(1, voterId);
            ResultSet rs = checkStmt.executeQuery();
            if (rs.next() && rs.getBoolean("has_voted")) {
                System.out.println("You have already voted!");
                return false;
            }

            // Update the candidate's vote count
            String voteQuery = "UPDATE Candidate SET votes = votes + 1 WHERE candidate_id = ?";
            PreparedStatement voteStmt = conn.prepareStatement(voteQuery);
            voteStmt.setInt(1, candidateId);
            voteStmt.executeUpdate();

            // Mark the voter as having voted
            String updateVoterQuery = "UPDATE Voter SET has_voted = TRUE WHERE voter_id = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateVoterQuery);
            updateStmt.setInt(1, voterId);
            updateStmt.executeUpdate();

            System.out.println("Vote cast successfully!");
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}


