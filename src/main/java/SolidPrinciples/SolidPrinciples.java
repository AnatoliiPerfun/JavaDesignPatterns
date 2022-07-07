package SolidPrinciples;

/**
 * @author Tolik
 * @project designPatterns
 * @created 7/5/2022 - 4:47 PM
 */
public class SolidPrinciples {


    /* ------------------------------------------------------------------------------------------------
           Singe Responsibility Principle
       ------------------------------------------------------------------------------------------------
        A class acts like a container that can hold many things such as data, properties, or methods.
        If you put in too much data or methods that are not related to each other,
        you end up with a bulky class that can create problems in the future.
     */

    /* ------------------------------------------------------------------------------------------------
            Open/Closed Principle
       ------------------------------------------------------------------------------------------------
        According to Robert C. Martin, the Open/Closed Principle is the most important
        principle among all the principles of object-oriented design.
        In the book "Clean Architecture", he says the following:
        The Open-Closed Principle (OCP) was coined in 1988 by Bertrand Meyer.
        It says: A software artifact should be open for extension but closed for
        modification.
        The new proposal uses abstract base classes that use the protocols instead
        of a superclass to allow different implementations.
     */

    /* ------------------------------------------------------------------------------------------------
            Liskov Substitution Principle
       ------------------------------------------------------------------------------------------------
         The Liskov Substitution Principle was initially introduced from the work of Barbara Liskov in 1988.
         The LSP says that you should be able to substitute a parent (or base) type with a subtype.
         It means that in a program segment,
         you can use a derived class instead of its base class without altering the correctness of the program.

     */

       /* ------------------------------------------------------------------------------------------------
            Interface Segregation Principle
       ------------------------------------------------------------------------------------------------
    Interface segregation principle (ISP)
    states that no code should be forced to depend on methods it does not use.
    ISP splits interfaces that are very large into smaller and more specific ones
    so that clients will only have to know about the methods that are of interest to them.

     */

       /* ------------------------------------------------------------------------------------------------
            Dependency Inversion Principle
       ------------------------------------------------------------------------------------------------
        The DIP covers two important things:
        • A high-level concrete class should not depend on a low-level
        concrete class. Instead, both should depend on abstractions.
        • Abstractions should not depend upon details. Instead, the details
        should depend upon abstractions

     */
}
