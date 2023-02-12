package com.hembe.atm;

import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.GridPane;
        import javafx.scene.text.Font;
        import javafx.scene.text.FontWeight;
        import javafx.scene.text.Text;
        import javafx.stage.Stage;

public class ATMApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("ATM Simulator");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("Welcome to ATM Simulator");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label accountNumber = new Label("Account Number:");
        grid.add(accountNumber, 0, 1);

        TextField accountNumberTextField = new TextField();
        grid.add(accountNumberTextField, 1, 1);

        Label password = new Label("Password:");
        grid.add(password, 0, 2);

        TextField passwordTextField = new TextField();
        grid.add(passwordTextField, 1, 2);

        Button btn = new Button("Sign in");
        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Sign in button clicked!");
            }
        });

        grid.add(btn, 1, 4);

        Scene scene = new Scene(grid, 300, 275);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
