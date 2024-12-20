# Online-Voting-System
Project Overview
The Online Voting System is a web-based application designed to allow users to cast their votes for a particular candidate. The project features HTML templates for user management (login, registration, profile), CSS and Bootstrap styling to ensure a responsive and professional design, and JavaScript for client-side form validation and interactivity. This README provides an overview of the project structure, key features, and instructions for setting up and running the project.

# Project Structure
The project is organized into the following structure:

/assets: Contains all static assets for the project.

/css: Stores custom styles for the project.
style.css: The custom CSS file that defines the project's look and feel.
/js: Contains JavaScript files for form validation and interactivity.
script.js: JavaScript file responsible for form validation and dynamic field error messages.
/images: Stores image files used in the project.

logo.png: A placeholder logo image.
index.html: The main HTML page for the voting form where users can vote.

login.html: The login page where users can authenticate with their credentials.

register.html: The registration page where new users can sign up.

profile.html: The profile page that displays user information.

README.md: The project documentation file you're currently reading.

LICENSE: The project’s license file (MIT License).

# Key Features
1. User Management
Login Page: Users can log in to the system using their email and password.
Registration Page: New users can register by providing their email, password, and other necessary details.
Profile Page: A user profile page to display user information (can be extended to allow users to update details).
2. Responsive Design
The project uses Bootstrap for a mobile-first, responsive layout that adjusts seamlessly across different screen sizes (e.g., desktops, tablets, and smartphones).
3. Voting Form
Voting Page: Users can vote for their favorite candidate using radio buttons. The system displays options and allows only one vote per user.
4. JavaScript Validation
Email Validation: Ensures that the email address is properly formatted before submission.
Password Validation: Checks that the password is at least 8 characters long.
Required Fields: Validates required fields (email, password, and candidate selection) before the form can be submitted.
Live Input Feedback: Provides immediate feedback on password strength and highlights invalid fields dynamically.
5. Error Handling
Displays error messages when form fields are filled out incorrectly (e.g., invalid email or missing password).
Provides dynamic error messages to guide users in fixing issues before form submission

# How to Run the Project
Prerequisites
A web browser (e.g., Chrome, Firefox)
Text editor or IDE (e.g., VS Code, Sublime Text)
A web server for backend functionality (optional) (e.g., Apache, Nginx, or Node.js) - optional for static pages

### Step 1: Download the Project
~~ Download or clone the repository to your local machine:
~~ Navigate to the project folder:

### Step 2: Open the Files
~~ Open the project folder in your preferred text editor.
~~ To view the project locally, simply open the index.html or any HTML file (like login.html, register.html, etc.) in a browser.

### Step 3: (Optional) Setup a Local Server for Backend (for full functionality)
~~ If you want to implement backend functionality (e.g., vote submission, user registration, and login), you would need a server to handle requests. You can use technologies like:
~~ Node.js with Express
~~ PHP
~~ Python with Flask/Django

### Step 4: Run the Project
~~ Open the index.html file (or any HTML file you want to test) in a web browser.
~~ The page will load in the browser, displaying the Online Voting System interface.
~~ Start interacting with the form by registering, logging in, and casting votes.

# Features of the Project

### Login Page (login.html)
Simple login form for users with fields for email and password.
JavaScript validation ensures email format and password rules are followed.

### Registration Page (register.html)
A form to register a new user with email, password, and confirmation password.
JavaScript validation ensures strong password rules (minimum length of 8 characters).

### Voting Page (index.html)
Form where users can select a candidate to vote for using radio buttons.
Email and password are required before the user can submit their vote.
JavaScript performs validation to ensure a valid email and password are entered before submitting the form.

### Profile Page (profile.html)
Displays a placeholder user profile page where users can view their details (This page can be enhanced to allow profile editing).

### Custom Styles (assets/css/style.css)
Custom styles added to the project to ensure it has a clean, professional look.
Use of Bootstrap classes to ensure responsiveness and mobile-friendly design.

### JavaScript Logic (assets/js/script.js)
Handles form validation for email, password, and voting options.
Provides live feedback and dynamically shows/hides error messages.
Prevents form submission if there are validation errors.








