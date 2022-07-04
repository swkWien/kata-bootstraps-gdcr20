import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.BDDMockito.when;

public class ThingTest {

    @BeforeEach
    void beforeEach() {
        MockitoAnnotations.openMocks(this);
    }
    @Test
    void fail() {
        Thing thing = new Thing();
        String value = thing.callForAction();
        assertThat(value).isEqualTo("Food");
    }

    @Test
    void it_should_not_fail() {
        assertThat(true).isTrue();

    }
}
