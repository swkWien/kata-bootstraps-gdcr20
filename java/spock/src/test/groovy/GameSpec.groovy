import spock.lang.Specification

class GameSpec extends Specification {

    def "A game of #n x #m has #fieldCount fields"() {
        given:
        def game = new Game(n, m)

        when:
        def fields = game.fields

        then:
        fields.size()  == fieldCount

        where:
        n | m || fieldCount
        1 | 1 || 1
        2 | 2 || 4
        3 | 1 || 3
    }

    def "A game size cannot be smaller than 1"() {
        when:
        new Game(0, 0)

        then:
        thrown(IllegalArgumentException)
    }

    def "A new game is seeded with empty fields"() {
        given:
        def game = new Game(1, 1)

        expect:
        game.fieldAt(1, 1).type == 'empty'
    }

    def "Game coordinates are 1-based"() {
        given:
        def game = new Game(1, 1)

        when:
        game.fieldAt(0, 0)
        thrown(IllegalArgumentException)

    }

    // DANKE!!!!



//        def "A game of #n x #m has #fieldCount fields"() {
//        given:
//        def coordinate = Mock(Coordinate)
//        def game = new Game(3, 1)
//
//        when:
//        game.snakeAt(coordinate)
//
//        then:
//        game.fieldAt(coordinate) == Field.SNAKE
//    }

    }
