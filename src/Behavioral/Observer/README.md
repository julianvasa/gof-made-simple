<h2>The Observer Pattern</h2>

According to GoF definition, observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.

In observer pattern, there are many observers (subscriber objects) that are observing a particular subject (publisher object). Observers register themselves to a subject to get a notification when there is a change made inside that subject.

A observer object can register or unregister from subject at any point of time. It helps is making the objects objects loosely coupled.


<h2>Real world example of observer pattern</h2>

- A real world example of observer pattern can be any social media platform such as Facebook or twitter. When a person updates his status – all his followers gets the notification. A follower can follow or unfollow another person at any point of time. Once unfollowed, person will not get the notifications from subject in future.

- In programming, observer pattern is the basis of message oriented applications. When a application has updated it’s state, it notifies the subscribers about updates. Frameworks like HornetQ, JMS work on this pattern.
- Similarly, Java UI based programming, all keyboard and mouse events are handled by it’s listeners objects and designated functions. When user click the mouse, function subscribed to the mouse click event is invoked with all the context data passed to it as method argument.

<h2>Design participants</h2>

The observer pattern has four participants.

- Subject – interface or abstract class defining the operations for attaching and de-attaching observers to the subject.
- ConcreteSubject – concrete Subject class. It maintain the state of the object and when a change in the state occurs it notifies the attached Observers.
- Observer – interface or abstract class defining the operations to be used to notify this object.
- ConcreteObserver – concrete Observer implementations.

<h2>How to Implement</h2>

1. In the context class, identify an algorithm that’s prone to frequent changes. It may also be a massive conditional that selects and executes a variant of the same algorithm at runtime.

2. Declare the strategy interface common to all variants of the algorithm.

3. One by one, extract all algorithms into their own classes. They should all implement the strategy interface.

4. In the context class, add a field for storing a reference to a strategy object. Provide a setter for replacing values of that field. The context should work with the strategy object only via the strategy interface. The context may define an interface which lets the strategy access its data.

5. Clients of the context must associate it with a suitable strategy that matches the way they expect the context to perform its primary job.

<h3>Pros and Cons of the Strategy design pattern</h3>

Pros:

- Open/Closed Principle. You can introduce new subscriber classes without having to change the publisher’s code (and vice versa if there’s a publisher interface).
- You can establish relations between objects at runtime.

Cons:

 - Subscribers are notified in random order.

<h3>Relations with Other Patterns</h3>

- Chain of Responsibility, Command, Mediator and Observer address various ways of connecting senders and receivers of requests:

    - Chain of Responsibility passes a request sequentially along a dynamic chain of potential receivers until one of them handles it.
    - Command establishes unidirectional connections between senders and receivers.
    - Mediator eliminates direct connections between senders and receivers, forcing them to communicate indirectly via a mediator object.
    - Observer lets receivers dynamically subscribe to and unsubscribe from receiving requests.

- The difference between Mediator and Observer is often elusive. In most cases, you can implement either of these patterns; but sometimes you can apply both simultaneously. Let’s see how we can do that.The primary goal of Mediator is to eliminate mutual dependencies among a set of system components. Instead, these components become dependent on a single mediator object. The goal of Observer is to establish dynamic one-way connections between objects, where some objects act as subordinates of others. There’s a popular implementation of the Mediator pattern that relies on Observer. The mediator object plays the role of publisher, and the components act as subscribers which subscribe to and unsubscribe from the mediator’s events. When Mediator is implemented this way, it may look very similar to Observer. When you’re confused, remember that you can implement the Mediator pattern in other ways. For example, you can permanently link all the components to the same mediator object. This implementation won’t resemble Observer but will still be an instance of the Mediator pattern. Now imagine a program where all components have become publishers, allowing dynamic connections between each other. There won’t be a centralized mediator object, only a distributed set of observers.