🎬 Movie Management Application 🎥
Summary
This project involves developing a movie management system using Spring MVC and Thymeleaf. The application allows users to manage a list of movies and display them according to their release year. The project demonstrates skills in Java, Spring MVC, Thymeleaf, JDBC, and SQL.

Features
📝 POJO Creation: Defined a Plain Old Java Object (POJO) for movies with attributes: id, name, genre, and release year.
🗄️ Database Schema: Created a SQL schema (schema.sql) to define the movies table in the database.
🔧 Controller Implementation:
Handled HTTP GET requests to retrieve and display all movies.
Handled HTTP POST requests to add new movies to the database.
Implemented functionality to filter and display movies by release year.
🌐 Thymeleaf Integration:
Designed dynamic web pages to display movie data.
Implemented form binding for user inputs.
Styled the pages for a clean and user-friendly interface.
Technologies Used
☕ Java: Core programming language used for the application.
🔄 Spring MVC: Framework used to handle the web layer and controller logic.
🍃 Thymeleaf: Template engine for rendering dynamic web content.
🗃️ JDBC: Template used for database interactions.
📝 SQL: Used to create and manage the movies table in the database.
Instructions
📄 POJO Definition:
Define a class Movie with attributes: id, name, genre, and release year.
💾 Database Setup:
Create a schema.sql file to define the movies table.
🔧 Controller Setup:
Implement methods to handle HTTP GET and POST requests.
Use JDBC templates for database operations.
🌐 Thymeleaf Integration:
Design web pages to display movie data.
Implement forms for user input and movie filtering.
🚀 Run the Application:
Deploy the application on a server and access the web interface to manage movies.
Project Structure
🗃️ Model: Contains the Movie POJO and database interaction logic.
🔧 Controller: Handles HTTP requests and manages interactions between the model and view.
🌐 View: Contains Thymeleaf templates for displaying movie data.
