package Patterns.AdditionalPatterns.DependencyInjection;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 4:57 PM
 */
public class MyDIApp implements Consumer{
    private final MessageService service;

    public MyDIApp(MessageService service){
        this.service=service;
    }

    @Override
    public void processMessages(String msg, String rec){
        //do some msg validation, manipulation logic etc
        this.service.sendMessage(msg, rec);
    }

}
