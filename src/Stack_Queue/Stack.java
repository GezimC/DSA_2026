package Stack_Queue;

public class Stack extends BaseStructureQS {


    public Stack(int data) {
        super(data);
    }


    public void push(int data) {
        if (this.size == this.max_size) {
            System.out.println("Stack is full");
        }

        Element newElement = new Element(data);
        newElement.next = this.top;

        this.top = newElement;
        this.size++;
    }

    public int pop() {
        if (size == 0) {
            System.out.println("Nothing to pop, size is 0");
            return -999999;
        }

        int actualTop = this.top.data;

        this.top = this.top.next;
        this.size--;
        return actualTop;
    }

    @Override
    public String toString() {
        return "Size of stack is: "+ this.size;
    }
}
