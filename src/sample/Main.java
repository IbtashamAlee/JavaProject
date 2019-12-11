package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class Main extends Application {
    protected static final String appIcon = "sample\\images\\2x\\ic_account_circle_black_48dp.png";
    protected static final String title = "Contacts";

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("DisplayContacts.fxml"));

        primaryStage.setTitle(title);
        primaryStage.getIcons().add(new Image(appIcon));
        primaryStage.setScene(new Scene(root, 720, 610));
        primaryStage.show();
        primaryStage.setOnCloseRequest(event -> Platform.exit());
    }
}
