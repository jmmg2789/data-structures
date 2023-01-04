import java.util.Objects;

public class BinarySearchTree {

    Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Integer value) {
        Node newNode = new Node(value);

        // establish root node
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node currentNode = this.root;
            while (true) {
                if (value < currentNode.value) {
                    // left
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    }
                    currentNode = currentNode.left;
                } else {
                    // right
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public Integer lookup(Integer value) {
        if (Objects.equals(root.value, value)) {
            return value;
        }

        return null;
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(9);
        tree.insert(4);
        tree.insert(6);
        tree.insert(20);
        tree.insert(170);
        tree.insert(15);
        tree.insert(1);

        System.out.println(tree.root.value); // should be 9
        System.out.println(tree.root.left.value); // should be 4
        System.out.println(tree.root.left.left.value); // should be 1
        System.out.println(tree.root.left.right.value); // should be 6
        System.out.println(tree.root.left.right.right); // should be null
        System.out.println(tree.root.left.left.left); // should be null
        System.out.println(tree.root.right.value); // should be 20
        System.out.println(tree.root.right.right.value); // should be 170
        System.out.println(tree.root.right.left.value); // should be 15
        System.out.println(tree.root.right.left.right); // should be null
        System.out.println(tree.root.right.right.right); // should be null
    }

}
