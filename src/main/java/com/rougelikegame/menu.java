package com.rougelikegame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class menu extends Application {

    public void start(Stage primaryStage) {

        Menu settings = new Menu("Settings");

        MenuItem item1 = new MenuItem("Video/Graphics");
        MenuItem item2 = new MenuItem("Audio");
        MenuItem item3 = new MenuItem("Gameplay");
        MenuItem item4 = new MenuItem("Exit");

        settings.getItems().addAll(item1,item2,item3,item4);

        MenuBar settingsBar = new MenuBar(settings);
        settingsBar.setTranslateX(300);
        settingsBar.setTranslateY(350);

        Group root = new Group(settingsBar);
        Scene scene = new Scene(root,640,480, Color.BLANCHEDALMOND);
        primaryStage.setTitle("Menu Test");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
