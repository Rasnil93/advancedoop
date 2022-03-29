public class MessageStack {
    private Message[] stack;
    private int size = 0;
    private int length = 0;

    public MessageStack(int length) {
        this.stack = new Message[length];
        this.length = length;
    }

    public boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
    }

    public boolean isFull(){
        if(length == size){
            return true;
        }
        return false;
    }

    public int Size(){
        return size;
    }

    public Message pop (){
        if(isEmpty()) {
            System.out.println("Is empty");
            return null;
        }
        Message tempMsg = stack[size-1];
        stack[size-1] = null;
        size--;
        return tempMsg;
    }

    public void push(Message element) {
        if(isFull()) {
            Message[] newArr = new Message[length+1];

            for (int i = 0; i < length; i++) {
                newArr[i] = stack[i];
            }

            stack = newArr;
        }
        stack[size] = element;
        size++;
    }
}
