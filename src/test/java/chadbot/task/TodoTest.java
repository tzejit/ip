package chadbot.task;

import chadbot.ChadException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class TodoTest {
    @Test
    public void Todo_emptyDescription_chadExceptionThrown(){
        try {
            assertEquals(0, new Todo(""));
            fail(); // the test should not reach this line
        } catch (ChadException e) {
            assertEquals("The description of a task cannot be empty.", e.toString());
        }
    }

    @Test
    public void toString_properDescription_correctStringFormat(){
        try {
            assertEquals("[T][ ] eat", (new Todo("eat").toString()));
        } catch (ChadException e) {
            fail();
        }

    }
}
