import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    Stack stack;

    @BeforeEach
    void setStack(){
        stack = new Stack(4);
    }

    //create a test that pop and push multiple ints into the stack
    @Test
    void multiplePopAndPush(){
        int [] testArray = {1,2,3,4,5,6,7,8,9,10};
        stack.push(testArray);

        assertEquals(stack.getSize(),10);

        stack.pop(7);
        assertEquals(stack.getSize(),3);
    }

    @Test
    void testPopAndPush() {
        assertTrue(stack.isEmpty());

        for (int i = 1; i < 5; i++) {
            stack.push(i);
            assertEquals(stack.getIntAtIndex(i-1), i);
        }

        assertTrue(stack.isFull());

        for (int i = 0; i < stack.getLength(); i++) {
            assertEquals(stack.pop(),stack.getLength()-i);
        }
    }

    @Test
    void testFullStack(){
        for (int i = 1; i < 5; i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }


    @Test
    void testEmptyStack(){
        assertTrue(stack.isEmpty());
    }

}