package edu.realemj.Exercises17;

public class BinTree<T extends Comparable<T>> {
    private BinNode<T> root;

    public void insert(T data) {
        BinNode<T> node = new BinNode<>(data);
        if(root == null) {
            root = node;
        }
        else {
            insertDown(node, root);
        }
    }

    private void insertDown(BinNode<T> newNode,
                            BinNode<T> current) {
        if(newNode.compareTo(current) < 0) {
            // LEFT
            if(current.getLeft() == null) {
                current.setLeft(newNode);
            }
            else {
                insertDown(newNode, current.getLeft());
            }
        }
        else {
            // RIGHT
            if(current.getRight() == null) {
                current.setRight(newNode);
            }
            else {
                insertDown(newNode, current.getRight());
            }
        }
    }

    public String toString() {
        GenericQueue<BinNode<T>> q = new GenericQueue<>();
        q.enqueue(root);
        String output = "";
        while(!q.isEmpty()) {
            BinNode<T> current = q.dequeue();
            output += current.toString();

            if(current.getLeft() != null) {
                q.enqueue(current.getLeft());
            }

            if(current.getRight() != null) {
                q.enqueue(current.getRight());
            }
        }
        return output;
    }

    public static void main(String [] args) {
        BinTree<Integer> tree = new BinTree<>();
        tree.insert(5);
        tree.insert(2);
        tree.insert(8);
        tree.insert(10);
        tree.insert(3);
        tree.insert(1);
        tree.insert(7);
        System.out.println(tree);

        BinTree<String> dict = new BinTree<>();
        dict.insert("dog");
        dict.insert("person");
        dict.insert("train");
        dict.insert("rain");
        dict.insert("car");
        dict.insert("plane");
        dict.insert("food");
        System.out.println(dict);
    }



}
