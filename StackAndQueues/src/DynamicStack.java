public class DynamicStack extends CustomStack {
    public DynamicStack() {
        super(); // constructor in the parent class without argument
    }

    public DynamicStack(int size) {
        super(size); // this will call parent class argumented constructor
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            // copy all the item from data to temp array
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }
}
