package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class Controller {
    public TextField unos;
    public Label ispis;
    public void povecaj(ActionEvent actionEvent) {
        ispis.setText(" ");

        String recenica = unos.getText();
        String[] rijeci = recenica.split(" ");
        String najduza = " ";

        for (int i = 0; i < rijeci.length; i++){
            if (rijeci[i].length() >= najduza.length()) {
                najduza = rijeci[i];
            }
        }

        for(int i = 0; i < rijeci.length; i++){
            if (rijeci[i] == najduza){
                rijeci[i] = rijeci[i].toUpperCase();
            }
            ispis.setText(ispis.getText() + rijeci[i] + " ");
        }

    }
}
