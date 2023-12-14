import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ThingTest {

    @Test
    void whenPacmanEatsOneBulletItDoesNotGrow() {
        Pacman pacman = new Pacman(1);
        pacman.eat(Element.BULLET);

        assertThat(pacman.getSize())
                .isEqualTo(1);
    }

    @Test
    void whenPacmanEatsThreeBulletItGrows() {
        Pacman pacman = new Pacman(1);
        pacman.eat(Element.BULLET);
        pacman.eat(Element.BULLET);
        pacman.eat(Element.BULLET);

        assertThat(pacman.getSize())
                .isEqualTo(2);
    }

    @Test
    void whenPacmanEastsAGhostItGrowsByTwo() {
        Pacman pacman = new Pacman(2);

        pacman.eat(Element.GHOST);

        assertThat(pacman.getSize()).isEqualTo(4);
    }

    @Test
    void whenPacmanHitItselfItDies() {
        Pacman pacman = new Pacman(10);
        
        pacman.moveRight();
        pacman.moveUp();
        pacman.moveLeft();
        pacman.moveBottom();
        
        assertTrue(pacman.isDead());
    }

    private class Pacman {
        private int size;
        private int bulletsEaten;

        private List<Position> body;

        public Pacman(int size) {
            this.size = size;
            this.bulletsEaten = 0;
            body = new ArrayList<>();
            for (int i = 0; i < size; i++)
                body.add(new Position());
        }

        public void eat(Element element) {
            if (element == Element.BULLET) {
                bulletsEaten++;
                if (bulletsEaten % 3 == 0) {
                    size++;
                }
            } else {
                size += 2;
            }
        }

        public int getSize() {
            return size;
        }

        public void moveRight() {
            
        }

        public boolean isDead() {
            return false;
        }

        public void moveUp() {
            
        }

        public void moveLeft() {
            
        }

        public void moveBottom() {
        }
    }

    private enum Element {
        BULLET, GHOST;
    }

    private class Position {
    }
}
