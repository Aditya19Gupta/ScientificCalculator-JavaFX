package com.cal.scientificcalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.jetbrains.annotations.NotNull;

public class HelloController {

    private String operator="";
    @FXML
    private Label iofield;
    private boolean start=true;
    private float n1=0;
    private float n2=0;
    Calculate cal=new Calculate();
    @FXML
    public void getNumber(ActionEvent e){

        if(start) {
            iofield.setText("");
            start = false;
        }
        iofield.setText("");
        String number  = ((Button) e.getSource()).getText();
        iofield.setText(iofield.getText()+number);

    }
    @FXML
    public void operateCal(ActionEvent e){
        String value = ((Button) e.getSource()).getText();
        if(!value.equals("Ans")) {

            if(!operator.isEmpty()) return;
            operator=value;
            n1 =Float.parseFloat(iofield.getText());
            System.out.println("yes");
            iofield.setText("");
        }else{
            if(operator.isEmpty()) return;;
            n2=Float.parseFloat(iofield.getText());
            float output=this.cal.calculateOperation(n1,n2,operator);
            System.out.println(output);
            iofield.setText(String.valueOf(output)+" ");
            operator="";
        }
    }
    @FXML
    public void calculateSpecialOperation(ActionEvent e){
        String value=((Button)e.getSource()).getText();
        if(!operator.isEmpty())
            return;

        operator = value;
        n1=Float.parseFloat(iofield.getText());
        iofield.setText("");

        float output=cal.calculateSpecialOperation(n1,operator);
        iofield.setText(String.valueOf(output));
        operator="";

    }
    @FXML
    public void clear(ActionEvent e){
        operator="";
        start=true;
        iofield.setText("");
    }
}