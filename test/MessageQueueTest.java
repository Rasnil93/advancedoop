import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageQueueTest {

    @Test
    void testMessageQueue() {
        MessageQueue mq = new MessageQueue( 4 );
        assertEquals( mq.size(), 0 );
        assertFalse( mq.isFull() );
        assertNull( mq.peek() );
    }

    @Test
    void testFullQueue(){
        MessageQueue queue = new MessageQueue(4);
        queue.add(new Message("a"));
        queue.add(new Message("b"));
        queue.add(new Message("c"));
        queue.add(new Message("d"));
        assertTrue(queue.isFull());
        queue.add(new Message("e"));
        assertEquals(queue.size(),5);

        queue.remove();

        assertEquals(queue.peek().toString(),"b");

        queue.add(new Message("q"));
        queue.add(new Message("p"));

        assertEquals(queue.size(),6);
    }

}