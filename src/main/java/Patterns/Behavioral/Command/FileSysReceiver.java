package Patterns.Behavioral.Command;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/26/2022 - 4:44 PM
 */
public interface FileSysReceiver {
    void openFile();
    void writeFile();
    void closeFile();
}
