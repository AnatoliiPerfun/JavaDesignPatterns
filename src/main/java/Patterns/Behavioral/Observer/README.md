
### Observer Design Pattern

> According to GoF, observer design pattern intent is;
>> Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

    Subject contains a list of observers to notify of any change in it’s state, so it should provide methods using which observers can register and unregister themselves. 
    Subject also contain a method to notify all the observers of any change and either it can send the update while notifying the observer or it can provide another method to get the update.
    Observer should have a method to set the object to watch and another method that will be used by Subject to notify them of any updates.

* Java Message Service (JMS) uses Observer design pattern along with Mediator pattern to allow applications to subscribe and publish data to other applications.
<br/>
* Model-View-Controller (MVC) frameworks also use Observer pattern where Model is the Subject and Views are observers that can register to get notified of any change to the model.