package Patterns.AdditionalPatterns.DependencyInjection;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 5:08 PM
 */
public class EmailServiceImpl implements MessageService {

    @Override
    public void sendMessage(String msg, String rec) {
        //logic to send email
        System.out.println("Email sent to "+rec+ " with Message= "+msg);
    }

}
