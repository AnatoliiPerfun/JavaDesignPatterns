package Patterns.Behavioral.Command;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 1:52 PM
 */
public class LinuxFileSysReceiver implements FileSysReceiver {

    @Override
    public void openFile() {
        System.out.println("Opening file in Linux");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Linux");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Linux");
    }
}
