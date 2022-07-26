package Patterns.Behavioral.State;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 7/25/2022 - 10:49 PM
 */
public class TVRemote {

    public static void main(String[] args) throws Exception {
        TVContext context = new TVContext();
        State tvStartState = new TVOnState();
        State tvStopState = new TVOffState();

        context.setState(tvStartState);
        context.doAction();

        context.setState(tvStopState);
        context.doAction();
    }
}
