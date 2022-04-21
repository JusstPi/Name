# DebitCard
These are just school works!!TY!
Define a Name class with attributes: 
String firstname, middle name, lastname. 
Include the following methods:
-A constructor with 3 parameters. Initialize the 3 member variables tothe parameters being passed. Also, include the defaultconstructor.
-getter and setter methods for allattributes
-override toStringmethod
Define a class called DebitCard. 
A debit card has a card number, Name and balance.
a)Include a constructor with 3 parameters. Initialize the 3 member variables to the parameters being passed. Also, include the defaultconstructor.
b)Include getters/setters for allattributes.
c)Add the following memberfunctions:
floatinquireBalance()
float depositCash(floatamount)//increases the balance with amount
boolean withdrawCash(floatamount)// returns true if sufficient amount is available for withdrawal and decreases the balance by amount
float interest(floatrate)//calculates the interest rate incurred. Assume the parameter rate is considered as annual interest. Update the balance available.
d)Override the toString()method
In a separate class called TestClass, define a main method which will work as follows: 
Enter name: Juan delaCruz
Enter account number: A101-1125 
Enter beginning balance:1000.00
DEBIT CARD TRANSACTION
[1]DepositCash
[2]WihdrawCash
[3]Inquire Balance
[4]Calculate InterestRate
[5]Exit
