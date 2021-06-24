import spock.lang.Specification

class GameSpec extends Specification {

    def "There exists a game with fields"() {
        given:
        def game = new Game(1, 1)

        when:
        def fields = game.fields

        then:
        fields.size()  == 1
    }

}
