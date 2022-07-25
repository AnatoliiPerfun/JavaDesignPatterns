package Patterns.AdditionalPatterns.DependencyInjection;

import static java.lang.System.out;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 5:03 PM
 */
public class MyMessageDITest {

    public static void main(String[] args) {
        String msg = "Hi Developer";
        String email = "tolikvik@gmail.com";
        String phone = "123456789";
        MessageServiceInjector injector;
        Consumer app;

        //Send email
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, email);
        out.println(" ");
        //Send SMS
        injector = new SMServiceInjector();
        app = injector.getConsumer();
        app.processMessages(msg, phone);
    }

}