<h2>The State Pattern</h2>

The state pattern is a behavioral design pattern. According to GoF definition, a state allows an object to alter its behavior when its internal state changes. The object will appear to change its class.

<h2>Real world example of observer pattern</h2>

- To make things simple, let’s visualize a TV box operated with remote controller. We can change the state of TV by pressing buttons on remote. But the state of TV will change or not, it depends on the current state of the TV. If TV is ON, we can switch it OFF, mute or change aspects and source. But if TV is OFF, nothing will happen when we press remote buttons. For a switched OFF TV. only possible next state can be switch ON.

- State patterns are used to implement state machine implementations in complex applications.
- Another example can be of Java thread states. A thread can be one of its five states during it’s life cycle. It’s next state can be determined only after getting it’s current state. e.g. we can not start a stopped thread or we cannot a make a thread wait, until it has started running.

<h2>Design participants</h2>

The state pattern has four participants.

- State – The interface define operations which each state must handle.
- Concrete States – The classes which contain the state specific behavior.
- Context – Defines an interface to client to interact. It maintains references to concrete state object which may be used to define current state of object. It delegates state-specific behavior to different State objects.

