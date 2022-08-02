package Patterns.Behavioral.Command;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 1:59 PM
 */
public class FileSysReceiverUtil {
    public static FileSysReceiver getUnderlyingFileSystem(){
        String osName = System.getProperty("os.name");
        System.out.println("Underlying OS is:"+osName);
        if(osName.contains("Windows")){
            return new WindowsFileSysReceiver();
        }else{
            return new LinuxFileSysReceiver();
        }
    }
}
