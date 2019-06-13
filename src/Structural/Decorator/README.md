<h2>The Decorator Pattern</h2>

In software engineering, decorator design pattern is used to add additional features or behaviors to a particular instance of a class, while not modifying the other instances of same class. Decorators provide a flexible alternative to sub-classing for extending functionality. Please note that the description above implies that decorating an object changes its behavior but not its interface.

<h3>Pros and Cons of the Decorator design pattern</h3>

Pros:

1. You can extend an object’s behavior without making a new subclass.
2. You can add or remove responsibilities from an object at runtime.
3. You can combine several behaviors by wrapping an object into multiple decorators.
4. Single Responsibility Principle. You can divide a monolithic class that implements many possible variants of behavior into several smaller classes.

Cons:

1. It’s hard to remove a specific wrapper from the wrappers stack.
2. It’s hard to implement a decorator in such a way that its behavior doesn’t depend on the order in the decorators stack.
3. The initial configuration code of layers might look pretty ugly.

<h3>Relations with Other Patterns</h3>

- Adapter changes the interface of an existing object, while Decorator enhances an object without changing its interface. In addition, Decorator supports recursive composition, which isn’t possible when you use Adapter.

- Adapter provides a different interface to the wrapped object, Proxy provides it with the same interface, and Decorator provides it with an enhanced interface.

- Chain of Responsibility and Decorator have very similar class structures. Both patterns rely on recursive composition to pass the execution through a series of objects. However, there are several crucial differences.

- The CoR handlers can execute arbitrary operations independently of each other. They can also stop passing the request further at any point. On the other hand, various Decorators can extend the object’s behavior while keeping it consistent with the base interface. In addition, decorators aren’t allowed to break the flow of the request.

- Composite and Decorator have similar structure diagrams since both rely on recursive composition to organize an open-ended number of objects.

- A Decorator is like a Composite but only has one child component. There’s another significant difference: Decorator adds additional responsibilities to the wrapped object, while Composite just “sums up” its children’s results.

- However, the patterns can also cooperate: you can use Decorator to extend the behavior of a specific object in the Composite tree.

- Designs that make heavy use of Composite and Decorator can often benefit from using Prototype. Applying the pattern lets you clone complex structures instead of re-constructing them from scratch.

- Decorator lets you change the skin of an object, while Strategy lets you change the guts.

- Decorator and Proxy have similar structures, but very different intents. Both patterns are built on the composition principle, where one object is supposed to delegate some of the work to another. The difference is that a Proxy usually manages the life cycle of its service object on its own, whereas the composition of Decorators is always controlled by the client.