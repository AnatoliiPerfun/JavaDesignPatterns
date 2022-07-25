package Patterns.AdditionalPatterns.DependencyInjection;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 5:04 PM
 */
public class SMServiceInjector implements MessageServiceInjector {

    @Override
    public Consumer getConsumer() {

        return new MyDIApp(new SMServiceImpl());
    }

}
