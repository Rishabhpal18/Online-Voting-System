package com.example.voting.dao;

import com.example.voting.model.User;
import com.example.voting.utils.DBConnection;

import java.sql.*;

public class UserDAO {
    public boolean registerUser(User user) throws SQLException {
        String query = "INSERT INTO users (username, password, has_voted) VALUES (?, ?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setBoolean(3, false);
            return stmt.executeUpdate() > 0;
        }
    }

    public User loginUser(String username, String password) throws SQLException {
        String query = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUsername(rs.getString("username"));
                    user.setPassword(rs.getString("password"));
                    user.setHasVoted(rs.getBoolean("has_voted"));
                    return user;
                }
            }
        }
        return null;
    }

    public boolean updateVotingStatus(int userId) throws SQLException {
        String query = "UPDATE users SET has_voted = ? WHERE id = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setBoolean(1, true);
            stmt.setInt(2, userId);
            return stmt.executeUpdate() > 0;
        }
    }
}
