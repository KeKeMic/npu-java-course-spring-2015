/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/**
 *
 * @author STP
 */


public class ClickButton extends JButton{
    
    public ClickButton (MainFrame owner,String name,String operator,JTextField text, Calculator calculator){ //,Calculator calculator){
        this.setText(name);
        this.Owner = owner;
        this.Operator = operator;
        setPreferredSize(new java.awt.Dimension(50, 50));
        mCalculator = calculator;
        
        ActionListener taskPerformer = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                switch(Operator)
                {
                    case "1": 
                        mCalculator.appendDot();
                        text.setText(mCalculator.getDisplay());
                        break;
                    case "2":
                        mCalculator.appendDigit(Integer.parseInt(name));
                        text.setText(mCalculator.getDisplay());
                        break;
                    case "3":
                        mCalculator.performOperation(name);
                        break;
                }
            }
         };
    }

    private final Calculator mCalculator;
    private final MainFrame Owner;
    private final String Operator;
}
