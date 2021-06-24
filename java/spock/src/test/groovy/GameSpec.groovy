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

    }

    def "A game size cannot be smaller than 1"() {
        when:
        new Game(0, 0)

        then:
        thrown(IllegalArgumentException)
    }

}
