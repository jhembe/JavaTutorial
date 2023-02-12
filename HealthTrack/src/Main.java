import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Creating the grid pane
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        // Adding the labels and text fields
        Label nameLabel = new Label("Name:");
        gridPane.add(nameLabel, 0, 0);
        TextField nameField = new TextField();
        gridPane.add(nameField, 1, 0);

        Label ageLabel = new Label("Age:");
        gridPane.add(ageLabel, 0, 1);
        TextField ageField = new TextField();
        gridPane.add(ageField, 1, 1);

        Label weightLabel = new Label("Weight:");
        gridPane.add(weightLabel, 0, 2);
        TextField weightField = new TextField();
        gridPane.add(weightField, 1, 2);

        Label heightLabel = new Label("Height:");
        gridPane.add(heightLabel, 0, 3);
        TextField heightField = new TextField();
        gridPane.add(heightField, 1, 3);

        Label bloodPressureLabel = new Label("Blood Pressure:");
        gridPane..add(bloodPressureLabel, 0, 4);
        TextField bloodPressureField = new TextField();
        gridPane.add(bloodPressureField, 1, 4);

        // Adding the submit button
        Button submitButton = new Button("Submit");
        gridPane.add(submitButton, 1, 5);

// Adding an event listener to the submit button
        submitButton.setOnAction(event -> {
            try {
                // Establishing a connection to the database
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/health_tracker", "acacia", "password");

                // Inserting the user's health information into the database
                PreparedStatement statement = connection.prepareStatement("INSERT INTO health_data (name, age, weight, height, blood_pressure, date_added) VALUES (?, ?, ?, ?, ?, CURDATE())");
                statement.setString(1, nameField.getText());
                statement.setInt(2, Integer.parseInt(ageField.getText()));
                statement.setFloat(3, Float.parseFloat(weightField.getText()));
                statement.setFloat(4, Float.parseFloat(heightField.getText()));
                statement.setString(5, bloodPressureField.getText());
                statement.executeUpdate();

                // Closing the connection
                connection.close();

                // Clearing the text fields
                nameField.setText("");
                ageField.setText("");
                weightField.setText("");
                heightField.setText("");
                bloodPressureField.setText("");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        });

// Setting the scene and showing the stage
        Scene scene = new Scene(gridPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
