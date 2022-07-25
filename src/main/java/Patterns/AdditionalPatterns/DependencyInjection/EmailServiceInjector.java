package Patterns.AdditionalPatterns.DependencyInjection;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 5:56 PM
 */
public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new MyDIApp(new EmailServiceImpl());
    }

}