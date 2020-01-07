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

    public TextField getPhoneNumber_tf() {
        return phoneNumber_tf;
    }

    @FXML
    public void onButtonClicked(ActionEvent e) throws IOException {
        save_btn.setText("Saved");
        try {
            Thread.sleep(300);
        } catch (InterruptedException e1) {
            e1.printStackTrace();
        }
        save_btn.setText("Saved");
        RadioButton selectedRadioButton = (RadioButton) gender.getSelectedToggle();
        System.out.println(dateOfBirth_dp.getValue());
        String dob = String.valueOf(dateOfBirth_dp.getValue());

        DataBase.writeToDatabase(firstName_tf.getText(), lastName_tf.getText(), dob, selectedRadioButton.getText(), phoneNumber_tf.getText(), email_tf.getText(), address_tf.getText());
        Controller2.stage.close();
    }


}
//=================================
