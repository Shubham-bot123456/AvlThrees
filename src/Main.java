public class Main {
    public static void main(String[] args) {

        AvlTree tree =new AvlTree(7 );
        tree.insertByTutor(tree.rootNode,5);
        tree.insertByTutor(tree.rootNode,10);
        tree.insertByTutor(tree.rootNode,12);
        System.out.println(tree.rootNode.leftNode.value);
        System.out.println(tree.rootNode.rightNode.value);
        System.out.println(tree.rootNode.rightNode.rightNode.value);
    }
}