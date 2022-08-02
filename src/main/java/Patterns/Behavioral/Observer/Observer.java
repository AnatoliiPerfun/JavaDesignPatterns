package Patterns.Behavioral.Observer;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 2:16 PM
 */
public interface Observer {
    //method to update the observer, used by subject
    public void update();

    //attach with subject to observe
    public void setSubject(Subject sub);
}
