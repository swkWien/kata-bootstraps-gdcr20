package com.kata

class Game {
    fun tick() {
        TODO("Not yet implemented")
    }

    val score = 0
    val board: List<List<FieldState>> = (0..20).map { y ->
        (0..10).map { x -> FieldState.Empty }
    }
}

sealed class FieldState {
    object Empty : FieldState()
}
