/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Cliente;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;

/**
 * FXML Controller class
 *
 * @author Iván
 */
public class FXMLpizzeriaController implements Initializable {

    @FXML
    private Pane panelsuperior;
    @FXML
    private TextField tfnombre;
    @FXML
    private TextField tfdireccion;
    @FXML
    private Button btguardardatos;
    @FXML
    private TextField tftelefono;
    @FXML
    private Pane panelpizza;
    @FXML
    private ComboBox<?> cbpizza;
    @FXML
    private RadioButton btpizzagrande;
    @FXML
    private RadioButton btpizzamediana;
    @FXML
    private RadioButton btpizzapequeña;
    @FXML
    private ListView<String> listview;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        panelpizza.setDisable(true);
    }    

    @FXML
    private void guardarcliente(ActionEvent event) {
        String[] food = {"pizza", "ramen", "potatoe"};
        listview.getItems().addAll(food);
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        if (tfnombre.getText().isEmpty() || tfdireccion.getText().isEmpty() || tftelefono.getText().isEmpty()) {
            alerta.setTitle("Error");
            alerta.setHeaderText("Error Introduccion datos");
            alerta.setContentText("Faltan Datos del cliente");
            alerta.showAndWait();
        } else {
            Cliente c = new Cliente(tfnombre.getText(), tfdireccion.getText(), tftelefono.getText());
            alerta.setTitle("Informacion");
            alerta.setHeaderText("Datos Introducidos");
            alerta.setContentText(c.toString());
            alerta.showAndWait();
            // informacion
            System.out.println("info");
            panelpizza.setDisable(false);
        }
    }
    
}
