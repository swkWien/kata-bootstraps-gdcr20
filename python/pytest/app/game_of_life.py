def tick(field):
    """Progress a field one tick forward and return it."""
    for row_idx, row in enumerate(field):
        for col_idx, col in enumerate(row):
            count = count_living_neighbors(field, (row_idx, col_idx))
            new_state = game_rule(neighbour_count=count, state=col)
            # TODO: continue here
            field[5][5] = False
    return field


def count_living_neighbors(field, cell: tuple):
    count = 0
    return count


def game_rule(neighbour_count, state):
    """Depending on the neighbour count and current state, return the new state."""
    return state and neighbour_count == 2 or neighbour_count == 3


def create_field(*args):
    """Create a field from a number of tuple arguments denoting living cells."""
    field = [[False] * 10] * 10
    for row, col in args:
        field[row][col] = True
    return field
