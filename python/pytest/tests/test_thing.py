import pytest

from app.game_of_life import tick, create_field, game_rule


def test_underpopulation():
    field = create_field((5, 5))
    field = tick(field)
    assert not field[5][5]


def test_init_empty_field():
    field = create_field()
    for row in field:
        for column in row:
            assert column is False


def test_overcrowding():
    field = create_field((4, 5),
                         (5, 4), (5, 5), (5, 6),
                         (6, 5))
    field = tick(field)
    assert not field[5][5]

@pytest.mark.skip()
def test_stay_alive():
    field = create_field((5, 4), (5, 5), (5, 6),
                         (6, 5))
    field = tick(field)
    assert field[5][5]


def test_overcrowding_rule():
    assert not game_rule(neighbour_count=4, state=True)


def test_stay_alive_rule():
    assert game_rule(neighbour_count=2, state=True)
    assert game_rule(neighbour_count=3, state=True)


def test_lonely_rule():
    assert not game_rule(neighbour_count=1, state=True)

def test_born_rule():
    assert game_rule(neighbour_count=3, state=False)
