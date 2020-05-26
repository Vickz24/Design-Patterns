Bridge Pattern:
- Decouples an abstraction from an implementation so that the two can vary independently.
- The bridge pattern allows the Abstraction and the Implementation to be developed independently
  and the client code can access only the Abstraction part without being concerned about the Implementation part.
- The abstraction is an interface or abstract class and the implementor is also an interface or abstract class.
- Also known as Handle/Body

Use the Bridge pattern when
• you want to avoid a permanent binding between an abstraction and itsimplementation.
This might be the cas e, for examp le,when the implementation
must be selected or switched at run-time.
• both the abstractions and their implementations should be extensible by
subclassing. In this case, the Bridge pattern lets you combine the different
abstractions and implementations and extend them independently.
• changes in the implementation of an abstraction should have no impact on
clients; that is, their code should not have to be recompiled.
