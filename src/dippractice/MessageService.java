
package dippractice;


public class MessageService {
    private String msg;
    private OutputStrategy out;
    private InputStrategy in;
    
    public MessageService(OutputStrategy out, InputStrategy in){
        this.out = out;
        this.in = in;
    }
    
    public void outputMessage(){
        out.outputMessage(msg);
    }
    
    public void inputMessage(){
        msg = in.inputMessage();
    }
}
