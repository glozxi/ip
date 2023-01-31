package duke.uiText;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UiTextTest {
    private UiText uiText;

    @BeforeEach
    public void setUpObject() {
        uiText = new UiText();
    }

    @Test
    public void testGreet() {
        assertEquals("Hello, I am Duke.\n"
                + "What can I do for you?", uiText.getGreeting());
    }

    @Test
    public void testGoodbye() {
        assertEquals("Goodbye. I hope to see you again.", uiText.sayGoodbye());
    }
}
