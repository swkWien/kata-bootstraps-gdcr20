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

Discussion:

ShopState (immutable, data object)
- catalog
- inventory
- available amount

buy_product = prepare_shopping(shop_state)

get_product, buy_product, get_change, add_coins = buy_product("cola")
"""
def buy_product(product):
    def get_product():
        return product
    return get_product


def test_buy_a_cola():
    get_product = buy_product("Cola")
    item = get_product()
    assert "Cola" == item


def test_buy_a_candy():
    get_product = buy_product("Candy")
    item = get_product()
    assert "Candy" == item
