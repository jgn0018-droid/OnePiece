**CODE SMELL 1: LARGE CLASS**

A large class occurs when a class accumulate too many fields, methods and lines of code.

**Solution:** We applied Extract Class refactoring technique. We identified a specific set of responsabilities that could be grouped together and moved them into a new class.


**CODE SMELL 2: DEAD CODE**

Dead code refers any part of the code that is never executed or used in the final application.

**Solution:** The solution is simple, we have to do a "Safe Delete" to ensure that removing the code won't break nothing.


**CODE SMELL 3: LONG PARAMETER LIST**

A long parameter list occurs when a method has too many parameters.

**Solution:** To fix this, we have to pass the object that contains them into a single structure.


**CODE SMELL 4: INNAPROPIATE INTIMACY**

Innapropiate Intimacy occurs when one class uses the internal fields or private methods of another class to much.

**Solution:** The solution to this smell is to draw a clear line between the classes so they only talk through official channels.


**CODE SMELL 5: DUPLICATE CODE**

Duplicate code occurs when the same or a very similar code structure appears in more than one place.

**Solution:** The solution for duplication is to take one of the similar codes and delete it.


**CODE SMELL 6: LONG METHOD**

A long method is a method that has grown too long and is trying to perform too many sub-tasks.

**Solution:** The best way to handle a long method is to slice it into a smaller.


**CODE SMELL 7: SWITCH STATEMENTS**

The switch statements smell occurs when you have a complex switch or if-else to perform different actions based on the type or state of an object.

**Solution:** The most effective way to clean it up in a smaller project is to move that logic out of the main flow.


**CODE SMELL 8: TEMPORARY FIELDS**

A temporary field occurs when an object contains an instance variable that is only used under very specific circumstances or during a single method's execution.

**Solution:** The solution is to move the temporary data to a place where it is actually needed.


**CODE SMELL 9: FEATURE ENVY**

Feature envy occurs when a method in one class seems more interested in the data of another class than in its own.

**Solution:** To fix feature envy you have to move the method to the class that actually owns the data it is so envious of.


**CODE SMELL 10: SHORTGUN SURGERY**

Shortgun surgery occurs when every time you make a small change in one class, yo have to make a lot of little changes in many other different classes.

**Solution:** You have to take all those changes and bring them back into a single, central point of control.
