package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

public class Controller {
    @FXML
    ToggleGroup gender;
    @FXML
    private TextField firstName_tf, lastName_tf, phoneNumber_tf, email_tf, address_tf;
    @FXML
    private DatePicker dateOfBirth_dp;
    @FXML
    private Button save_btn;

    @FXML
    public void onButtonClicked(ActionEvent e) throws IOException {


        save_btn.setText("Saved");
        RadioButton selectedRadioButton = (RadioButton) gender.getSelectedToggle();
        //       String gender_selected = selectedRadioButton.getText();
//        System.out.println (gender_selected);
        //String dob= String.valueOf (dateOfBirth_dp.getValue ());
        //int phoneN= Integer.parseInt (phoneNumber_tf.getText ());
        //System.out.println (phoneN);
        //System.out.println (phoneNumber_tf.getText ());

        /*try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("DisplayContacts.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.show();
//without titlebar
//            try {
//                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Demo.fxml"));
//                Parent root1 = (Parent) fxmlLoader.load();
//                Stage stage = new Stage();
//                stage.initModality(Modality.APPLICATION_MODAL);
//                stage.initStyle(StageStyle.UNDECORATED);
//                stage.setTitle("ABC");
//                stage.setScene(new Scene(root1));
//                stage.show();
//            }
        }catch (Exception a){
            a.getStackTrace ();
        }==================*/
        //DataBase.writeToDatabase (firstName_tf.getText (),lastName_tf.getText (),(String)dateOfBirth_dp.getAccessibleText(),selectedRadioButton.getText(),phoneNumber_tf.getText(),email_tf.getText (),address_tf.getText ());
        //DataBase.writeToDatabase("Ali", "Jaan", "13-05-2000", "Male", 03217067556, "alleyjaan@gmail.com", "Kasur");
    }


}
//=================================
