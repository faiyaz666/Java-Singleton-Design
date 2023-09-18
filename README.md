# Java-Singleton-Design
Java Singleton Pattern is one of the Gangs of Four Design Patterns and comes in the Creational Design Pattern category. From the definition, it seems to be a straightforward design pattern, but when it comes to implementation, it comes with a lot of concerns.

In this article, we will learn about singleton design pattern principles, explore different ways to implement the singleton design pattern, and some of the best practices for its usage.

![singleton-pattern](https://github.com/faiyaz666/Java-Singleton-Design/assets/75085369/5707d80c-f901-41a8-8f42-7b9ed0b38d0b)

## Singleton Principles
* Singleton pattern restricts the instantiation of a class and ensures that only one instance of the class exists in the Java Virtual Machine.
* The singleton class must provide a global access point to get the instance of the class.
* Singleton pattern is used for logging, drivers objects, caching, and thread pool.
* Singleton design pattern is also used in other design patterns like Abstract Factory, Builder, Prototype, Facade, etc.
* Singleton design pattern is used in core Java classes also (for example, java.lang.Runtime, java.awt.Desktop).

## Java Singleton Pattern Implementation
* Private constructor to restrict instantiation of the class from other classes.
* Private static variable of the same class that is the only instance of the class.
* Public static method that returns the instance of the class, this is the global access point for the outer world to get the instance of the singleton class.
