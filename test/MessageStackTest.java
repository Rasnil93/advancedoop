import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageStackTest {

    @Test
    void testMessageStack() {

        MessageStack stack = new MessageStack(4);
        stack.push(new Message("a"));
        stack.push(new Message("b"));
        stack.push(new Message("c"));
        stack.push(new Message("d"));
        assertTrue(stack.isFull());
        assertEquals(stack.Size(),4);


    }
}