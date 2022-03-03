package com.rougelikegame;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
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
        title.setLayoutX(190);
        title.setLayoutY(50);

        //exit bar creation
        Menu exitGame = new Menu("Exit Game");

        //settings bar and menu creation
        Menu settings = new Menu("Settings");

        MenuItem setItem1 = new MenuItem("Video/Graphics");
        MenuItem setItem2 = new MenuItem("Audio");
        MenuItem setItem3 = new MenuItem("Gameplay");
        MenuItem setItem4 = new MenuItem("Controls");
        MenuItem setItem5 = new MenuItem("Exit");

        settings.getItems().addAll(setItem1,setItem2,setItem3,setItem4,setItem5);

        //placing menu pieces
        MenuButton menuSetButton = new MenuButton();
            menuSetButton.setText("Settings");
            menuSetButton.setTranslateX(280);
            menuSetButton.setTranslateY(160);

        MenuButton menuExitButton = new MenuButton();
            menuExitButton.setText("Exit Game");
            menuExitButton.setTranslateX(275);
            menuExitButton.setTranslateY(200);

        Group root = new Group(menuSetButton, menuExitButton, title);
        Scene scene = new Scene(root,640,480, Color.BLANCHEDALMOND);
        primaryStage.setTitle("Menu Test");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
