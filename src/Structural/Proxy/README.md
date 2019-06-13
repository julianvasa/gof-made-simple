<h2>The Proxy Pattern</h2>

According to GoF definition of proxy design pattern, a proxy object provide a surrogate or placeholder for another object to control access to it. A proxy is basically a substitute for an intended object which we create due to many reasons e.g. security reasons or cost associated with creating fully initialized original object.

<h2>Design participants</h2>

- Subject – is an interface which expose the functionality available to be used by the clients.
- Real Subject – is a class implementing Subject and it is concrete implementation which needs to be hidden behind a proxy.
- Proxy – hides the real object by extending it and clients communicate to real object via this proxy object. Usually frameworks create this proxy object when client request for real object.