/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dippractice;

/**
 *
 * @author User
 */
public class DIPpractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InputStrategy in = new GuiInputStrategy();
        OutputStrategy out = new GuiOutputStrategy();
        MessageService service = new MessageService(out, in);
        service.inputMessage();
        service.outputMessage();
        
    }
}
