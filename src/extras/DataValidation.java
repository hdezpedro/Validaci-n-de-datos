/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extras;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DataValidation {
    public int string2Int(String value){
        int result = 0;
        try{
            result = Integer.parseInt(value);
            
        }catch(NumberFormatException err){
            JOptionPane.showMessageDialog(null, "Error caracter no valido");
            result = 0;
        }
        return result;
    }
}
