import javafx.application.Application;
import javafx.stage.Stage;

public class MainStage extends Application {
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sign Up");
        // Additional setup for the primary stage can be done here
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
    
}
