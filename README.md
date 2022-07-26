# Object Orientation with Java

## Procedural vs. Object-Oriented Programming
* In the **Procedural** paradigm, instructions must be passed to the computer in the sequence in which they are to be executed. It was used as a programming practice before the introduction of Object-oriented languages. Although it had its benefits, it might lead to repetitive and unreadable. 
* The central idea of the **Object-Oriented** paradigm (OO) is that data (**attributes**) and functionality/behavior (**methods**) always go together. Code with cohesive responsibilities is a sign of the OO paradigm. So, in order for several teams to be able to work on the same project, it is necessary that the responsibilities of each code are well defined and clear, avoiding conflicts when making changes and evolutions. 

## Our First Class: Bank Account
* **Classes** are specifications of a type, which define characteristics (**attributes** or **properties**) and behaviors (**methods**). 
* For the [Byte Bank app](./bytebank/) example, a bank account may be defined by the [BankAccount](./bytebank/src/main/java/com/bytebank/app/account/BankAccount.java) class, which contains among others the `balance` attribute.
* **Objects** are instances of classes where we can set values for their attributes. To create an instance we need to use the keyword `new`, as it has been done [here](./bytebank/src/main/java/com/bytebank/app/ByteBankApp.java).
* Default values for the attributes may be defined within the **constructor** method.
* In Java we do not work directly with the objects, but with **references** to the objects. This changes the way we copy and we compare the objects.

## Define Behavior through Methods
* A method defines the **behavior** or **way of an object to do something**, and in Java it is possible for a method to have none, one or more **input** parameters, and none or one **output** parameter.
* By convention, the method name in the Java world must start with a lowercase letter and then use **CamelCase**.
* It is expected for our [BankAccount](./bytebank/src/main/java/com/bytebank/app/account/BankAccount.java) class example to be able to **deposit**, **withdraw** and **transfer** an ammount of money. For those actions, we may define `deposit()`, `withdraw()` and `transfer()` methods.
* The keyword `this` is a reference, i.e., it "points" to an object/instance. Its use is **optional**, although it is recommended that it be used to reference attributes of the **current object** - the object whose method or constructor is being called.

## Object Composition
* It is possible to define a **relationship between classes** through object composition, which is advantageous as the size of the class increases and it starts to contain information unrelated to its purpose.
* For this reason, the [Client](./bytebank/src/main/java/com/bytebank/app/client/Client.java) class was created and set as an attribute of the `BankAccount` class to gather data as client's `name`, social security number (`ssn`) and `ocupation`.
* It is important to make sure that the `Client` attribute be **instantiated** before being called. Otherwise, a `NullPointerException` will be thrown.


## Encapsulation and Visibility
* In object-oriented programming, **access modifiers** are the set of keywords that define an attribute, method, or class as `public`, `private`, or `protected`.
* When we have a `public` class with its attributes and methods being directly accessed, we say that it doesn't offer the benefits of **encapsulation**.
* Encapsulation provides access control to the attributes and methods of a class. It is an efficient way to protect the data manipulated within the class, in addition to determining where this class can be manipulated.
* For this purpose, we must always provide `private` attributes and `public` **accessor** methods (*getters*), and if the class is mutable, we must also provide the **modifier** methods (*setters*).
* The advantage of using `private` attributes is that the internal implementation can be modified without affecting any code outside the class itself.

## Constructors and Static Members
* **Constructors** are methods used to **initialize attributes**. It is possible to have multiple constructors (as long as they vary in **type** or **number of parameters**).
* Depending on the number of constructors defined, initialization of attributes received in the constructor becomes **mandatory**.
* **Static** methods are functions that do not depend on any instance variables and can be called directly from the class.
* Like static attributes, static methods have a **relationship with a class as a whole**, while attributes and methods that are not static are associated with a specific class instance (object).
* That's why it's not possible to reference `this` inside static methods.
* In our [Bank Account](./bytebank/src/main/java/com/bytebank/app/account/BankAccount.java) class example, we can increment the number of accounts created by using the static attribute `total` and get its value by the static method `getNumberOfAccounts()`.
