package layouts_gridpane_parte_2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author JorgeLPR
 */
public class Layouts_GridPane_Parte_2 extends Application {
    
    public void addPrefDimensionButton(Button btn, int width, int height){
        btn.setPrefWidth(width);
        btn.setPrefHeight(height);    
    }

    public void addMaxfDimensionButton(Button btn){
        btn.setMaxWidth(Double.MAX_VALUE);
        btn.setMaxHeight(Double.MAX_VALUE);    
    }
    
    @Override
    public void start(Stage primaryStage) {

        //CREAMOS LOS RESPECTIVOS NODOS HIJOS
        
        //Botonoes Numericos
        Button btn0 = new Button("0");
        Button btn1 = new Button("1");
        Button btn2 = new Button("2");
        Button btn3 = new Button("3");
        Button btn4 = new Button("4");
        Button btn5 = new Button("5");
        Button btn6 = new Button("6");
        Button btn7 = new Button("7");
        Button btn8 = new Button("8");
        Button btn9 = new Button("9");
        
        //Botones Operaciones Matematicas
        Button btnSuma = new Button("+");
        Button btnResta = new Button("-");
        Button btnMultiplicacion = new Button("X");
        Button btnDivision = new Button("/");
        
        Button btnIgual = new Button("=");                
        Button btnBorrar = new Button("C");

        //Campo de operaciones
        TextField textOperaciones = new TextField();
        
        GridPane gridPane = new GridPane();       
        
        //FILA 0
        GridPane.setConstraints(textOperaciones, 0, 0, 4, 1);
        
        //FILA 1
        GridPane.setConstraints(btn7, 0, 1);
        GridPane.setConstraints(btn8, 1, 1);
        GridPane.setConstraints(btn9, 2, 1);
        GridPane.setConstraints(btnSuma, 3, 1);        
        
        //FILA 2
        GridPane.setConstraints(btn4, 0, 2);
        GridPane.setConstraints(btn5, 1, 2);
        GridPane.setConstraints(btn6, 2, 2);
        GridPane.setConstraints(btnResta, 3, 2);        
        
        //FILA 3
        GridPane.setConstraints(btn1, 0, 3);
        GridPane.setConstraints(btn2, 1, 3);
        GridPane.setConstraints(btn3, 2, 3);
        GridPane.setConstraints(btnMultiplicacion, 3, 3);        
        
        //FILA 4
        GridPane.setConstraints(btnBorrar, 0, 4);
        GridPane.setConstraints(btn0, 1, 4);
        GridPane.setConstraints(btnIgual, 2, 4);
        GridPane.setConstraints(btnDivision, 3, 4);        
                
        //Dimension Predefinida y Maxima NODOS HIJOS
        textOperaciones.setMaxWidth(Double.MAX_VALUE);
        textOperaciones.setMaxHeight(Double.MAX_VALUE);
        textOperaciones.setPrefHeight(35);
        
        addPrefDimensionButton(btn0, 55, 35);
        addPrefDimensionButton(btn1, 55, 35);
        addPrefDimensionButton(btn2, 55, 35);
        addPrefDimensionButton(btn3, 55, 35);
        addPrefDimensionButton(btn4, 55, 35);
        addPrefDimensionButton(btn5, 55, 35);
        addPrefDimensionButton(btn6, 55, 35);
        addPrefDimensionButton(btn7, 55, 35);
        addPrefDimensionButton(btn8, 55, 35);
        addPrefDimensionButton(btn9, 55, 35);
        addPrefDimensionButton(btnSuma, 55, 35);
        addPrefDimensionButton(btnResta, 55, 35);
        addPrefDimensionButton(btnMultiplicacion, 55, 35);
        addPrefDimensionButton(btnDivision, 55, 35);
        addPrefDimensionButton(btnBorrar, 55, 35);
        addPrefDimensionButton(btnIgual, 55, 35);        
                
        GridPane.setVgrow(textOperaciones, Priority.ALWAYS);
        GridPane.setVgrow(btn7, Priority.ALWAYS);
        GridPane.setVgrow(btn4, Priority.ALWAYS);
        GridPane.setVgrow(btn1, Priority.ALWAYS);
        GridPane.setVgrow(btnBorrar, Priority.ALWAYS);
        
        GridPane.setHgrow(btn7, Priority.ALWAYS);
        GridPane.setHgrow(btn8, Priority.ALWAYS);        
        GridPane.setHgrow(btn9, Priority.ALWAYS);        
        GridPane.setHgrow(btnSuma, Priority.ALWAYS);        
        
        addMaxfDimensionButton(btn0);
        addMaxfDimensionButton(btn1);
        addMaxfDimensionButton(btn2);
        addMaxfDimensionButton(btn3);
        addMaxfDimensionButton(btn4);
        addMaxfDimensionButton(btn5);
        addMaxfDimensionButton(btn6);
        addMaxfDimensionButton(btn7);
        addMaxfDimensionButton(btn8);
        addMaxfDimensionButton(btn9);
        addMaxfDimensionButton(btnSuma);
        addMaxfDimensionButton(btnResta);
        addMaxfDimensionButton(btnMultiplicacion);
        addMaxfDimensionButton(btnDivision);
        addMaxfDimensionButton(btnBorrar);
        addMaxfDimensionButton(btnIgual);        
                
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setHgap(5);
        gridPane.setVgap(5);
                
        gridPane.getChildren().addAll(btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnSuma, btnResta
                                  ,btnMultiplicacion, btnDivision, btnBorrar, btnIgual, textOperaciones);
        
        StackPane.setMargin(gridPane, new Insets(10));
        
        StackPane root = new StackPane(gridPane);        
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Calcultaor - GRID");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
