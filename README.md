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