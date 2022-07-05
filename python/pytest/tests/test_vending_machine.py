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
"""

from app.vending_machine import Product, Products, VendingMachine


def test_vending_machine_has_products():
    m = VendingMachine()
    products = Products()
    assert m.products == products




def test_product_equality():
    product_a = Product('a')
    another_product_a = Product('a')

    assert product_a == another_product_a


def test_products_are_different_if_they_contain_different_items():
    products1 = Products()
    product_a = Product("a")
    products1.add(product_a)

    products2 = Products()
    product_b = Product("b")
    products2.add(product_b)
    assert products2 != products1


def test_products_can_take_product():
    products = Products()
    products.add("spam")
    assert len(products) == 1
    products.add("ham")
    assert len(products) == 2
