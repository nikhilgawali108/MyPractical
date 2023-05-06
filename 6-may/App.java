package jdbc_proj_3.demo_3;

import java.sql.*;
import java.util.Scanner;

public class App {
    private static final String JDBC_URL = "jdbc:mysql://localhost/library_db";
    private static final String USERNAME = "your_username";
    private static final String PASSWORD = "your_password";

    // Method to create a new table in the database
    public void createTable() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {
            String query = "CREATE TABLE IF NOT EXISTS books (" +
                    "bookid INT PRIMARY KEY," +
                    "bookname VARCHAR(100) NOT NULL," +
                    "authorname VARCHAR(100) NOT NULL)";
            statement.executeUpdate(query);
            System.out.println("Table created successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to add new data to the table
    public void addBook(int bookid, String bookname, String authorname) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO books (bookid, bookname, authorname) VALUES (?, ?, ?)")) {
            preparedStatement.setInt(1, bookid);
            preparedStatement.setString(2, bookname);
            preparedStatement.setString(3, authorname);
            preparedStatement.executeUpdate();
            System.out.println("Book added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to delete data from the table based on bookid
    public void deleteBook(int bookid) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "DELETE FROM books WHERE bookid = ?")) {
            preparedStatement.setInt(1, bookid);
            int rowsDeleted = preparedStatement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Book with bookid " + bookid + " does not exist.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to update data in the table based on bookid
    public void updateBook(int bookid, String newBookName, String newAuthorName) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE books SET bookname = ?, authorname = ? WHERE bookid = ?")) {
            preparedStatement.setString(1, newBookName);
            preparedStatement.setString(2, newAuthorName);
            preparedStatement.setInt(3, bookid);
            int rowsUpdated = preparedStatement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Book updated successfully.");
            } else {
                System.out.println("Book with bookid " + bookid + " does not exist.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method to view all the data in the table
    public void viewAllBooks() {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery("SELECT * FROM books")) {
            while (resultSet.next()) {
                int bookid = resultSet.getInt("bookid");
                String bookname = resultSet.getString("bookname");
                String authorname = resultSet.getString("authorname");
                System.out.println("Book ID: " + bookid + ", Book Name: " + bookname + ", Author Name: " + authorname);
            }
        } catch (SQLException e) {            
        	e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        App libraryManagementSystem = new App();
        Scanner scanner = new Scanner(System.in);

        // Creating the table
        libraryManagementSystem.createTable();

        // Menu
        while (true) {
            System.out.println("Library Management System");
            System.out.println("1. Add a new book");
            System.out.println("2. Delete a book");
            System.out.println("3. Update a book");
            System.out.println("4. View all books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the book ID: ");
                    int bookId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the book name: ");
                    String bookName = scanner.nextLine();
                    System.out.print("Enter the author name: ");
                    String authorName = scanner.nextLine();

                    libraryManagementSystem.addBook(bookId, bookName, authorName);
                    break;
                case 2:
                    System.out.print("Enter the book ID to delete: ");
                    int deleteBookId = scanner.nextInt();
                    libraryManagementSystem.deleteBook(deleteBookId);
                    break;
                case 3:
                    System.out.print("Enter the book ID to update: ");
                    int updateBookId = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter the new book name: ");
                    String newBookName = scanner.nextLine();
                    System.out.print("Enter the new author name: ");
                    String newAuthorName = scanner.nextLine();

                    libraryManagementSystem.updateBook(updateBookId, newBookName, newAuthorName);
                    break;
                case 4:
                    libraryManagementSystem.viewAllBooks();
                    break;
                case 5:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

           
