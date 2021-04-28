
package capstoneproject;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;



public class LayoutGUIController implements Initializable {

    @FXML
    private ColorPicker colorPicker;
    @FXML
    private Menu menuBar;
    @FXML
    private MenuItem newButton;
    @FXML
    private MenuItem openButton;
    @FXML
    private MenuItem saveButton;
    @FXML
    private MenuItem undoButton;
    @FXML
    private MenuItem redoButton;
    @FXML
    private TextField bSize;
    @FXML
    private Canvas canvas;
    @FXML
    private TextField currentStroke;

    
 
     @Override
    public void initialize(URL url, ResourceBundle rb) {
        
            
    }    

    @FXML
    private void brushSelected(ActionEvent event) {
    }

    @FXML
    private void paintBucketSelected(ActionEvent event) {
    }

    @FXML
    private void eraserSelected(ActionEvent event) {
    }

    @FXML
    private void txtSelected(ActionEvent event) {
    }

    @FXML
    private void newButtonSelected(ActionEvent event) {
    }

    @FXML
    private void openButtonSelected(ActionEvent event) {
    }

    @FXML
    private void saveButtonSelected(ActionEvent event) {
    }

    @FXML
    private void undoButtonSelected(ActionEvent event) {
    }

    @FXML
    private void redoButtonSelected(ActionEvent event) {
    }

    @FXML
    private void brushSize(ActionEvent event) {
    }

    @FXML
    private void twoPx(ActionEvent event) {
    }

    @FXML
    private void fivePx(ActionEvent event) {
    }

    @FXML
    private void eightPx(ActionEvent event) {
    }

    @FXML
    private void tenPx(ActionEvent event) {
    }

    @FXML
    private void circleSelected(ActionEvent event) {
    }

    @FXML
    private void lineSelected(ActionEvent event) {
    }

    @FXML
    private void rectSelected(ActionEvent event) {
    }
    

}