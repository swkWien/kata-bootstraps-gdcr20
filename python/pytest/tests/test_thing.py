import enum


def coin_value(coin_identifier):
    if coin_identifier == "penny":
        return 1
    if coin_identifier == "nickel":
        return 5
    if coin_identifier == "dime":
        return 10

def test_penny_coin_value():
    assert coin_value('penny') == 1

def test_nickel_coin_value():
    assert coin_value('nickel') == 5

def test_dime_coin_value():
    assert coin_value('dime') == 10
