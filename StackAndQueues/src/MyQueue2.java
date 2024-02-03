import java.util.Stack;

// this is remove efficient
class MyQueue2 {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue2() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        // pop from first and push to second
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        // now push to first
        first.push(x);
        // now, pop from second and push to first
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
    }

    public int pop() {
        return first.pop();
    }

    public int peek() {
        return first.peek();
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
