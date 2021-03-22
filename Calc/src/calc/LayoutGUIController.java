/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calc;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodEvent;
import javafx.scene.input.KeyEvent;

/**
 * FXML Controller class
 *
 * @author bxray
 */
public class LayoutGUIController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private String crrntArthOp= "DEFAULT";
    private String opd1="0";
    @FXML
    private TextField txtBox;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    

    @FXML
    private void addDigit(ActionEvent event) {
        
        Button btn =(Button)event.getSource();
        switch(btn.getText()){
            case"1": txtBox.setText(txtBox.getText()+"1");break;
            case"2": txtBox.setText(txtBox.getText()+"2");break;
            case"3": txtBox.setText(txtBox.getText()+"3");break;
            case"4": txtBox.setText(txtBox.getText()+"4");break;
            case"5": txtBox.setText(txtBox.getText()+"5");break;
            case"6": txtBox.setText(txtBox.getText()+"6");break;
            case"7": txtBox.setText(txtBox.getText()+"7");break;
            case"8": txtBox.setText(txtBox.getText()+"8");break;
            case"9": txtBox.setText(txtBox.getText()+"9");break;
            case"0": txtBox.setText(txtBox.getText()+"0");break;
        }
    }

    @FXML
    private void arthOp(ActionEvent event) {
        
        if(((Button)event.getSource()).getText().equals("+")){
            if(crrntArthOp.equals("DEFAULT")){
            opd1=txtBox.getText();
                crrntArthOp="ADD";
                txtBox.clear();
        }
        }else{
            if(((Button)event.getSource()).getText().equals("*")){
            if(crrntArthOp.equals("DEFAULT")){
            opd1=txtBox.getText();
                crrntArthOp="MULTIPLY";
                txtBox.clear();
            }
            }else{
            if(((Button)event.getSource()).getText().equals("-")){
            if(crrntArthOp.equals("DEFAULT")){
            opd1=txtBox.getText();
                crrntArthOp="SUBTRACT";
                txtBox.clear();
            }
            }else{
            if(((Button)event.getSource()).getText().equals("/")){
            if(crrntArthOp.equals("DEFAULT")){
            opd1=txtBox.getText();
                crrntArthOp="DIVIDE";
                txtBox.clear();
            }
        }
    }
            }
        }
    }

    @FXML
    private void proccessResult(ActionEvent event) {
        float num1= Float.parseFloat(opd1);
        float num2= Float.parseFloat(txtBox.getText());
        if (crrntArthOp.equals("ADD")){
            txtBox.setText(""+(num1+num2));
            }else{
                    if (crrntArthOp.equals("MULTIPLY")){
            txtBox.setText(""+(num1*num2));
                    }else{
                    if (crrntArthOp.equals("SUBTRACT")){
            txtBox.setText(""+(num1-num2));
                    }else{
                    if (crrntArthOp.equals("DIVIDE")){
            txtBox.setText(""+(num1/num2));
                    }
                    }
                    }
        }
        
    }

    @FXML
    private void clearTxtBox(ActionEvent event) {
        int num1=0;
        int num2=0;
        crrntArthOp= "DEFAULT";
     opd1="0";
        txtBox.clear();
    }

       
}
