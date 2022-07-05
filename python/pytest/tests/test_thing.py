"""
Session #1 / Kata
Vending Machine
see all details Vending Machine Kata

products:
* Cola - 1 $
* Chips - 0,50 $
* Candy - 0,65 $
valid coins:
* Penny - 1 cent
* Nickel - 5 cents
* Dime - 10 cents
* Quarter - 25 cents

Features
* Display: "INSERT COIN", if one is inserted, show the value of the coin and update the current amount of money
* Select product: if enough money has been inserted, present the product and display "THANK YOU" for 5 seconds
* Make change: return the amount of money, that hasn't been used
* Return coins button: return the placed coins and display "INSERT COIN"
* Sold out: if product is out of stock, display "SOLD OUT" for 5 seconds
* Exact change only: display "EXACT CHANGE ONLY" if the machine is not able to give chance.

Constraint to focus on:
* One argument per function
* Try to work on buying something
"""
from app.thing import Thing


def test_fail():
    thing = Thing("Albert")
    assert "Hello Albert!" == thing.return_hello_name()


def buy_product(product):
    return (product, 0)


# state = set_inventory(("Cola", 1), "Candy", ...)
# select = accept_coins("Quarter")
# buy = select("Cola")
# select = buy()


def test_buy_a_cola():
    product = buy_product("Cola")
    (item, change) = product
    assert "Cola" == item


def test_buy_a_candy():
    (item, change) = buy_product("Candy")
    assert "Candy" == item
