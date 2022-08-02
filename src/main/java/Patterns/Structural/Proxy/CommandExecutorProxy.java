package Patterns.Structural.Proxy;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/27/2022 - 10:16 AM
 */
public class CommandExecutorProxy implements CommandExecutor {

    private boolean isAdmin;
    private final CommandExecutor executor;

    public CommandExecutorProxy(String user, String pwd){
        if("Tolik".equals(user) && "LinkedIn".equals(pwd)) isAdmin=true;
        executor = new CommandExecutorImpl();
    }
    @Override
    public void runCommand(String command) throws Exception {
        if(isAdmin){
            executor.runCommand(command);
        }else{
            if(command.trim().startsWith("rm")){
                throw new Exception("rm command is not allowed for non-admin users.");
            }else{
                executor.runCommand(command);
            }
        }
    }
}
