# Command Pattern Example: Light Control System

This project demonstrates the implementation of the Command design pattern using a simple light control system. The Command pattern encapsulates a request as an object, thereby allowing for parameterization of clients with different requests, queuing of requests, and logging of the requests. It also allows for the support of undoable operations.

## Project Structure

The project consists of the following components:

1. `Command` (Command) interface
2. `Light` (Receiver) class
3. `LightOnCommand` (Concrete Command) class
4. `RemoteControl` (Invoker) class
5. `Main` class for demonstration

## How It Works

1. The `Command` interface declares an `execute()` method.
2. Concrete commands (like `LightOnCommand`) implement the `Command` interface and encapsulate the actions and the receiver.
3. The `Light` class acts as the receiver, knowing how to perform the operations associated with carrying out a request.
4. The `RemoteControl` class acts as an invoker, asking the command to carry out the request.

## Usage

To use this light control system:

1. Create an instance of `Light` (the receiver).
2. Create concrete command objects, passing the receiver to their constructors.
3. Create an instance of `RemoteControl` (the invoker).
4. Set the command for the remote control.
5. Press the button to execute the command.

Example:

```java
public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);

        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(lightOn, lightOff);

        // Turning the light on
        remoteControl.pressOnButton();

        // Turning the light off
        remoteControl.pressOffButton();
    }
}
```
