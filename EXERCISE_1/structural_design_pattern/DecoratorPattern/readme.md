# Decorator Pattern Example: Coffee Shop

This project demonstrates the implementation of the Decorator design pattern using a coffee shop scenario. The Decorator pattern allows behavior to be added to individual objects, either statically or dynamically, without affecting the behavior of other objects from the same class.

## Project Structure

The project consists of the following components:

1. `Coffee` (Component) interface
2. `SimpleCoffee` (Concrete Component) class
3. `MilkDecorator` (Decorator) class
4. `Main` class for demonstration

## How It Works

1. The `Coffee` interface defines the methods that all concrete components and decorators must implement.
2. `SimpleCoffee` is a concrete implementation of the `Coffee` interface, representing a basic coffee.
3. `MilkDecorator` is a decorator that adds milk to a coffee. It implements the `Coffee` interface and contains a reference to a `Coffee` object.
4. In the `Main` class, we demonstrate how to create a simple coffee and then decorate it with milk once and twice.

## Usage

To use this coffee shop system:

1. Create a base coffee object (e.g., `SimpleCoffee`).
2. Decorate the coffee object with additional ingredients (e.g., `MilkDecorator`).
3. You can stack multiple decorators to add more ingredients.

