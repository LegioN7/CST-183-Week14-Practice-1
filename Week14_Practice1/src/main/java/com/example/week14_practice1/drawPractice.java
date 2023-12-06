package com.example.week14_practice1;

// References
// https://docs.oracle.com/javafx/2/canvas/jfxpub-canvas.htm
// https://learn.zybooks.com/zybook/DELTACST183KlinglerFall2023/chapter/9/section/1

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class drawPractice extends Application {
    @Override
    public void start(Stage applicationStage) {
        Pane pane = new Pane();
        Scene scene = new Scene(pane);
        Canvas canvas = new Canvas(1920, 1080);

        // Get the graphics context of the canvas
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        // I want to create an Oval
        Color ovalColor = Color.rgb(0, 0, 255);
        graphicsContext.setFill(ovalColor);
        graphicsContext.fillOval(10, 10, 100, 100);

        // Let's add a rectangle
        Color rectangleColor = Color.rgb(255, 0, 0);
        graphicsContext.setFill(rectangleColor);
        graphicsContext.fillRect(100, 100, 100, 100);


        pane.getChildren().add(canvas);
        applicationStage.setTitle("Week 14 - Practice 1");
        applicationStage.setScene(scene);
        applicationStage.show();
    }

    public static void main(String [] args) {
        launch(args); // Launch application
    }
}