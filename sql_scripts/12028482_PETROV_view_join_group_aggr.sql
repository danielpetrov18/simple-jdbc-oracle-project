CREATE VIEW Customers_Total AS ( 
    SELECT p.surname, p.lastname, c.cID, c.telephoneNumber, SUM(price * ammount) AS Total FROM Orders ord 
    JOIN OrderContent con ON ord.orderID = con.ordID AND con.custId = ord.customerId 
    JOIN Pizza piz ON con.orderedPizza = piz.pizzaName
    JOIN Customer c ON c.cID = ord.CustomerID
    JOIN Person p ON p.pID = c.cID
    GROUP BY surname, lastname, cID, telephoneNumber HAVING SUM(price * ammount) >= 1100
);
---------------------------------------------------------------------------------------------------------
DROP VIEW Customers_Total;