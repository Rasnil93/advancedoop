public class Stack {

    private int[] stack;
    private int size = 0;
    private int length = 0;

    public Stack(int length) {
        this.stack = new int[length];
        this.length = length;
    }

    public boolean isEmpty(){
        if(size == 0)
            return true;
        return false;
    }

    public int getIntAtIndex(int index){
        if(index < size){
            return stack[index];
        }
        return 0;
    }

    public boolean isFull(){
        if(length == size){
            return true;
        }
        return false;
    }

    public int getSize(){
        return size;
    }

    public int getLength(){
        return length;
    }

    public int pop (){
        if(isEmpty()) {
            System.out.println("Is empty");
            return 0;
        }
        int tempInt = stack[size-1];
        stack[size-1] = 0;
        size--;
       return tempInt;
    }

    public void push(int element) {
        if(isFull()) {
            int[] newArr = new int[length+1];

            for (int i = 0; i < length; i++) {
                newArr[i] = stack[i];
            }

            length = length + 1;

            stack = newArr;
        }
        stack[size] = element;
        size++;
    }

    public int[] pop(int amountOfElements )  {
        if(amountOfElements > size) {
            throw new IllegalArgumentException("Not enough elements in stack");
        }

        int[] tempArr = new int[amountOfElements];
        for(int i = 0; i < amountOfElements; i++){
            tempArr[i] = pop();
        }

        return tempArr;
    }

    public void push(int[] elements) {
        for (int element : elements) {
            push(element);
        }
    }
}
