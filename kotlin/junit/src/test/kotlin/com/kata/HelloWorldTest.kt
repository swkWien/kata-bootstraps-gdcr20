package com.kata

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class HelloWorldTest {

     class Location(
          private var food: Boolean = false,
          private var pacman: Boolean = false,
     ) {

          fun hasFood(): Boolean {
               return food
          }

          fun hasPacman(): Boolean {
               return pacman
          }

          fun tick() {
               if (pacman) {
                    food = false
               }
          }
     }

     class Game(private val location: Location) {
          private var score: Int = 0

          fun getScore(): Int {
               return score
          }

          fun tick() {
               if(location.hasFood() && location.hasPacman()) {
                    score++
               }
          }
     }

     @Test
     fun `packman eats food`() {
          val location = Location(
               food = true,
               pacman = true
          )

          location.tick()

          assertEquals(false, location.hasFood())
     }

     @Test
     fun `location has food`() {
          val location = Location(
               food = true
          )
          assertEquals(true, location.hasFood())
     }

     @Test
     fun `location still has food if no pacman around`() {
          val location = Location(
               food = true
          )
          location.tick()
          assertEquals(true, location.hasFood())
     }

     @Test
     fun `initial score is 0`() {
         assertEquals(0, Game(Location()).getScore())
     }

     @Test
     fun `score increases when pacman eats food`() {

          val location = Location(
               food = true,
               pacman = true
          )

          val game = Game(location)

          game.tick()

          assertEquals(1, game.getScore())
     }

     @Test
     fun `score doesn't increase when there is no food`() {

          val location = Location(
               food = false,
               pacman = true
          )

          val game = Game(location)

          game.tick()

          assertEquals(0, game.getScore())
     }

     @Test
     fun `score doesn't increase when there is no pacman`() {

          val location = Location(
               food = true,
               pacman = false
          )

          val game = Game(location)

          game.tick()

          assertEquals(0, game.getScore())
     }
}
