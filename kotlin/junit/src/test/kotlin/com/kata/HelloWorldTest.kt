package com.kata

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

internal class HelloWorldTest {

    @Test
    fun gameStartsWithEmptyField() {
        val game = Game()

        // 0, 0 is bottom left
        val expectedBoard = (0..20).map { y ->
            (0..10).map { x -> FieldState.Empty }
        }
        assertEquals(expectedBoard, game.board)
    }

    @Test
    fun gameStartsWithScore0() {
        val game = Game()

        assertEquals(0, game.score)
    }

    @Test
    fun game_() {
        val game = Game()

        game.tick()

        val expectedBoard = (0..20).map { y ->
            (0..10).map { x -> FieldState.Empty }
        }
        // expectedBoard[20][5] should be a filled field
        assertEquals(expectedBoard, game.board)
    }
}

