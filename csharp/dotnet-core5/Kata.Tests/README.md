class Game { behaviour}
- createGrid() :array
- initaliseGridWithCells() :void
-
class Cell {statefull}
- (bool) status //live or die
- (int) x cordinate
- (int) y cordinate
- (int) number of living neighbours

class Grid {statefull}
- (int) x width
- (int) y hight
- (array) cells
- (string) position type ('corner', 'side', 'full')

TESTs:
- ~~is_cell_alive~~
- is_cell_not _alive
- is_position_type_corner
- is_position_type_side
- is_position_type_full
- cell_can_have_maximum_three_neighbours if cell is on corner
- cell_can_have_maximum_five_neighbours if cell is at border of grid
- cell_can_have_maximum_eight_neighbours
- ~~cell_has_fewer_than_live_two_neighbours_and_die~~
- ~~cell_has_exactly_two_live_neighbours_and_live_next_generation~~
- ~~cell_has_exactly_three_live_neighbours_and_live_next_generation~~
- ~~cell_has_more_than_three_live_neighbours_and_die~~
- dead_cell_has_exactly_three_live_neighbours_and_live_next_generation
- cell_survive_next_generation 