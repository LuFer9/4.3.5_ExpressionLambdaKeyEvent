/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expressionlambdakeyevent4.pkg3.pkg5;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Luis
 */
public class ExpressionLambdaKeyEvent435 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        
        HBox root = new HBox();
        Pane pane = new Pane();
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Expression lambda keyEvent");
        primaryStage.setScene(scene);
        
        //Creamos el nodo text
        Text text = new Text(20, 20, "A");
        
        //Añadimos el texto al pane
        root.getChildren().add(pane);
        pane.getChildren().add(text);
        
        
        //Registramos el evento
        //scene.setOnKeyPressed lo controla la escena por lo tanto no hace falta el text.requestFocus(); de abajo
        text.setOnKeyPressed(event -> {
            
            System.out.println("pulsado");
            KeyCode codigoTecla = event.getCode();
            
            if(codigoTecla.equals(KeyCode.UP)){
                text.setY(text.getY() - 10);
            }
            if(codigoTecla == KeyCode.DOWN){
                text.setY(text.getY() + 10);
            }
            if(codigoTecla == KeyCode.RIGHT){
                text.setX(text.getX() + 10);
            }
            if(codigoTecla == KeyCode.LEFT){
                text.setX(text.getX() - 10);
            }
        });
        
        
        primaryStage.show();
        text.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
