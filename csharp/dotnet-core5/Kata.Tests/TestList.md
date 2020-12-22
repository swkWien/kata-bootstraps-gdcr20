# Test List

- A board can be initialized with size 5x5
- After initializing a board with a cell, the cell is alive
- Round has 2 states: old and new
  - after round has ended the board has the new state


    
- Cell survives if
  - it has 2 living neighbours
  - it has 3 living neighbours
- Cell dies if
  - it has 0 living neighbours
  - it has 1 living neighbours
  - it has 4 or more living neighbours
- Cell comes to live if
  - it has 3 living neighbours
    