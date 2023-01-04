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
            // already have a root node
            Node currentNode = this.root;
            // need to continue looping until no more nodes
            while (true) {
                if (value < currentNode.value) {
                    // left
                    // adds node if there is no node to the left
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    }
                    // else will update current node to be the next and will continue looping
                    currentNode = currentNode.left;
                } else {
                    // right
                    // adds node if no node to the right
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    }
                    // else will update current node to the next and will continue looping
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public Node lookup(Integer value) {
        if (this.root == null) {
            return null;
        }

        Node currentNode = this.root;
        // while we still have nodes to check
        while(currentNode != null) {
            // goes left
            if (value < currentNode.value) {
                currentNode = currentNode.left;
            }
            // goes right
            else if (value > currentNode.value) {
                currentNode = currentNode.right;
            }
            // get a match
            else if (currentNode.value.equals(value)) {
                return currentNode;
            }
        }
        // no matches
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

//        System.out.println(tree.root.value); // should be 9
//        System.out.println(tree.root.left.value); // should be 4
//        System.out.println(tree.root.left.left.value); // should be 1
//        System.out.println(tree.root.left.right.value); // should be 6
//        System.out.println(tree.root.left.right.right); // should be null
//        System.out.println(tree.root.left.left.left); // should be null
//        System.out.println(tree.root.right.value); // should be 20
//        System.out.println(tree.root.right.right.value); // should be 170
//        System.out.println(tree.root.right.left.value); // should be 15
//        System.out.println(tree.root.right.left.right); // should be null
//        System.out.println(tree.root.right.right.right); // should be null

        System.out.println(tree.lookup(1));
        System.out.println(tree.lookup(170));
        System.out.println(tree.lookup(90));
    }

}
