# Object Orientation with Java

## Procedural vs. Object-Oriented Programming
* In the **Procedural** paradigm, instructions must be passed to the computer in the sequence in which they are to be executed. It was used as a programming practice before the introduction of Object-oriented languages. Although it had its benefits, it might lead to repetitive and unreadable. 
* The central idea of the **Object-Oriented** paradigm (OO) is that data (**attributes**) and functionality/behavior (**methods**) always go together. Code with cohesive responsibilities is a sign of the OO paradigm. So, in order for several teams to be able to work on the same project, it is necessary that the responsibilities of each code are well defined and clear, avoiding conflicts when making changes and evolutions. 

## Our First Class: Bank Account
* **Classes** are specifications of a type, which define characteristics (**attributes** or **properties**) and behaviors (**methods**). 
* For the [Byte Bank app](./bytebank/) example, a bank account may be defined by the [BankAccount](./bytebank/src/main/java/com/bytebank/app/account/BankAccount.java) class, which contains among others the `balance` attribute.
* **Objects** are instances of classes where we can set values for their attributes. To create an instance we need to use the keyword `new`, as it has been done [here](./bytebank/src/main/java/com/bytebank/app/ByteBankApp.java).
