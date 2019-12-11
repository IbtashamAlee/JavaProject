package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import javafx.scene.image.Image;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {
    Stage stage = new Stage();
    Std s1 = new Std("qeqweq", "123123");
    ObservableList list = FXCollections.observableArrayList(
            s1, new Std("Ali", "1312313")
    );
    @FXML
    private TableView<Std> tbl = new TableView<>();
    @FXML
    private Button load;
    @FXML
    private TableColumn<Std, String> nameCol;
    @FXML
    private TableColumn<Std, String> numberCol;

    @FXML
    public void handle(ActionEvent e) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        numberCol.setCellValueFactory(new PropertyValueFactory<>("C2"));
        tbl.setItems(list);

    }

    @FXML
    public void addContact(ActionEvent e) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Sample.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();


            stage.getIcons().add(new Image(Main.appIcon));
            stage.setResizable(false);
            stage.setTitle(Main.title);
            stage.setScene(new Scene(root1));
            stage.setMaxHeight(610);
            stage.setMaxWidth(425);
            stage.setMinHeight(610);
            stage.setMinWidth(425);
            stage.setMaximized(false);
            stage.show();
        } catch (Exception a) {
            a.getStackTrace();
        }


    }
}
