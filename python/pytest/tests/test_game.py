"""
Components and Concepts
=======================

Grid
Cell are elements of the grid
Cell has a coordinate (it is a node in the grid)
Cell has a state (dead or alive)

Neighborhood
A cell needs to know about it's neighborhood

Game
Game "holds" the cells
Game can evolve cells (from current state to next state)

Approach
========

Build the system outside in, starting with (overly) simplified
inputs.
We aim for OO.
"""
from app.game import Game

def test_game_without_arguments_does_not_hold_any_cells():
    game = Game()
    assert game.cells == {}
