/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author STP
 */


public class ClickButton extends JButton{
    /**
     * 建構
     * @param owner
     * @param name
     * @param operator
     * @param text
     * @param calculator 
     */
    public ClickButton (MainFrame owner,String name,String operator,JTextField text, Calculator calculator){ //,Calculator calculator){
        this.setText(name);
        this.Owner = owner;
        this.Operator = operator;
        setPreferredSize(new java.awt.Dimension(50, 50));
        mCalculator = calculator;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
    }
    /**
     * 按下按鈕之後執行
     * @param evt
     * @return 
     */
    private String formMouseClicked(MouseEvent evt) {                                  
        switch(Operator)
        {
            case "1": 
                mCalculator.appendDot();
                break;
            case "2":
                mCalculator.appendDigit(Integer.parseInt(this.getText()));
                break;
            case "3":
                mCalculator.performOperation(this.getText());
                break;
        }
        return mCalculator.getDisplay();
    }

    private final Calculator mCalculator;
    private final MainFrame Owner;
    private final String Operator;
}
