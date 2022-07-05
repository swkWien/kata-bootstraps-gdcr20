package vending_machine;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

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

    @Test
    void given_FirstUse_ThenMessageIsInsertCoin() {
        Message message = new Message("INSERT COIN");
        assertThat(machine.showMessage()).isEqualTo(message.toString());
    }



}
