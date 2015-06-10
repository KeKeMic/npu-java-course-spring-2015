/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import javax.swing.JFrame;

/**
 *
 * @author STP
 */
public class MainFrame extends JFrame{
    public MainFrame(String title){
        this.setTitle(title);
        this.ClickButtonArray = new ClickButton[20];
        initCimponents();
    }

    private void initCimponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(new GridBagLayout());
        GridBagConstraints Gbc = new GridBagConstraints();
        Gbc.insets = new Insets(2,2,2,2);
        int count = 0;
        
        for(int x = 0; x < 5; x++) {
            for(int y = 0; y < 4; y++){
                Gbc.gridx = y;
                Gbc.gridy = x;
                ClickButtonArray[count] =  new  ClickButton(this,names[count]);
                contentPane.add(ClickButtonArray[count], Gbc);
                count ++;
            }
         }
        this.setVisible(true);
    }
     private final ClickButton [] ClickButtonArray;
     private final String [] names= {"CE","C","←","÷","7","8","9","╳","4","5","6","－","1","2","3","＋","±","0",".","＝"};;
}
