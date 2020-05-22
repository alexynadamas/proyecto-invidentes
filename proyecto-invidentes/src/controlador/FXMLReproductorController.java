/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alex Clemente < DAW >
 */
public class FXMLReproductorController implements Initializable {

    @FXML
    private BorderPane borderPaneFX;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * Reproduct el auido cargado actual
     *
     * @param event
     */
    @FXML
    private void reproducirPararAudio(MouseEvent event) {
        /* Reproduce el audio del video cargado actualmente */
    }

    /**
     * Carga la ventana principal
     *
     * @param event
     */
    @FXML
    private void cargarVentanaPrincipal(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vista/FXMLPrincipal.fxml"));
            Parent root = (Parent) fxmlLoader.load();

            Stage stage = (Stage) borderPaneFX.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Menú principal");

            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error al cargar la interfaz gráfica.");
        }
    }

    /**
     * Carga el anterior audio, listo para ser reproducido
     *
     * @param event
     */
    @FXML
    private void cargarAnteriorAudio(MouseEvent event) {
        /* Carga el auteior audio desde la unidad de almacenamiento */
    }

    /**
     * Carga el siguiente audio, listo para ser reproducido
     *
     * @param event
     */
    @FXML
    private void cargarSiguienteAudio(MouseEvent event) {
        /* Carga el auteior audio desde la unidad de almacenamiento */
    }

}
