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
    
    public ClickButton (MainFrame owner,String name){ //,Calculator calculator){
        this.setText(name);
        this.owner = owner;
        setPreferredSize(new java.awt.Dimension(50, 50));
//        mCalculator = calculator;
    }

//    private final Calculator mCalculator;
    private MainFrame owner;
}
