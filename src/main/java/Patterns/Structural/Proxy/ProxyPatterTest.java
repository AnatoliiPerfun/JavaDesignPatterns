package Patterns.Structural.Proxy;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/27/2022 - 10:19 AM
 */
public class ProxyPatterTest {
    public static void main(String[] args){
        CommandExecutor executor = new CommandExecutorProxy("Tolik", "wrong_pwd");
        try {
            executor.runCommand("ls -ltr");
            executor.runCommand(" rm -rf abc.pdf");
        } catch (Exception e) {
            System.out.println("Exception Message::"+e.getMessage());
        }
    }
}
