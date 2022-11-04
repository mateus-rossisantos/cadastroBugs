package com.example.cadastrobugsmateus.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.stage.Stage;

public class BugController {

    @FXML
    private ToggleGroup att;

    @FXML
    private Button cancelButton;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private TextField emailTextField;

    @FXML
    private RadioButton noRadioButton;

    @FXML
    private TextField nomeTextField;

    @FXML
    private Button okButton;

    @FXML
    private ComboBox priorityComboBox;

    @FXML
    private ComboBox systemComboBox;

    @FXML
    private TextField titleTextField;

    @FXML
    private RadioButton yesRadioButton;

    @FXML
    public void initialize() {
        priorityComboBox.getItems().addAll("Baixa", "Média", "Alta");
        systemComboBox.getItems().addAll("Cadastro", "Pedidos", "Faturamento");
    }

    @FXML
    void cancelAction(ActionEvent event) {
        Stage stage = (Stage) cancelButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void confirmAction(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Bug Cadastrado");
        alert.setHeaderText("Olá " + nomeTextField.getText() + ", Bug cadastrado com sucesso.");
        alert.setContentText("Cadastramos o seu e-mail " + emailTextField.getText() + " e retornaremos quando resolvido:\n" +
                "-----------------------------------" + "\n" +
                "Título: " + titleTextField.getText() + "\n" +
                "Sistema: " + systemComboBox.getValue() + "\n" +
                "Prioridade: " + priorityComboBox.getValue() + "\n" +
                "Descrição: " + descriptionTextArea.getText() + "\n" +
                "Alertar sobre atualizações? " + (yesRadioButton.isSelected() ? "Sim" : "Não"));

        alert.showAndWait();
    }

}
