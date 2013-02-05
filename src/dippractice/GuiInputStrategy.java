/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class GuiInputStrategy implements InputStrategy{
    private String msg;
    
    public String inputMessage(){
    String msg = JOptionPane.showInputDialog(null, "Enter your message here.");
    return msg;
    }
}
