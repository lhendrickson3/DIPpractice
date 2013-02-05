
package dippractice;

import java.util.Scanner;

public class ConsoleInputStrategy implements InputStrategy{
    
    public String inputMessage(){
    System.out.println (
    "Enter your message.");
    Scanner scan = new Scanner(System.in); 
    String msg = scan.next();
    return msg;
    }
}
