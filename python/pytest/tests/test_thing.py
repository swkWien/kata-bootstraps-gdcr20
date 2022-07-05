import enum


def coin_value(coin_identifier):
    if coin_identifier == "penny":
        return 1

def test_penny_coin_value():
    assert coin_value('penny') == 1
