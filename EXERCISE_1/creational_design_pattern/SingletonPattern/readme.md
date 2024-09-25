# Singleton Pattern Example: Database Connection Manager

This project demonstrates the implementation of the Singleton design pattern using a DatabaseConnectionManager. The Singleton pattern ensures that a class has only one instance and provides a global point of access to that instance.

## Project Structure

The project consists of the following components:

1. `DatabaseConnectionManager` (Singleton) class
2. `Main` class for demonstration

## How It Works

1. The `DatabaseConnectionManager` class has a private static variable `instance` that holds the single instance of the class.
2. The constructor is private to prevent direct instantiation of the class.
3. The `getInstance()` method is public and static, allowing global access to the single instance.
4. `getInstance()` creates the instance if it doesn't exist, otherwise it returns the existing instance.
5. The `connect()` method simulates connecting to a database.

## Usage

To use the DatabaseConnectionManager:

1. Call `DatabaseConnectionManager.getInstance()` to get the single instance of the class.
2. Use the returned instance to call methods like `connect()`.