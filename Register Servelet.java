package com.example.voting.controller;

import com.example.voting.dao.UserDAO;
import com.example.voting.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        User user = new User();
        user.setUsername(username);
        user.setPassword(password);

        try {
            UserDAO userDAO = new UserDAO();
            if (userDAO.registerUser(user)) {
                response.sendRedirect("login.jsp");
            } else {
                response.sendRedirect("register.jsp?error=Registration failed.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("register.jsp?error=An error occurred.");
        }
    }
}
