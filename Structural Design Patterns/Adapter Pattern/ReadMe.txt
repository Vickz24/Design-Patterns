Adapter Pattern:
- Converts the interface of a class into another interface, client expects
- Let's the class work together that couldn't otherwise because of incompatible interfaces.
- Also known as Wrapper.

Use the Adapter pattern when
• you want to use an existing class, and its interface does not match the one
you need.
• you want to create a reusable class that cooperates with unrelated orunforeseen
classes, that is, classes that don't necessarily have compatible interfaces.
• (object adapter only) you need to use several existing subclasses, but it's unpractical
to adapt their interfa ce by subclassing every one. An obje ct adapter
can adapt the interface of its parent class
