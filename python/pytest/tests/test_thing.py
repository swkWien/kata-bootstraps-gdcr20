# idee erklaeren

def tick(field):
    x = 5
    y = 5
    if field[x + 1][y] and field[x][y + 1]:
        pass
    else:
        field[x][y] = False


def test_living_cell_with_no_living_neighbours_dies():
    column = [False] * 10
    field = [column] * 10
    field[5][5] = True

    tick(field)

    assert not field[5][5]


def test_living_cell_with_two_living_neighbours_stays():
    column = [False] * 10
    field = [column] * 10

    field[5][5] = True
    field[5][6] = True
    field[6][5] = True

    tick(field)

    assert field[5][5]
