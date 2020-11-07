import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

class `Game Of Life specs` {

    companion object {
        val ONE_CELL_ALIVE: String = """
                                ---
                                -x-
                                --- 
                                """
    }

    @Test
    fun `single cell should die from underpopulation`() {
        val nextUniverse = Universe(ONE_CELL_ALIVE).next()

        assertUniversesAreEqual(
            nextUniverse,
            Universe(
                """
            ---
            ---
            ---
            """
            )
        )
    }

    @Test
    fun `two universes of the same string representations are equal`() {
        assertUniversesAreEqual(
            Universe(ONE_CELL_ALIVE),
            Universe(ONE_CELL_ALIVE)
        )
    }

    private fun assertUniversesAreEqual(universe: Universe, otherUniverse: Universe) {
        assertThat(universe).isEqualTo(otherUniverse)
    }

}

class Universe(val universeStringRepresentation: String) {
    fun next(): Universe {
        return Universe("""
            ---
            ---
            ---
        """)
    }

    override fun toString(): String {
        return "\n" + universeStringRepresentation.trimIndent() + "\n"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Universe

        if (universeStringRepresentation != other.universeStringRepresentation) return false

        return true
    }

    override fun hashCode(): Int {
        return universeStringRepresentation.hashCode()
    }


}