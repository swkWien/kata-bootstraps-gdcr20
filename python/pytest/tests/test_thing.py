# idee erklaeren

def tick(field):
    field[5][5] = False

def test_living_cell_with_no_living_neighbours_dies():
    column = [ False ] * 10
    field = [ column ] * 10
    field[5][5] = True

    tick(field)

    assert not field[5][5]
