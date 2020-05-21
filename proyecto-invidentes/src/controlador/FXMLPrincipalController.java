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
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Alex Clemente < DAW >
 */
public class FXMLPrincipalController implements Initializable {

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
     * Inicia el sistema de navegación, indicando al usuario las direccines que
     * debe tomar
     *
     * @param event
     */
    @FXML
    private void iniciarRuta(MouseEvent event) {
        String destino = null;
        System.out.println("¿Dónde quiere ir?");
        // Recoger ubicacion destino

        /* Carga la ventana de navegacióin */
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vista/FXMLNavegacion.fxml"));
            Parent root = (Parent) fxmlLoader.load();

            Stage stage = (Stage) borderPaneFX.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Navegación");

            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error al cargar la interfaz gráfica.");
        }
    }

    /**
     * Carga la ventana para reproducir audios de video (películas, series, etc)
     *
     * @param event
     */
    @FXML
    private void abrirPanelVideo(MouseEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/vista/FXMLReproductor.fxml"));
            Parent root = (Parent) fxmlLoader.load();

            Stage stage = (Stage) borderPaneFX.getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Reproductor");

            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            System.out.println("Error al cargar la interfaz gráfica.");
        }
    }

    /**
     * Llama a un programa externo para comprobar si hay obstaculos cerca
     *
     * @param event
     */
    @FXML
    private void detectarObstaculos(MouseEvent event) {
        Boolean existenObstaculos = false;
        String posicionObstaculo = null;
        /* Comprobar datos externos */
        if (existenObstaculos) {
            System.out.println("Existen en " + posicionObstaculo);
        } else {
            System.out.println("Todo despejado");
        }
    }

    /**
     * Cierra la ventana principal y con ello la aplicación
     *
     * @param event
     */
    @FXML
    private void cerrarAplicacion(MouseEvent event) {
        Stage estaVentana = (Stage) borderPaneFX.getScene().getWindow();
        estaVentana.close();
    }

}
