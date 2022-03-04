package com.rougelikegame;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class menu extends Application {

    public void start(Stage primaryStage) {
        javafx.scene.text.Font.getFamilies();
        javafx.scene.text.Font.getFontNames();
        //Title Text
        Text title = new Text();

        title.setText("Roguelike Game");
        title.setFont(Font.font ("Impact", 40));
        title.setFill(Color.BLACK);
        title.setTextAlignment(TextAlignment.CENTER);




        //placing menu pieces
        Button SetMainButton = new Button();
            SetMainButton.setText("Settings");
            SetMainButton.setAlignment(Pos.CENTER);
            SetMainButton.setTranslateY(240);

       Button ExitButton = new Button();
            ExitButton.setText("Exit Game");
            ExitButton.setAlignment(Pos.CENTER);
            ExitButton.setTranslateY(280);

            ExitButton.setOnAction(actionEvent -> {
                Platform.exit();
            });

        Button PlayButton = new Button();
            PlayButton.setText("Play Game");
            PlayButton.setAlignment(Pos.CENTER);
            PlayButton.setTranslateY(200);

        Button ContButton = new Button();
            ContButton.setText("Continue");
            ContButton.setAlignment(Pos.CENTER);
            ContButton.setTranslateY(160);

        HBox root = new HBox();


        root.getChildren().addAll(PlayButton, ContButton, SetMainButton, ExitButton, title);

        Scene scene = new Scene(root, 1280, 720);
        primaryStage.setTitle("Menu Test");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
