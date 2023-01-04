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

    public boolean remove(Integer value) {
        if (this.root == null) {
            return false;
        }

        Node currentNode = this.root;
        Node parentNode = null;

        while (currentNode != null) {
            if (value < currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                parentNode = currentNode;
                currentNode = currentNode.right;
            } else if (currentNode.value.equals(value)) {
                // we find a match

                // if there is no right child
                if (currentNode.right == null) {
                    if (parentNode == null) {
                        this.root = currentNode.left;
                    } else {
                        // if the parent > current value, make the current left child a child of the parent
                        if (currentNode.value < parentNode.value) {
                            parentNode.left = currentNode.left;
                        }
                        // if parent < current value, make left child a right child of parent
                        else if (currentNode.value > parentNode.value) {
                            parentNode.right = currentNode.left;
                        }
                    }
                }
                // checks if the right child that doesn't have a left child
                else if (currentNode.right.left == null) {
                    if (parentNode == null) {
                        this.root = currentNode.left;
                    } else {
                        currentNode.right.left = currentNode.left;

                        // if parent > current node, make the right child of the left the parent
                        if (currentNode.value < parentNode.value) {
                            parentNode.left = currentNode.right;
                        }
                        // if parent < current node, make right child a right child of the parent
                        else if (currentNode.value > parentNode.value) {
                            parentNode.right = currentNode.right;
                        }
                    }
                }
                // if the right child has a left child
                else {
                    // find right child's left most child
                    Node leftMost = currentNode.left.right;
                    Node leftMostParent = currentNode.right;
                    while(leftMost.left != null) {
                        leftMostParent = leftMost;
                        leftMost = leftMost.left;
                    }

                    // parent's left subtree is now leftmost's right subtree
                    leftMostParent.left = leftMost.right;
                    leftMost.left = currentNode.left;
                    leftMost.right = currentNode.right;

                    if (parentNode == null) {
                        this.root = leftMost;
                    } else {
                        if (currentNode.value < parentNode.value) {
                            parentNode.left = leftMost;
                        } else if (currentNode.value > parentNode.value) {
                            parentNode.right = leftMost;
                        }
                    }
                }
                return true;
            }
        }

        return false;
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
