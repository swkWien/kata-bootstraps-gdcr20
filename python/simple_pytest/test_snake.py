"""
1. Iteration

Snake Test Cases
* Where is the snake? <-- our focus for now


Snake on the screen
Is there an environment for the snake?
Screen size of the snake?
There is some kind of grid.
"""
from snake import Snake


def test_that_snake_has_a_position():
    snake = Snake()
    assert snake.position == (0, 0)
