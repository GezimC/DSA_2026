package Stack_Queue;

public class Queue extends BaseStructureQS {

    public Element tail;

    public Queue(int data) {
        super(data);
        this.tail = this.top;
    }

    public void enqueue(int data) {
        if (this.size == this.max_size) {
            System.out.println("Queue is full");
        }
        Element newelement = new Element(data); //created new element to be inserted
        this.tail.next = newelement;
        this.tail = newelement;
        this.size++;
    }

    public int dequeue() {
        if (this.size == 0) {
            System.out.println("Queue is empty!");
            return -999999;
        }

        int headData = this.top.data;
        this.top = this.top.next;
        this.size--;

        return headData;
    }

    @Override
    public String toString() {
        return "Size of queue is: " + this.size;
    }
}
