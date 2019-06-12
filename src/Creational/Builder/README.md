<h2>The Builder Pattern</h2>

The Builder design pattern is one of the twenty-three well-known GoF design patterns that describe how to solve recurring design problems in object-oriented software.

Constructors in Java are used to create object and can take parameters required to create object. Problem starts when an Object can be created with lot of parameters, some of them may be mandatory and others may be optional.

The Builder design pattern typically solve problem in object oriented programming i.e determining what constructor to use. Often we write many constructor and it is really hard to manage them. The multiple constructor with combination of multiple parameters variation is called the telescoping constructor.

Builder pattern is used to create instance of very complex object having telescoping constructor in easiest way.

<h3>Guidelines for Builder design pattern in Java</h3>

1.  Make a static nested class called Builder inside the class whose object will be build by Builder. In this example its Person.
2. Builder class will have exactly same set of fields as original class.
3. Builder class will expose method for adding properties e.g. phone() in this example. Each method will return same Builder object. Builder will be enriched with each method call.
4. Builder.build() method will copy all builder field values into actual class and return object of Item class (Person)
5. Item class (class for which we are creating Builder) should have private constructor to create its object from build() method and prevent outsider to access its constructor.

<h3>Pros and Cons of the Builder design pattern</h3>

Pros:

1. Code is more maintainable if number of fields required to create object is more than 4 or 5.
2. Object creational code less error-prone as user will know what they are passing because of explicit method call.
3. Builder patter increses robustness, as only fully constructed object will be available to client.
4. You can construct objects step-by-step, defer construction steps or run steps recursively.
5. You can reuse the same construction code when building various representations of products.
6. Single Responsibility Principle. You can isolate complex construction code from the business logic of the product.
   
Cons:

1. Builder pattern is verbose and requires code duplication as Builder needs to copy all fields from Original or Item class.

<h3>Relations with Other Patterns</h3>

- Many designs start by using Factory Method (less complicated and more customizable via subclasses) and evolve toward Abstract Factory, Prototype, or Builder (more flexible, but more complicated).

- Builder focuses on constructing complex objects step by step. Abstract Factory specializes in creating families of related objects. Abstract Factory returns the product immediately, whereas Builder lets you run some additional construction steps before fetching the product.

- You can use Builder when creating complex Composite trees because you can program its construction steps to work recursively.

- You can combine Builder with Bridge: the director class plays the role of the abstraction, while different builders act as implementations.

- Abstract Factories, Builders and Prototypes can all be implemented as Singletons.