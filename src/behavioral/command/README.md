# Illustration of the Command Design Pattern

The purpose of the Command patterns is to encapsulate the request that is being transfered from the sender to the receiver.

Sender/Invoker -> [Request] -> Receiver

Advantages:
* Makes the code easy to extend by adding new commands
* Removes the coupling between the Invoker and the Receiver

## UML

![Strategy Design Pattern](command.gif)

## Overview of the example

Invokers(Senders):
* SimpleRemoteControl - has the ability to hold only a single command. The command is passed through a method.
* ThreeButtonRemoteControl - can hold 3 commands at a time. They are all passed through the constructor.

Receivers:
* Light - can be turned on and off 
* AirConditioner - can be turned on with a specific temperature set and turned off

Commands(Requests):
* LightOnCommand
* LightOffCommand
* AirConditionerOffCommand
* AirConditionerOnWithTempCommand

