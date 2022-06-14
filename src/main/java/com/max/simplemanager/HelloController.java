package com.max.simplemanager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

import java.io.*;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    public ListView<String> clientView;
    @FXML
    public ListView<String> serverView;

    @FXML
    public void sendToServerbutton(ActionEvent actionEvent) throws IOException {
        try (FileInputStream fis = new FileInputStream(System.getProperty("user.home")); FileOutputStream sof = new FileOutputStream("/home")) {
            int c;
            while ((c = fis.read()) != -1) {
                sof.write(c);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        clientView.getSelectionModel().getSelectedItems();
    }

    @FXML
    public void receiveFromServerButton(ActionEvent actionEvent) {

    }

    public void showClientFiles() {
        File file = new File(System.getProperty("user.home"));
        clientView.getItems().addAll(file.list());
    }

    public void showServerFiles() {
        File file = new File("/home");
        serverView.getItems().addAll(file.list());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        showClientFiles();
        showServerFiles();
    }
}