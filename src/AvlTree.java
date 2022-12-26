public class AvlTree {
    Node rootNode;

    public AvlTree(int value) {
        this.rootNode = new Node(value);
    }


    public void insert(int value) {
        insertMain(rootNode, value);
    }

    //this will be recurssive method.
    public void insertMain(Node rootNode, int value) {
        Node indexNode = rootNode;
        //base condition;
        if (indexNode.leftNode == null && indexNode.value > value) {
            Node node = new Node(value);
            indexNode.leftNode = node;
            return;
        }
        if (indexNode.rightNode == null && indexNode.value < value) {
            Node node = new Node(value);
            indexNode.rightNode = node;
            return;
        }
        if (indexNode.value < value) {
            insertMain(indexNode.rightNode, value);
        } else {
            insertMain(indexNode.leftNode, value);
        }
    }


    public Node insertByTutor(Node rootNode, int value) {
        if (rootNode == null) {
            Node node = new Node(value);
            return node;
        }
        if (rootNode.value > value) {
            rootNode.leftNode = insertByTutor(rootNode.leftNode, value);
        } else rootNode.rightNode = insertByTutor(rootNode.rightNode, value);
        return rootNode;
    }


}
