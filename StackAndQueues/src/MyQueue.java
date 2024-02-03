import java.util.Stack;
// this is add efficient
class MyQueue {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public MyQueue() {
        first = new Stack<>();
        second = new Stack<>();
    }

    public void push(int x) {
        first.add(x);
    }

    public int pop() {
        // remove from first and insert to second
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        // now, pop from second, and then push back from first to second
        int popped = second.pop();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return popped;
    }

    public int peek() {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        // now, pop from second, and then push back from first to second
        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }

        return peeked;
    }

    public boolean empty() {
        return first.isEmpty();
    }
}
