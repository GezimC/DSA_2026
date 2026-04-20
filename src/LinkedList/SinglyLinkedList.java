package LinkedList;

public class SinglyLinkedList {
    public Node first;
    public int size;

    public SinglyLinkedList(Node first) {
        this.first = first;
        this.size = 1;
    }

    public void addLast(Node newNode)
    {
        Node currentNode = this.first;

        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;

        this.size ++;
    }

    public void displayList()
    {
        Node currentNode = this.first;

        while(currentNode != null)
        {
            System.out.println(currentNode.data);

            currentNode = currentNode.next;
        }

    }

    public boolean isEmpty()
    {
        if (this.size == 0) return true;

        return false;
    }


    public void addFirst(Node newNode)
    {
        newNode.next = this.first;
        this.first = newNode;
        this.size ++;
    }

    public void removeFirst()
    {
        this.first = this.first.next;
        this.size--;
    }

    public void removeLast()
    {
      Node currentNode = this.first;

      while(currentNode.next.next != null)
      {
         currentNode = currentNode.next;

      }
      currentNode.next = null;
      this.size--;
    }

    public void findFirst()
    {
        System.out.println(this.first.data);
    }


//    public Node findFirst()
//    {
//        return this.first;
//    }

    public void findLast()
    {
        Node currentNode = this.first;

        while(currentNode.next != null)
        {
            currentNode = currentNode.next;
        }

        System.out.println(currentNode.data);
    }

    public void findPrev(Node node)
    {
        Node currentNode = this.first;
        while(currentNode.next != null)
        {
            if(currentNode.next == node) System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }

    }

    // addLast
    // displaylist
    // isEmpty
    // addfirst
    // remove first
    // remove last
    // find first
    // find last
    // find prev
    //addAfterIndex(int index, int data)         -- add new node after specific index
    //removeByIndex(int index)                   -- removes node at a specific index
    //findByIndex

}
