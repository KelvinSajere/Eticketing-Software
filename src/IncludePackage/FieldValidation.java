/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package IncludePackage;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Kelvin E Sajere
 */
public class FieldValidation {

    public FieldValidation() {
    }
    
    public static boolean EmailValidation(JComponent data){
    
    JTextComponent field=(JTextComponent) data;
        String theData=field.getText();
        return theData.matches("^(.+)@(.+)$");//this statement returns the name true if its not equal to null
    
    }
     public static void ErrorDisplay(ArrayList<String> theError) {
        String Output = "";
        for (String ErrorMessage1 : theError) {
            String Error = ErrorMessage1;
            Output += "<html><font color='#ff0033'><strong>" + Error + "</strong></html>\n";
        }
        JOptionPane.showMessageDialog(null, Output, "Some Fields are empty", JOptionPane.ERROR_MESSAGE);

    }
    
}
