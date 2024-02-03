public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    protected int front = 0;
    protected int end = 0;
    protected int size = 0;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size += 1;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("can not remove from empty queue.");
        }
        int item = data[front++];
        front = front % data.length;
        size -= 1;
        return item;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("can not remove from empty queue.");
        }

        return data[front];
    }

    public void display() {
        int i = front;
        do {
            System.out.print(data[i] + " <- ");
            i++;
            i = i % data.length;
        } while (i != end);
        System.out.println("END");
    }

//        if (front < end) {
//            for (int i = front; i < end; i++) {
//                System.out.print(data[i] + " <- ");
//            }
//        } else if (size != 0) {
//            while (front < data.length) {
//                System.out.print(data[front] + " <- ");
//                front += 1;
//            }
//        } else {
//            for (int i = 0; i < (data.length - front); i++) {
//                System.out.print(data[i] + " <- ");
//            }
//
//            while (end < front) {
//                System.out.print(data[end] + " <- ");
//                end += 1;
//            }
//        }
//
//        System.out.println("END");
    //  }


}
