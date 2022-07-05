package vending_machine;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void givenToStringCall_ToEnumThankYouElement_ThenThanYouStringIsReturned() {
        String message = MessageGenerator.THANK_YOU.toString();
        Assertions.assertThat(message).isEqualTo("THANK YOU");
    }
}
