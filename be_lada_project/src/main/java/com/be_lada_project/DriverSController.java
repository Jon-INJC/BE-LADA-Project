package com.be_lada_project;
import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

public class DriverSController {
    @FXML
    private PasswordField CO_PassTXT;

    @FXML
    private TextField Email_TXT;

    @FXML
    private TextField F_NameTXT;

    @FXML
    private Label Header;

    @FXML
    private TextField L_NameTXT;

    @FXML
    private ImageView ImageView;

    @FXML
    private TextField PH_NOTXT;

    @FXML
    private PasswordField Pass_TXT;

    @FXML
    private Button Reg_BTN;

    @FXML
    private TextField TIN_TXT;

    @FXML
    private Button Upload_BTN;

    @FXML
    void On_Reg_BTN(ActionEvent event) {

    }

    @FXML
    void On_Upload_BTN(ActionEvent event) {
        FileChooser filechooser = new FileChooser();
        filechooser.setTitle("Select Driver's License Image");

        filechooser.getExtensionFilters().add(
            new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg")
        );

        File selectedfile = filechooser.showOpenDialog(null);

        if(selectedfile != null){
            Image image = new Image(selectedfile.toURI().toString());
            ImageView.setImage(image);

        }

    }
}
