<h2>The Iterator Pattern</h2>

According to GoF definition, an iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation. It is behavioral design pattern.

As name implies, iterator helps in traversing the collection of objects in a defined manner which is useful the client applications. During iteration, client programs can perform various other operations on the elements as per requirements.

<h2>Real world example of observer pattern</h2>

- In Java, we have java.util.Iterator interface and it’s specific implementations such as ListIterator. All Java collections provide some internal implementations of Iterator interface which is used to iterate over collection elements.
- In media players, we have a list of songs listed and we can play the song by traversing to the songs list and select desired song. It’s also an iterator example.

<h2>Design participants</h2>

The iterator pattern has four participants.

1. Iterator: An interface to access or traverse the elements collection. Provide methods which concrete iterators must implement.
2. ConcreteIterator: implements the Iterator interface methods. It can also keep track of the current position in the traversal of the aggregate collection.
3. Aggregate: It is typically a collection interface which defines a method that can create an Iterator object.
4. ConcreteAggregate: It implements the Aggregate interface and its specific method returns an instance of ConcreteIterator.
