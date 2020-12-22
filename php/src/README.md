###Acceptance criteria (Test Cases)

Conway's Game of Life
The rules for Conway's Game of Life are pretty simple:
- Any live cell with fewer than two live neighbours dies, as if caused by under-population.
- Any live cell with two or three live neighbours lives on to the next generation.
- Any live cell with more than three live neighbours dies, as if by overcrowding.
- Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.

**MATRIX/GRID:**
- A finite grid/matrix (N size)
- Two-dimensional (NxM dimensions)
- Init the cell values (NULL or -1)
  
**(Test Cases) -**
  We need to generate a matrix/grid 4x4 with the below values 
  - [0:0 -> 1, 0:1 -> 0, 0:2 -> 1, 0:3 -> 1]
  - [1:0 -> 0, 1:1 -> 0, 1:2 -> 1, 1:3 -> 0]
  - [2:0 -> 0, 2:1 -> 0, 2:2 -> 0, 2:3 -> 1]
  - [3:0 -> 1, 3:1 -> 0, 3:2 -> 1, 3:3 -> 1]
  
**GAME:**
- Place the cells
- Track the neighbors
- Glider evolution

**CELLS:**
We can create a method that takes in the current cell state (live/dead) and the number of live neighbors and then spits out a new state (live/dead)
- Two possible states (Dead=0 or Alive=1)
- Every cell interacts with its eight neighbors ( <- CELL -> )

**(Test Cases)**
 We need to place a cell on a grid box when the cell value is always NULL
 - IF cell is NULL/-1 then fill with glider(s)