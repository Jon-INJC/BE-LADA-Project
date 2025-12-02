import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainStage extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sign Up");
        try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Sign_up.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        primaryStage.setResizable(true);
        primaryStage.setScene(scene);
        primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
