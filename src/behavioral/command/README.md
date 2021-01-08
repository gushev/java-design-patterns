# Illustration of the Command Design Pattern

The purpose of the Command patterns is to encapsulate the request that is being transfered from the sender to the receiver.

Sender/Invoker -> [Request] -> Receiver

Advantages:
* Makes the code easy to extend by adding new commands
* Removes the coupling between the Invoker and the Receiver

## UML

![Strategy Design Pattern](command.gif)
