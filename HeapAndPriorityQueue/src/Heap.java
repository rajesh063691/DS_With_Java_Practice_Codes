import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list;

    public Heap() {
        list = new ArrayList<>();
    }

    private void swap(int first, int second) {
        T temp = list.get(first);
        list.set(first, list.get(second));
        list.set(second, temp);
    }

    private int parent(int index) {
        // taking root as 0th index
        return (index - 1) / 2;
    }

    private int left(int index) {
        // taking root as 0th index
        return (index * 2) + 1;
    }

    private int right(int index) {
        // taking root as 0th index
        return (index * 2) + 2;
    }

    public void insert(T value) {
        list.add(value); // this will add at the last index
        // noe try to check and swap from bottom to up heap approach

        upheap(list.size() - 1);
    }

    private void upheap(int index) {
        // check if its base condition
        if (index == 0) {
            return;
        }

        int p = parent(index);

        if (list.get(index).compareTo(list.get(p)) < 0) {
            swap(index, p);
            // check for parents till it reaches to oth index
            upheap(p);
        }
    }

    public T remove() throws Exception {
        if (list.isEmpty()) {
            throw new Exception("removing from empty list");
        }
        // remove the item from 0th index
        T temp = list.get(0);
        // take the last element and put it in the 0th index
        T last = list.remove(list.size() - 1);
        if (!list.isEmpty()) {
            list.set(0, last);
            downHeap(0);
        }
        return temp;
    }

    private void downHeap(int index) {
        // if its reaches to last element
        if (index == list.size() - 1) {
            return;
        }
        int min = index;
        int left = left(index);
        int right = right(index);

        if (left < list.size() && list.get(min).compareTo(list.get(left)) > 0) {
            min = left;
        }

        if (right < list.size() && list.get(min).compareTo(list.get(right)) > 0) {
            min = right;
        }

        if (min != index) {
            swap(min, index);
            upheap(min);
        }
    }

    public ArrayList<T> heapSort() throws Exception {
        ArrayList<T> data = new ArrayList<>();
        while (!list.isEmpty()) {
            data.add(this.remove());
        }

        return data;
    }
}
