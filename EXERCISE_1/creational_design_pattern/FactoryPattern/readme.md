# Factory Method Pattern Example: Notification System

This project demonstrates the implementation of the Factory Method design pattern using a simple notification system. The Factory Method pattern provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

## Project Structure

The project consists of the following components:

1. `Notification` (Product) interface
2. `EmailNotification` (Concrete Product) class
3. `NotificationFactory` (Creator) class
4. `Main` class for demonstration

## How It Works

1. The `Notification` interface declares the `notifyUser()` method that all concrete notifications must implement.
2. `EmailNotification` is a concrete implementation of the `Notification` interface.
3. The `NotificationFactory` class contains the factory method `createNotification()` which creates and returns `Notification` objects based on the given type.
4. In the `Main` class, we demonstrate how to use the factory to create notifications.

## Usage

To use this notification system:

1. Create an instance of `NotificationFactory`.
2. Call the `createNotification()` method with the desired notification type.
3. Use the returned `Notification` object to call the `notifyUser()` method.