package Patterns.Behavioral.Command;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 1:57 PM
 */
public class FileInvoker {

    public Command command;

    public FileInvoker(Command c){
        this.command=c;
    }

    public void execute(){
        this.command.execute();
    }
}
