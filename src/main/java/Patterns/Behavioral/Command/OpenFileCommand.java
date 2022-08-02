package Patterns.Behavioral.Command;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 1:55 PM
 */

public class OpenFileCommand implements Command {

    private final FileSysReceiver fileSystem;

    public OpenFileCommand(FileSysReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        //open command is forwarding request to openFile method
        this.fileSystem.openFile();
    }

}