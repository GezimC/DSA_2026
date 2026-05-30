import java.util.Stack;

public class BST {

    public Node root;

    public BST() {
        root = null;
    }

    public void insert(int key) {
        Node newNode = new Node(key);
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (true) {
            parent = current;
            if (key > current.key) {
                current = current.right;
                if (current == null) {
                    parent.right = new Node(key);
                    return;
                }
            } else {
                current = current.left;
                if (current == null) {
                    parent.left = new Node(key);
                    return;
                }
            }
        }
    }


    public void inorder() {
        Node current = root;
        Stack<Node> stack = new Stack<>();

        if (root == null) {
            System.out.println("BST is empty");
        }
//          32
//       12    64
//      8  15    70
//        14
        // stack: 8  12  32
        while (!stack.isEmpty() || current != null) {

            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            current = stack.pop();
            System.out.print(current.key + " ");
            current = current.right;
        }

    }

    // insert(int key), inserts a new key in BST     --done
    // inorder(), display BST elements inorder       -- done
    // getMinimumKey(), find the minimum value on tree   -- dsh
    // getMaximumKey()                                  --dsh
    // contains(int key)                                -- dsh
    // deleteNode()                                      --bonus pike
    //preorder()                                         --dsh
    //postorder()                                         --dsh
}
