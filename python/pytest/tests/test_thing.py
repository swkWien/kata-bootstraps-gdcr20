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


def product_prize(product):
    if product == "cola":
        return 100
def test_cola_product():
    assert product_prize("cola") == 100
