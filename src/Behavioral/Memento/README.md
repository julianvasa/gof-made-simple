<h2>The Memento Pattern</h2>

Memento design pattern is behavioral pattern and one of 23 design patterns discussed by Gang of Four. Memento pattern is used to restore state of an object to a previous state. It is also known as snapshot pattern.

A memento is is like a restore point during the life cycle on the object, which the client application can use to restore the object state to its state. Conceptually, it is very much like we create restore points for operating systems and use to restore the system if something breaks or system crashes.

<h2>Real world example of observer pattern</h2>

- In a GUI editor (e.g. MS Paint), we can keep making changing to drawing and we can rollback the changes with simple commands like CTRL + Z.
- In code editors, we can revert or apply any code change with simple commands to undo and redo.
- In calculator applications, we can revisit all the calculations in memory with simple button press.
- In programming, memento can be used to create checkpoints during database transactions. If any operation fails, we just rollback everything to last known stable database state.
- javax.swing.text.JTextComponent class provides an undo support mechanism. javax.swing.undo.UndoManager can act as a caretaker, an implementation of javax.swing.undo.UndoableEdit can act like a memento, and an implementation of javax.swing.text.Document can act like an originator.

<h2>Design participants</h2>

The memento pattern has four participants.

1. Originator – is the object that knows how to create and save it’s state for future. It provides methods createMemento() and restore(memento).
2. Caretaker – performs an operation on the Originator while having the possibility to rollback. It keeps track of multiple mementos. Caretaker class refers to the Originator class for saving (createMemento()) and restoring (restore(memento)) originator’s internal state.
3. Memento – the lock box that is written and read by the Originator, and shepherded by the Caretaker. In principle, a memento must be in immutable object so that no one can change it’s state once created.

<h3>Pros and Cons of the Strategy design pattern</h3>

Pros:

- You can produce snapshots of the object’s state without violating its encapsulation.
- You can simplify the originator’s code by letting the caretaker maintain the history of the originator’s state.

Cons:

 - The app might consume lots of RAM if clients create mementos too often.
 - Caretakers should track the originator’s lifecycle to be able to destroy obsolete mementos.
 - Most dynamic programming languages, such as PHP, Python and JavaScript, can’t guarantee that the state within the memento stays untouched.

<h3>Relations with Other Patterns</h3>

- You can use Command and Memento together when implementing “undo”. In this case, commands are responsible for performing various operations over a target object, while mementos save the state of that object just before a command gets executed.

- You can use Memento along with Iterator to capture the current iteration state and roll it back if necessary.

- Sometimes Prototype can be a simpler alternative to Memento. This works if the object, the state of which you want to store in the history, is fairly straightforward and doesn’t have links to external resources, or the links are easy to re-establish.