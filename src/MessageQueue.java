public class MessageQueue
{
    private Message[] elements;
    private int head;
    private int tail;
    private int count;

    public MessageQueue(int capacity) {
        elements = new Message[capacity];
        count = 0;
        head = 0;
        tail = 0;
    }

    public Message remove() {
        Message r = elements[head];
        head = (head + 1) % elements.length;
        count--;
        return r;
    }
    
    private void increaseQueueSize(){
        /*
            h>t
             t h
            [5,2,3,4]//length 4
            increase by 2
            [0,0,0,0,0,0] //length 6
            [0,0,0,2,3,4] //copy head to end
            [5,0,0,2,3,4] //copy 0 to tail

            h<t
               h     t
            [6,1,2,3,4]
            copy over
            increase by 2
             h     t
            [1,2,3,4,6,0,0]

         */
        Message[] newMessageArr = new Message[count+1];
        int startIndex = 0;
        if(head < tail) {
            for (int i = head; i <= tail; i++) {
                newMessageArr[startIndex] = elements[i];
                startIndex++;
            }
            head = 0;
            tail = startIndex;
        }else{
            for (int i = head; i < elements.length ; i++) {
                newMessageArr[startIndex] = elements[i];
                startIndex++;
            }

            if(head == tail && tail != 0){
                for (int i = 0; i < tail; i++) {
                    newMessageArr[startIndex]= elements[i];
                    startIndex++;
                }
            }

            tail = startIndex;

            head = 0;
        }

        elements = newMessageArr;
    }
    
    public void add(Message aMessage) {
        if(isFull()){
            increaseQueueSize();
        }
        elements[tail] = aMessage;
        tail = (tail + 1) % elements.length;
        count++;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == elements.length;
    }

    public int size()
     {
     return count;
     }

     public Message peek()
     {
        return elements[head];
     }

}
