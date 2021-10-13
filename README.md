# SOFE3650 Assignment 3: Architecture Patterns

Course_Gp 30 - Group Members:<br/>
Usman Mahmood 100349839<br/>
Karanvir Bhogal 100748973<br/>
Daniel Grewal 100768376<br/>
Mohammed Adnan Hashmi 100753115<br/>

# Ex. 4: Comment on the advantages and disadvantages of the 3 approaches.

Ex. 1 Approach:

Advantage:
Easiest to implement the View components (Display, TicketPrinter) without any regard for layering.

Disadvantages:
1) Dependancy is backwards, the model is dependant on the views. This makes it more difficult to maintain or replace the views, because there are no defined layers.
2) The model is too tightly coupled to this particular implementation of the views. In this implementation, the model requires awareness of the internal functionality of the views.

Ex. 2 Approach:

Advantage:
Coupling is looser between the model and the views. The use of an interface instead of a concrete class does not force the model to be dependant on a particular implementation of the views. Therefore, the views can be swapped out without requiring changes in the model.

Disadvantage:
Although not tightly coupled as in Ex 1, the model is still dependant on the view. 

Ex. 3 Approach:

Advantages:
1) Model is loosely coupled with the views. The view is observing the model, and therefore updates itself if any change occurs in the model.
2) The view is now dependant on the model, which is ideal for the MVC architecture.

Disadvantage:
This method requires knowledge of how to implement the Observer pattern, therefore making it the hardest to implement of the 3 approaches.
