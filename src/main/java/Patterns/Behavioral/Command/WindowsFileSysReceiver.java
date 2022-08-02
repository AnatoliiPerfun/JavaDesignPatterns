package Patterns.Behavioral.Command;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 1:53 PM
 */
public class WindowsFileSysReceiver implements FileSysReceiver{
    @Override
    public void openFile() {
        System.out.println("Opening file in Windows OS");
    }

    @Override
    public void writeFile() {
        System.out.println("Writing file in Windows OS");
    }

    @Override
    public void closeFile() {
        System.out.println("Closing file in Windows OS");
    }
}
