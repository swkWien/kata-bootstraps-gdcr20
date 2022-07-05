package vending_machine;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MachineTest {
    Machine machine;


    @BeforeEach

    void setUp() {
        machine = new Machine();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void given_FirstUse_ThenMachineIsInWelcomeState() {
        assertThat(machine.state).isInstanceOf(InsertCoin.class);
    }
}
