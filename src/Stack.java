public class Stack <E> {

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

    public boolean isFull(){
        if(length == size){
            return true;
        }
        return false;
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
            /*
            [1,2,3,4] //length = 4, size = 4
            push(5)
            [0,0,0,0,0] //length = 5, size = 0
            [1,2,3,4 ,0] //length = 5, size = 4
            nu kan vi pusha wiho
            [1,2,3,4,5]
             */
            int[] newArr = new int[length+1];

            for (int i = 0; i < length; i++) {
                newArr[i] = stack[i];
            }

            stack = newArr;
        }
        stack[size] = element;
        size++;
    }

    public static void main(String[] args) {
        Stack ourStack = new Stack(4);
        ourStack.pop();
        ourStack.push(1);
        ourStack.push(2);
        ourStack.push(3);
        ourStack.pop();
        ourStack.push(4);
        ourStack.push(5);
        ourStack.pop();
        ourStack.pop();
        ourStack.pop();
        ourStack.pop();

        Stack emptyStackTest = new Stack(0);
        emptyStackTest.pop();
        emptyStackTest.push(1);
        emptyStackTest.push(2);



    }

}
