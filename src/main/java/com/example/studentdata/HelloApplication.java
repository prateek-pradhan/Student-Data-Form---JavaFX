package com.example.studentdata;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloApplication extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Scene scene = new Scene(createVBoxLayout(), 500, 300);
        stage.setTitle("Student Data");
        stage.setScene(scene);
        stage.show();
    }

    public VBox createVBoxLayout() {
        VBox vbox = new VBox();

        vbox.setSpacing(10);
        vbox.setPadding(new Insets(5));
        vbox.setAlignment(Pos.CENTER_LEFT);

        Label regNumberLabel=new Label("Student Registration Number: ");
        Label nameLabel=new Label("Student Name: ");
        Label phoneLabel=new Label("Student Phone: ");
        Label emailLabel=new Label("Student Email: ");

        TextField regNumberTextField=new TextField();
        TextField nameTextField=new TextField();
        TextField phoneTextField=new TextField();
        TextField emailTextField=new TextField();

        Button submitButton=new Button("Submit");

        vbox.getChildren().add(regNumberLabel);
        vbox.getChildren().add(regNumberTextField);
        vbox.getChildren().add(nameLabel);
        vbox.getChildren().add(nameTextField);
        vbox.getChildren().add(phoneLabel);
        vbox.getChildren().add(phoneTextField);
        vbox.getChildren().add(emailLabel);
        vbox.getChildren().add(emailTextField);
        vbox.getChildren().add(submitButton);

        return vbox;
    }
}