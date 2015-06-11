/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 * The model class of the calculator application.
 */
public class Calculator {
    
    /**
     * The available operators of the calculator.
     */
    public enum Operator {
        CLEAR,       // C
        CLEAR_ENTRY, // CE
        BACKSPACE,   // ⌫
        EQUAL,       // =
        PLUS,        // +
        MINUS,       // -
        TIMES,       // ×
        OVER,        // ⁄
        PLUS_MINUS,  // ±
        RECIPROCAL,  // 1/x
        PERCENT,     // %
        SQRT,        // √
        MEM_CLEAR,   // MC
        MEM_SET,     // MS
        MEM_PLUS,    // M+
        MEM_MINUS,   // M-
        MEM_RECALL   // MR
    }
    
    public void appendDigit(int digit) {
        // TODO code application logic here
        if(Change == false)
        {
            if(Decimalpoint == false) DigitalA *= 10 + digit;
            else 
            {
                float n = 1;
                for(int i=0; i<Decimalplaces; i++)
                {
                    n = (float) (n * 0.1);
                }
                DigitalA += digit * n ;
            }
        }
        else 
        {
            if(Decimalpoint == false) DigitalB *= 10 + digit;
            else 
            {
                float n = 1;
                for(int i=0; i<Decimalplaces; i++)
                {
                    n = (float) (n * 0.1);
                }
                DigitalB += digit * n ;
            }
        }
    }
    
    public void appendDot() {
        // TODO code application logic here
        if(Decimalpoint = false)
        {
            Decimalpoint = true;
            Decimalplaces++;
        }
    }
    
    public void performOperation(Operator operator) {
        // TODO code application logic here
        Decimalplaces = 0;
        Decimalpoint = false;
        Change = true;
    }
    
    public String getDisplay() {
        // TODO code application logic here
        if(Change == false) return String.valueOf(DigitalA);
        else return  String.valueOf(DigitalB);
    }

    /**
     * @param args the command line arguments
     */
/*    public static void main(String[] args) {
        // TODO code application logic here
    }*/

    private Boolean Change = false;
    private Boolean Decimalpoint = false;
    private float DigitalA;
    private float DigitalB;
    private float Decimalplaces = 0;
}
