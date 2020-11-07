#
from app.game_of_life import tick, create_field


def test_underpopulation():
    field = create_field((5, 5))
    field = tick(field)
    assert not field[5][5]


def test_init_empty_field():
    field = create_field()
    for row in field:
        for column in row:
            assert column is False

