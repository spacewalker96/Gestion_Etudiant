package sample.controller;
import com.jfoenix.controls.JFXRadioButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;
import sample.database.DatabaseHandler;
import sample.model.Etudiant;

public class Controller {

    @FXML
    private TextField inputNom;

    @FXML
    private TextField inputPrenom;

    @FXML
    private TextField inputEmail;

    @FXML
    private TextField inputTelephone;

    @FXML
    private ToggleGroup radio;


    @FXML
    void createEtudiant() {
        DatabaseHandler databaseHandler = new DatabaseHandler();
        String nom = inputNom.getText();
        String prenom = inputPrenom.getText();
        String email = inputEmail.getText();
        String telephone = inputTelephone.getText();
        JFXRadioButton rb = (JFXRadioButton)radio.getSelectedToggle();
        String speciality = rb.getText();
        Etudiant etudiant = new Etudiant(nom, prenom, email, telephone,speciality);
        databaseHandler.addetudiant(etudiant);
        //System.out.println(rb.getText());
    }

    public void listEtudiant(ActionEvent actionEvent) {
        DatabaseHandler databaseHandler = new DatabaseHandler();




    }
}
