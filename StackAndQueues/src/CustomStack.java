public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;// this is the reference for pushing item in the stack

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        // check if stack is full, then throw stack overflow error
        if (isFull()) {
            System.out.println("Stack is full.");
            return false;
        }

        ptr += 1;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("stack is empty,can not pop.");
        }
        int popOut = data[ptr];
        data[ptr] = 0;
        ptr -= 1;

        return popOut;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("can not peek from empty stack.");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }

}
