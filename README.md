# chain-of-responsibilities-example
Implements an example of the Design Pattern Chain of Responsibilities to calculate the sales commission according to some rules that involves the Total Amount of a Sale and the Average Price of Sale Items.


Rules:
•	If total of a sale < $5,000.00  Commission = $100.00
•	If total between 5,000 e 10,000  Commission equals 5% of total. However,  in case the average price of itens in the sale > $800.00 add 1% more to the commission
•	If total between 10.000 e 20.000  Commission equals 7% of total + Bonus of $500,00. If average price of itens in the sale > 1,000.00 , it brings 10% over the calculated commission.
•	If total exceed 20,000  Commission equals 10% of total, plus 1,000.00 as bonus. In addition, if average price of itens > 1,500.00 it includes an extra bonus of 100,00 for each sale item (itemsQtt x 100).
