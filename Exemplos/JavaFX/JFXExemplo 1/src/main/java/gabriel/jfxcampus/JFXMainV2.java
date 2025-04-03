package gabriel.learnspring.jfxcampus;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.*;
import javafx.stage.Stage;

public class JFXMainV2 extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        Button btn2 = new Button();
        btn2.setText("Olá Teste 222222");
        btn1.setText("Olá humanos?");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Teste 2222");
            }
        });
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Olá!");
            }
        });

        // criando um triângulo retângulo
        Polygon poly = new Polygon();
        poly.getPoints().addAll(
                100.0, 10.0,
                100.0, 100.0,
                10.0, 100.0

        );
        poly.setLayoutX(60);
        poly.setLayoutY(100);
        Stop[] stops = new Stop[] {
                new Stop(0, Color.BLACK), new Stop(1, Color.BLUE)
        };
        poly.setFill(new LinearGradient(0, 0, 1, 0, true, CycleMethod.NO_CYCLE, stops));
        String p = poly.toString();
        System.out.println(p);

        Rectangle rect = new Rectangle(20, 20, 100, 100);
        rect.setFill(Color.GREEN);
        rect.setStroke(Color.BLACK);
        rect.setStrokeWidth(2.5);

        btn1.setLayoutY(100);
        btn1.setLayoutX(125);

        HBox hBox = new HBox();
        hBox.getChildren().addAll(btn1, btn2);
        hBox.maxHeight(100);

        hBox.setLayoutY(200);
        Group root = new Group();
        root.getChildren().addAll(hBox, rect, poly);


        Scene scene = new Scene(root, 300, 250, Color.DARKGRAY);

        primaryStage.setTitle("Marshtomp");
        primaryStage.setScene(scene);
        primaryStage.show();
    } // fim do méthod start

    public static void main(String[] args) {
        launch(args);
    }
}