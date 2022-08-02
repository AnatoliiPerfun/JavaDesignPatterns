package Patterns.Behavioral.Observer;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;

/**
 * @author Tolik
 * @project DesignPatterns
 * @created 8/2/2022 - 2:24 PM
 */
public class MyTopicSubscriber implements Observer, Subscriber {
    private final String name;
    private Subject topic;

    public MyTopicSubscriber(String nm){
        this.name=nm;
    }
    @Override
    public void update() {
        String msg = (String) topic.getUpdate(this);
        if(msg == null){
            System.out.println(name+":: No new message");
        }else
            System.out.println(name+":: Consuming message::"+msg);
    }

    @Override
    public void setSubject(Subject sub) {
        this.topic=sub;
    }

    @Override
    public void onSubscribe(Subscription subscription) {

    }

    @Override
    public void onNext(Object o) {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {

    }
}
