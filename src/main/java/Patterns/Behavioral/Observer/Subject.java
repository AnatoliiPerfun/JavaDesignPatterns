package Patterns.Behavioral.Observer;

import org.reactivestreams.Subscriber;
/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 2:12 PM
 */
public interface Subject {
    //methods to register and unregister observers
    public void register(Subscriber obj);
    public void unregister(Subscriber obj);

    //method to notify observers of change
    public void notifyObservers();

    //method to get updates from subject
    public Object getUpdate(Subscriber obj);
}
