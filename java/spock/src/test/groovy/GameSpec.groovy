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

}
