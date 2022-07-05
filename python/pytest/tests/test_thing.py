import enum

import pytest


class Coin(enum.Enum):
    penny = 1
    nickel = 5
    dime = 10
    quarter = 25

def coin_value(coin_identifier: Coin):
    if not isinstance(coin_identifier, Coin):
        raise ValueError("coin_identified should be an isntance of {}, but is {}".format(Coin, type(coin_identifier)))
    return coin_identifier.value

def test_penny_coin_value():
    assert coin_value(Coin.penny) == 1

def test_nickel_coin_value():
    assert coin_value(Coin.nickel) == 5

def test_dime_coin_value():
    assert coin_value(Coin.dime) == 10


def test_quarter_coin_value():
    assert coin_value(Coin.quarter) == 25

def test_should_throw_error_for_invalid_coin():
    with pytest.raises(Exception):
        class X:
            value = 113
        coin_value(X())


class Product(enum.Enum):
    cola = 100
    chips = 50
    candy = 65


def product_price(product: Product):
    return product.value

def test_cola_product():
    assert product_price(Product.cola) == 100

def test_chips_price():
    assert product_price(Product.chips) == 50

def test_candy_price():
    assert product_price(Product.candy) == 65


class VendingMachine:
    def __init__(self):
        self.value = 0

    def display_text(self):
        return "INSERT COIN"

    def current_value(self):
        return self.value


def test_display_message_is_initially_insert_coin():
    initial_vending_machine = VendingMachine()
    assert initial_vending_machine.display_text() == "INSERT COIN"

def test_vending_machine_current_value():
    vending_machine = VendingMachine()
    assert vending_machine.current_value() == 0
    
