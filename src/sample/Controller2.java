package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class Controller2 implements Initializable {

    ObservableList list = FXCollections.observableArrayList(
            DataBase.readFromDataBase()
    );
    @FXML
    TableView<SetValues_TableView> tbl = new TableView<>();
    @FXML
    private TextField firstname, lastname, phonenumber, address, email;

    static Stage stage = new Stage();
    @FXML
    private ToggleGroup gender;
    @FXML
    private DatePicker dob;
    @FXML
    private TableColumn<SetValues_TableView, String> nameCol;
    @FXML
    private TableColumn<SetValues_TableView, String> numberCol;

    public Controller2() throws SQLException {
    }

    @FXML
    public void handle(ActionEvent e) {
        Controller c1 = new Controller();

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        numberCol.setCellValueFactory(new PropertyValueFactory<>("C2"));
        tbl.setItems(list);


        tbl.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                System.out.println(tbl.getSelectionModel().getSelectedItems());
                ObservableList<SetValues_TableView> s = tbl.getSelectionModel().getSelectedItems();
                phonenumber.setText(s.get(0).getC2());
                AddContacts addContacts = new AddContacts();
                firstname.setText(addContacts.getFirstName());
                lastname.setText(addContacts.getLastName());
                email.setText(addContacts.getEmail());
                address.setText(addContacts.getAddress());
                dob.setValue(addContacts.getDateOFBirth());
                DataBase.updateData(s.get(0).getC2());
            }

        });

    }

    @FXML
    public void addContact(ActionEvent e) throws IOException, SQLException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Sample.fxml"));
            Parent root1 = fxmlLoader.load();

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
        DataBase.readFromDataBase();
        ObservableList list = FXCollections.observableArrayList(
                DataBase.readFromDataBase()
        );

        tbl.setItems(list);
    }


}
