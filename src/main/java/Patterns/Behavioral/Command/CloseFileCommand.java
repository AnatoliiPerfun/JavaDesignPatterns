package Patterns.Behavioral.Command;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 1:56 PM
 */
public class CloseFileCommand implements Command {

    private final FileSysReceiver fileSystem;

    public CloseFileCommand(FileSysReceiver fs){
        this.fileSystem=fs;
    }
    @Override
    public void execute() {
        this.fileSystem.closeFile();
    }

}