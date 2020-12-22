import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    void it_should_not_fail() {
        assertTrue(true);
    }

    @Test
    void cell_should_check_if_it_alive(){
        Cell cell = new Cell(0,0,true);
        assertEquals(true, cell.getIsAlive());
    }

}