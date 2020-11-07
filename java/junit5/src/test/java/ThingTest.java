import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ThingTest {

    @Test
    void pseudo() {
        // in universe
        //for each coordinates
        //   if neighborhoodOfCoordinate.shouldCenterBeAlive()
        //       newUniverse.setAlive(coordinate)
    }

/*    class Universe {
        Neighbourhood neighbourhoods[][];

        Universe evolve() {
            Universe newUniverse = new Universe();
            for (Neighbourhood neighbourhood: neighbourhoods) {
                if (neighbourhood.shouldCenterBeAlive()) {
                    newUniverse.setAlive(coord, true)
                }
            }
        }
    }
    */

    class Neighbourhood {
        boolean centerAlive;
        int livingNeighbours;

        public boolean shouldCenterBeAlive() {
            boolean genesis = !centerAlive && (livingNeighbours == 3);
            boolean satisfaction = centerAlive && (livingNeighbours == 2 || livingNeighbours == 3);
            return satisfaction || genesis;
        }

        public void setAlive() {
            centerAlive = true;
        }

        public void addLivingNeighbour() {
            livingNeighbours++;
        }
    }

    @Test
    void neighbourhoodOfDeadCellWithoutNeighboursStaysDead() {
        Neighbourhood n = new Neighbourhood();
        boolean result = n.shouldCenterBeAlive();
        assertFalse(result);
    }

    @Test
    void neighbourhoodOfLivingCellWithoutNeighboursDies() {
        Neighbourhood n = new Neighbourhood();
        n.setAlive();
        boolean result = n.shouldCenterBeAlive();
        assertFalse(result);
    }

    @Test
    void neighbourhoodOfDeadCellWithThreeLivingNeighboursBecomesAlive() {
        Neighbourhood n = new Neighbourhood();
        n.addLivingNeighbour();
        n.addLivingNeighbour();
        n.addLivingNeighbour();
        boolean result = n.shouldCenterBeAlive();
        assertTrue(result);
    }

    @Test
    void neighbourhoodOfAliveCellWithThreeLivingNeighboursStaysAlive() {
        Neighbourhood n = new Neighbourhood();
        n.setAlive();
        n.addLivingNeighbour();
        n.addLivingNeighbour();
        n.addLivingNeighbour();
        boolean result = n.shouldCenterBeAlive();
        assertTrue(result);
    }

    @Test
    void neighbourhoodOfAliveCellWithTwoLivingNeighboursStaysAlive() {
        Neighbourhood n = new Neighbourhood();
        n.setAlive();
        n.addLivingNeighbour();
        n.addLivingNeighbour();
        boolean result = n.shouldCenterBeAlive();
        assertTrue(result);
    }

    @Test
    void neighbourhoodOfAliveCellWithFourLivingNeighboursDiesOut() {
        Neighbourhood n = new Neighbourhood();
        n.setAlive();
        n.addLivingNeighbour();
        n.addLivingNeighbour();
        n.addLivingNeighbour();
        n.addLivingNeighbour();
        boolean result = n.shouldCenterBeAlive();
        assertFalse(result);
    }

    @Test
    void neighbourhoodOfDeadCellWithTwoLivingNeighboursStaysDead() {
        Neighbourhood n = new Neighbourhood();
        n.addLivingNeighbour();
        n.addLivingNeighbour();
        boolean result = n.shouldCenterBeAlive();
        assertFalse(result);
    }

}
