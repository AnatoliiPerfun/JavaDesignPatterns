package Patterns.Behavioral.Observer;

import org.reactivestreams.Subscriber;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 2:21 PM
 */
public class ObserverPatternTest {
    public static void main(String[] args) {
        //create subject
        MyTopic topic = new MyTopic();

        //create observers
        Subscriber obj1 = new MyTopicSubscriber("Obj1");
        Subscriber obj2 = new MyTopicSubscriber("Obj2");
        Subscriber obj3 = new MyTopicSubscriber("Obj3");

        //register observers to the subject
        topic.register(obj1);
        topic.register(obj2);
        topic.register(obj3);

        //attach observer to subject
        obj1.onSubscribe(topic);
        obj2.onSubscribe(topic);
        obj3.onSubscribe(topic);

        //check if any update is available
        obj1.onComplete();

        //now send message to subject
        topic.postMessage("New Message");
    }
}
