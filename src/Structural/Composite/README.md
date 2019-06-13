<h2>The Composite Pattern</h2>

Composite design pattern is a structural pattern which modifies the structure of an object. This pattern is most suitable in cases where you need to work with objects which form a tree like hierarchy. In that tree, each node/object (except root node) is either composite or leaf node. Implementing the composite pattern lets clients treat individual objects and compositions uniformly.

<h2>When to use composite design pattern</h2>
Composite design pattern compose objects into tree structures to represent whole-part hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

- When application has hierarchical structure and needs generic functionality across the structure.
- When application needs to aggregate data across a hierarchy.
- When application wants to treat composite and individual objects uniformly.

Real life example usage of composite design pattern may be:

- Building consolidate view of a customer’s account in bank (i.e. customer’s portfolio)
- Building general ledgers
- Computer/network monitoring applications
- Retail and inventory applications
- Directory structure in file system implementations
- Menu items in GUI screens

<h3>Pros and Cons of the Composite design pattern</h3>

Pros:

1. You can work with complex tree structures more conveniently: use polymorphism and recursion to your advantage.
2. Open/Closed Principle. You can introduce new element types into the app without breaking the existing code, which now works with the object tree.

Cons:

1. It might be difficult to provide a common interface for classes whose functionality differs too much. In certain scenarios, you’d need to overgeneralize the component interface, making it harder to comprehend.

<h3>Relations with Other Patterns</h3>

- You can use Builder when creating complex Composite trees because you can program its construction steps to work recursively.

- Chain of Responsibility is often used in conjunction with Composite. In this case, when a leaf component gets a request, it may pass it through the chain of all of the parent components down to the root of the object tree.

- You can use Iterators to traverse Composite trees.

- You can use Visitor to execute an operation over an entire Composite tree.

- You can implement shared leaf nodes of the Composite tree as Flyweights to save some RAM.

- Composite and Decorator have similar structure diagrams since both rely on recursive composition to organize an open-ended number of objects.

- A Decorator is like a Composite but only has one child component. There’s another significant difference: Decorator adds additional responsibilities to the wrapped object, while Composite just “sums up” its children’s results.

- However, the patterns can also cooperate: you can use Decorator to extend the behavior of a specific object in the Composite tree.

- Designs that make heavy use of Composite and Decorator can often benefit from using Prototype. Applying the pattern lets you clone complex structures instead of re-constructing them from scratch.