/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
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
public class FXMLNavegacionController implements Initializable {

    String destino;
    ArrayList<String> instrucciones;
    Iterator<String> it = instrucciones.iterator();
    private BorderPane borderPaneFX;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    /**
     * Forma manual de reproducir la siguiente indiccación de dirección. Llama
     * al método reproducir instrucción.
     *
     * @param event
     */
    @FXML
    private void reproducirSiguienteInstruccion(MouseEvent event) {
        reproducirInstuccion();
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
     * Permiter activar/desactivar la ejecución del método reproducirInstuccion();
     * 
     * @param event 
     */
    @FXML
    private void pararContinuarNavegacion(MouseEvent event) {
        
    }

    /**
     * Recibe la ubicacion desde la ventana principal
     *
     * @param
     */
    void initStage(String destino) {
        /* Captura la ubicacion actual del GPS */
        // Ubicacion origen = ubicacionActual();

        /* Se crea una ruta a partir del origen y destino */
        // Ruta ruta = new Ruta(origen, destino);
        System.out.println("iniciando ruta...");
        // ruta.calcularRuta();
        // instrucciones = ruta.getInstrucciones();
    }

    /**
     * Llama a un programa externo para comprobar si hay obstaculos cerca
     *
     * @param event
     */
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

    /*
        Una clase externa llamará al método reproducirInstuccion() cada vez que 
        el usuario avance su recorrido y la geolocalización se actualice.
        También se avanzará en el ArrayList a la siguiente posición (instrucción)
     */
    
    /**
     * Reproduce la siguiente indicación
     */
    private void reproducirInstuccion() {
        /* Reproducir la siguiente instrucción */
    }

}
