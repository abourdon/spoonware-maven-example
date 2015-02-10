# Spoonware maven example

## Introduction
This application show how to configure a maven project to integrate Spoonware.  It allow you to :
- Monitor remotely your application. Each exception at runtime is automatically monitored in Spoonware dashboard.
- Diagnostic all your bugs with the provided informations.
- Fix your bugs at runtime, without recompiling and re-deploing your application.

## Usage

First, you should create a Spoonware account : https://spoonware.lille.inria.fr/invitation.html

When you are successfully logged, you could create an application. You get an ID and TOKEN of your application. You should edit file src/main/java/Main.java to insert your application parameter in first statement of main method.

## Start application and monitor

This example application works under **Java version 1.8**

You can start the example application with :
$ mvn -P spoonware clean compile exec:java

The application start and you collect bugs in your dashboard.
