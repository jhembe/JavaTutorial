package com.hembe.atm;


import java.io.File;
        import java.io.FileInputStream;
        import java.io.IOException;
        import java.io.OutputStream;
        import java.net.ServerSocket;
        import java.net.Socket;
        import javafx.application.Application;
        import javafx.event.ActionEvent;
        import javafx.event.EventHandler;
        import javafx.geometry.Insets;
        import javafx.geometry.Pos;
        import javafx.scene.Scene;
        import javafx.scene.control.Alert;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.GridPane;
        import javafx.stage.FileChooser;
        import javafx.stage.Stage;

public class FILEModern1 extends Application {
    private File selectedFile;

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("File Sharing Application");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20, 20, 20, 20));
        grid.setVgap(8);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);

        Label fileLabel = new Label("File:");
        grid.add(fileLabel, 0, 0);

        TextField fileTextField = new TextField();
        fileTextField.setEditable(false);
        grid.add(fileTextField, 1, 0);

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
        grid.add(fileButton, 2, 0);

        Button shareButton = new Button("Share File");
        shareButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (selectedFile == null) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("No file selected");
                    alert.setContentText("Please select a file to share.");
                    alert.showAndWait();
                    return;
                }

                try {
                    ServerSocket serverSocket = new ServerSocket(8888);
                    System.out.println("Waiting for client...");
                    Socket socket = serverSocket.accept();
                    System.out.println("Client connected.");
                    OutputStream outputStream = socket.getOutputStream();
                    FileInputStream fileInputStream = new FileInputStream(selectedFile);
                    byte[] buffer = new byte[4096];
                    int bytesRead;
                    while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                        outputStream.write(buffer, 0, bytesRead);
                    }
                    fileInputStream.close();
                    outputStream.close();
                    socket.close();
                    serverSocket.close();
                    System.out.println("File shared successfully.");
                } catch (IOException e) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setHeaderText("An error occurred");
                    alert.setContentText("Failed to share the file: " + e.getMessage());
                    alert.showAndWait();
                }
            }
        });
        grid.add(shareButton, 1, 1);

        Scene scene = new Scene(grid, 500, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
