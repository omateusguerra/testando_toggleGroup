package com.example.estudosjavafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        VBox vbox = new VBox();
        vbox.setSpacing(10);
        vbox.setPadding(new Insets(10));
        vbox.setPrefSize(400, 300);

        HBox hBox = new HBox();
        hBox.setSpacing(10);

        ToggleGroup toggleGroup = new ToggleGroup();
        RadioButton rbMasculino = new RadioButton("Masculino");
        RadioButton rbFeminino = new RadioButton("Feminino");
        rbMasculino.setToggleGroup(toggleGroup);
        rbFeminino.setToggleGroup(toggleGroup);


        hBox.getChildren().addAll(rbFeminino, rbMasculino);

        TextField tfNome = new TextField();
        tfNome.setPromptText("Nome");

        TextField tfNota1 = new TextField();
        tfNota1.setPromptText("Nota 1");

        TextField tfNota2 = new TextField();
        tfNota2.setPromptText("Nota 2");

        Button btnCalcular = new Button("Calcular");

        CheckBox cheBox1 = new CheckBox("Tecnicas de Programação");
        CheckBox cheBox2 = new CheckBox("Banco de Dados");
        CheckBox cheBox3 = new CheckBox("Engenharia de Software");

        vbox.getChildren().addAll(tfNome, tfNota1, tfNota2, hBox, btnCalcular, cheBox1, cheBox2, cheBox3);
        Scene scene = new Scene(vbox);

        stage.setScene(scene);
        stage.show();

        btnCalcular.setOnAction(e -> {
            RadioButton rbSelected = (RadioButton) toggleGroup.getSelectedToggle();
            System.out.println(rbSelected.getText());
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}