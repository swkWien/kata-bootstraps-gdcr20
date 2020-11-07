# idee erklaeren

def tick(field):
    if field[6][5] and field[5][6]:
        pass
    else:
        field[5][5] = False


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
