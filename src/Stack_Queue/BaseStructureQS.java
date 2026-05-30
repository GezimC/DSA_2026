package Stack_Queue;

public abstract class BaseStructureQS {
    public Element top;
    public int size;
    public int max_size = 100;

    public BaseStructureQS(int data)
    {
        this.top = new Element(data);
        this.size = 1;
    }

    public boolean isEmpty() {
        if (size == 0) return true;

        return false;
    }

    public boolean isFull() {
        if (this.size == max_size) return true;

        return false;
    }


    public void displayStructure() {
        int i = 0;

        Element tempElement = this.top;

        while (tempElement != null) {
            System.out.printf("Elementi %d: %d \n", i, tempElement.data);
            tempElement = tempElement.next;
            i++;
        }
    }
}
