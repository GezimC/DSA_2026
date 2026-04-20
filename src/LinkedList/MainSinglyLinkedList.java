package LinkedList;

public class MainSinglyLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(10);

        SinglyLinkedList list = new SinglyLinkedList(node1);

        Node node2 = new Node(20);
        Node node3 = new Node(30);

        list.addLast(node2);
        list.addLast(node3);

//        list.displayList();

        System.out.println(list.isEmpty());

        Node node4 = new Node(100);

        list.addFirst(node4);

        list.displayList();

        list.removeFirst();

        System.out.println("After removing the first");
        list.displayList();

        list.removeLast();

        System.out.println("After removing the last");
        list.displayList();

//        list.findLast();


        list.findPrev(node3);
    }
}
