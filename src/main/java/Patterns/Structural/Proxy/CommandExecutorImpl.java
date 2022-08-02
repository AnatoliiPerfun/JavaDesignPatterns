package Patterns.Structural.Proxy;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/27/2022 - 10:13 AM
 */
public class CommandExecutorImpl implements CommandExecutor{
    @Override
    public void runCommand(String command) throws Exception {
        //some heavy implementation
        Runtime.getRuntime().exec(command);
        System.out.println("'" + command + "' command executed.");
    }
}
