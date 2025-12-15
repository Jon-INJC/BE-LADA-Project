import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;

public class Main_Controller {

    @FXML
    private PasswordField CO_Pas_TXT;

    @FXML
    private TextField Email_TXT;

    @FXML
    private TextField F_Name_TXT;

    @FXML
    private ImageView ImageView_ID;

    @FXML
    private ImageView ImageView_PIC;

    @FXML
    private TextField L_Name_TXT;

    @FXML
    private StackPane Left_StackPane;

    @FXML
    private TextField P_Number_TXT;

    @FXML
    private PasswordField Pass_TXT;

    @FXML
    private VBox Right_Vbox;

    @FXML
    private Button Sign_upBTN;

    @FXML
    private Label Sign_upLabel;

    @FXML
    void On_Id_Upload(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select ID Image");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString());
            ImageView_ID.setImage(image);
        }

    }

    @FXML
    void On_Pic_Upload(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select personal photo");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        File selectedFile = fileChooser.showOpenDialog(null);

        if (selectedFile != null) {
            Image image = new Image(selectedFile.toURI().toString());
            ImageView_PIC.setImage(image);
        }

    }

    @FXML
    void On_sign_up(ActionEvent event) {

    }

}
