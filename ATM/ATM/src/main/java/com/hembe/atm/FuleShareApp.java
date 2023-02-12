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
        import javafx.scene.Scene;
        import javafx.scene.control.Button;
        import javafx.scene.control.Label;
        import javafx.scene.control.TextField;
        import javafx.scene.layout.GridPane;
        import javafx.stage.FileChooser;
        import javafx.stage.Stage;

public class FuleShareApp extends Application {
    private File selectedFile;

    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("File Sharing Application");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label fileLabel = new Label("File:");
        grid.add(fileLabel, 0, 1);

        TextField fileTextField = new TextField();
        fileTextField.setEditable(false);
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
                        OutputStream outputStream = socket.getOutputStream();
                        FileInputStream fileInputStream = new FileInputStream(selectedFile);
                        byte[] buffer = new byte[4096];
                        int bytesRead;
                        while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                            outputStream.write(buffer, 0, bytesRead);
                        }
                        outputStream.close();
                        fileInputStream.close();
                        socket.close();
                        serverSocket.close();
                        System.out.println("File shared successfully.");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        grid.add(shareButton, 1, 2);

        Scene scene = new Scene(grid, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
