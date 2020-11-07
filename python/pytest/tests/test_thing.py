import pytest


def count_living_neighbours(field, x, y):
    cnt = 0

    for i in range(x - 1, x + 2):
        for j in range(y - 1, y + 2):
            if i == j:
                continue
            if x < 0:
                continue
            if y < 0:
                continue
            if x >= len(field):
                continue
            if x >= len(field[0]):
                continue
            cnt += int(field[i][j])
    return cnt


def tick(field):
    for y, row in enumerate(field[:-1]):
        for x, cell in enumerate(row[:-1]):
            if count_living_neighbours(field, x, y) == 2:
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
    (5, 5, []),
    (2, 2, [(5, 6), (6, 5)]),
])
def test_living_cell_with_no_living_neighbours_dies(x, y, alive):
    field = create_field(*[(x, y)] + alive)

    tick(field)

    assert not field[x][y]


@pytest.mark.parametrize("x,y,alive", [
    (5, 5, [(5, 6), (6, 5)]),
    (5, 5, [(4, 5), (5, 4)]),
])
def test_living_cell_with_two_living_neighbours_stays(x, y, alive):
    field = create_field(*[(x, y)] + alive)

    tick(field)

    assert field[x][y]


@pytest.mark.parametrize("x,y,alive", [
    (5, 5, [(5, 6), (6, 5)]),
    (5, 5, [(4, 5), (5, 4)]),
])
def test_count_living_cell_with_two_living_neighbours_stays(x, y, alive):
    field = create_field(*[(x, y)] + alive)

    assert count_living_neighbours(field, x, y) == 2
