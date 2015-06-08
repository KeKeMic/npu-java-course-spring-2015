/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import javax.swing.JButton;

/**
 *
 * @author STP
 */


public class ClickButton extends JButton{
    private final Calculator mCalculator;
    public ClickButton (String name, Calculator calculator){
        this.setText(name);
        mCalculator = calculator;
    }
}
