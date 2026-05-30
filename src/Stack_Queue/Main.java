package Stack_Queue;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

//        stack.displayStructure();


        Queue queue = new Queue(50);

        queue.enqueue(10);
        queue.enqueue(20);

       // queue.displayStructure();
        queue.dequeue();
       // queue.displayStructure();


        System.out.println(queue);
        System.out.println(stack);

    }
}