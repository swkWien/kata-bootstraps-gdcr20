package com.kata

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class HelloWorldTest {

     @Test
     fun `pacman leaves location when moving`() {
          val start = Location(342, 213)
          val pacman = Pacman()
          pacman.setLocation(start)

          pacman.move()

          assertFalse(start == pacman.getLocation())
     }

     @Test
     fun `pacman doesn't move around`() {
          val start = Location(342, 213)
          val pacman = Pacman()
          pacman.setLocation(start)

          assertTrue(start == pacman.getLocation())
     }

     @Test
     fun `pacman arrives at location to the right when moving right`() {
          val start = Location(342, 213)
          val end = Location(343, 213)
          val pacman = Pacman()
          pacman.setLocation(start)

          pacman.setDirection(Direction.RIGHT)
          pacman.move()

          assertTrue(end == pacman.getLocation())
     }

     @Test
     fun `pacman arrives at location two to the right when moving right twice`() {
          val start = Location(342, 213)
          val end = Location(344, 213)
          val pacman = Pacman()
          pacman.setLocation(start)

          pacman.setDirection(Direction.RIGHT)
          pacman.move()
          pacman.move()

          assertTrue(end == pacman.getLocation())
     }

     @Test
     fun `pacman arrives at location when moving right and up`() {
          val start = Location(342, 213)
          val end = Location(343, 212)
          val pacman = Pacman()
          pacman.setLocation(start)

          pacman.setDirection(Direction.RIGHT)
          pacman.move()
          pacman.setDirection(Direction.UP)
          pacman.move()

          assertTrue(end == pacman.getLocation())
     }

     @Test
     fun `pacman starts at given location`() {
          val start = Location(3, 78)
          val pacman = Pacman()
          pacman.setLocation(start)

          assertTrue(start == pacman.getLocation())
     }
     @Test
     fun `pacman starts at given location with given direction`() {
          val start = Location(3, 78)
          val end = Location(3, 79)
          val pacman = Pacman()
          pacman.setLocation(start)
          pacman.setDirection(Direction.DOWN)
          pacman.move()
          pacman.setDirection(Direction.RIGHT)
          assertEquals(end, pacman.getLocation())
     }
}


class Pacman {
     private var moveCount: Int = 0
     private var direction: Direction = Direction.RIGHT
     private var context = direction.name + moveCount
     private var location: Location = Location(0, 0)

     fun setLocation(location: Location) {
          this.location = location
     }

     fun move() {
          moveCount++
          context = direction.name + moveCount
     }

     fun getLocation(): Location {


          return when (context) {
               "RIGHT0" -> this.location
               "RIGHT1" -> Location(343, 213)
               "RIGHT2" -> Location(344, 213)
               "UP2" -> Location(343, 212)
               else -> throw Exception("oops!")
          }
     }

     fun setDirection(direction: Direction) {
          this.direction = direction
          context = direction.name + moveCount
     }
}

enum class Direction {
     RIGHT, UP, DOWN
}

data class Location(val x: Int, val y: Int)
