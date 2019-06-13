<h2>The Adapter Pattern</h2>

Ever tried to use a your camera memory card in your laptop. You cannot use it directly simply because there is no port in laptop which accept it. You must use a compatible card reader. You put your memory card into card reader and then inject card reader into laptop. This card reader can be called adapter.

In programming as well, adapter pattern is used for similar purposes. It enable two incompatible interfaces to work smoothly with each other. Going by definition:

Adapter design pattern is one of the structural design pattern and its used so that two unrelated interfaces can work together. The object that joins these unrelated interface is called an Adapter.

An adapter pattern is also known as Wrapper pattern as well. Adapter Design is very useful for the system integration when some other existing components have to be adapted by the existing system without sourcecode modifications.

Using the adapter pattern, you can create a class, say CsvAdapterImpl that will act as an adapter to make both the incompatible interfaces (TextFormattable and CsvFormattable) work together.

There are two variants of adapters: Object adapter that relies on composition and class adapter that relies on inheritance. As Java does not support multiple inheritance, you have to use object adapter when there are multiple classes that the adapter needs to address. Also, the approach to favors composition over inheritance should be the driving factor for using object adapters in Java.

We can summarize the participants of the adapter pattern in the context of the text formatting example, as:

- Target (TextFormattable): The existing interface that clients communicate with.
- Adaptee (CsvFormattable): The new incompatible interface that needs adapting.
- Adapter (CsvAdapterImpl): A class that adapts the Adaptee to the Target.
- Client: Communicates with the Target.

<h3>Pros and Cons of the Adapter design pattern</h3>

Pros:

1. Single Responsibility Principle. You can separate the interface or data conversion code from the primary business logic of the program.
2. Open/Closed Principle. You can introduce new types of adapters into the program without breaking the existing client code, as long as they work with the adapters through the client interface.

Cons:

1. The overall complexity of the code increases because you need to introduce a set of new interfaces and classes. Sometimes it’s simpler just to change the service class so that it matches the rest of your code.

<h3>Relations with Other Patterns</h3>

- Bridge is usually designed up-front, letting you develop parts of an application independently of each other. On the other hand, Adapter is commonly used with an existing app to make some otherwise-incompatible classes work together nicely.

- Adapter changes the interface of an existing object, while Decorator enhances an object without changing its interface. In addition, Decorator supports recursive composition, which isn’t possible when you use Adapter.

- Adapter provides a different interface to the wrapped object, Proxy provides it with the same interface, and Decorator provides it with an enhanced interface.

- Facade defines a new interface for existing objects, whereas Adapter tries to make the existing interface usable. Adapter usually wraps just one object, while Facade works with an entire subsystem of objects.

- Bridge, State, Strategy (and to some degree Adapter) have very similar structures. Indeed, all of these patterns are based on composition, which is delegating work to other objects. However, they all solve different problems. A pattern isn’t just a recipe for structuring your code in a specific way. It can also communicate to other developers the problem the pattern solves.