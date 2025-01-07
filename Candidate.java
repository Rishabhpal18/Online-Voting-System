package com.example.voting.dao;

import com.example.voting.model.Candidate;
import com.example.voting.utils.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CandidateDAO {
    public List<Candidate> getAllCandidates() throws SQLException {
        List<Candidate> candidates = new ArrayList<>();
        String query = "SELECT * FROM candidates";
        try (Connection conn = DBConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                Candidate candidate = new Candidate();
                candidate.setId(rs.getInt("id"));
                candidate.setName(rs.getString("name"));
                candidate.setVotes(rs.getInt("votes"));
                candidates.add(candidate);
            }
        }
        return candidates;
    }

    public boolean castVote(int candidateId) throws SQLException {
        String query = "UPDATE candidates SET votes = votes + 1 WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, candidateId);
            return stmt.executeUpdate() > 0;
        }
    }
}
