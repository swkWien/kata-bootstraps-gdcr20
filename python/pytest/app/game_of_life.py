def tick(field):
    """Progress a field one tick forward and return it."""
    field[5][5] = False
    return field


def create_field(*args):
    """Create a field from a number of tuple arguments denoting living cells."""
    field = [[False] * 10] * 10
    for row, col in args:
        field[row][col] = True
    return field
