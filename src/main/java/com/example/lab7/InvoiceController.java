package com.example.lab7;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class InvoiceController {
    private Stage stage;
    private Scene scene;
    private Parent parent;

    @FXML
    private PasswordField password;

    @FXML
    private Label error;

    @FXML
    private Button signIn;

    @FXML
    private TextField userID;

    @FXML
    void setSignIn (ActionEvent event)throws IOException {
        if(userID.getText().equals("") || password.getText().equals("")){
            error.setText("ID or Password is empty");
            error.setTextFill(Color.RED);
        }
        if(userID.getText().equals("moon") && password.getText().equals("moon")){
            FXMLLoader loader = new FXMLLoader(getClass().getResource("shop.fxml"));
            parent = loader.load();
            stage = (Stage)((Node)event.getSource()).getScene().getWindow(); //Resizing window in passes parameter
            scene = new Scene(parent);
            stage.setScene(scene);
            stage.show();
        }
    }

}