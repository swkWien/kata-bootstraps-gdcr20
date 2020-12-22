import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CellTest {

    @Test
    void cell_is_alive(){
        Cell cell = new Cell(0,0,true);
        assertTrue(cell.getIsAlive());
    }

    @Test
    void cell_is_not_alive(){
        Cell cell = new Cell(0,0,false);
        assertFalse(cell.getIsAlive());
    }

}