import pytest


def tick(field):
    for y, row in enumerate(field[:-1]):
        for x, cell in enumerate(row[:-1]):
            if field[x + 1][y] and field[x][y + 1]:
                pass
            else:
                field[x][y] = False


def create_field(*living_cells):
    column = [False] * 10
    field = [column] * 10
    for x, y in living_cells:
        field[x][y] = True
    return field


@pytest.mark.parametrize("x,y,alive", [
    (5, 5, [(5, 5)]),
    (2, 2, [(2, 2), (5, 6), (6, 5)]),
])
def test_living_cell_with_no_living_neighbours_dies(x, y, alive):
    field = create_field(*alive)

    tick(field)

    assert not field[x][y]


def test_living_cell_with_two_living_neighbours_stays():
    field = create_field((5, 5), (5, 6), (6, 5))

    tick(field)

    assert field[5][5]
