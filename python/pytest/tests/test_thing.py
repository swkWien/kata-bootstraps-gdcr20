import enum


class Coin(enum.Enum):
    penny = 1
    nickel = 5
    dime = 10
    quarter = 25

def coin_value(coin_identifier: Coin):
    return coin_identifier.value

def test_penny_coin_value():
    assert coin_value(Coin.penny) == 1

def test_nickel_coin_value():
    assert coin_value(Coin.nickel) == 5

def test_dime_coin_value():
    assert coin_value(Coin.dime) == 10


def test_quarter_coin_value():
    assert coin_value(Coin.quarter) == 25
