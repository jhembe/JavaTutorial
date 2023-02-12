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
        import javafx.stage.FileChooser;
        import javafx.stage.Stage;

        import java.io.File;
        import java.io.IOException;
        import java.net.ServerSocket;
        import java.net.Socket;

public class FileSharingApp extends Application {
    private File selectedFile;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("File Sharing Application");

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));

        Text sceneTitle = new Text("File Sharing Application");
        sceneTitle.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));
        grid.add(sceneTitle, 0, 0, 2, 1);

        Label fileLabel = new Label("File:");
        grid.add(fileLabel, 0, 1);

        TextField fileTextField = new TextField();
        grid.add(fileTextField, 1, 1);

        Button fileButton = new Button("Choose File");
        fileButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                FileChooser fileChooser = new FileChooser();
                selectedFile = fileChooser.showOpenDialog(primaryStage);
                if (selectedFile != null) {
                    fileTextField.setText(selectedFile.getAbsolutePath());
                }
            }
        });
        grid.add(fileButton, 2, 1);

        Button shareButton = new Button("Share File");
        shareButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (selectedFile != null) {
                    try {
                        ServerSocket serverSocket = new ServerSocket(8888);
                        System.out.println("Waiting for client...");
                        Socket socket = serverSocket.accept();
                        System.out.println("Client connected.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        grid.add(shareButton, 1, 2);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}



