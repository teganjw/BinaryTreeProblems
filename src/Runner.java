public class Runner {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        //6,4,3,7,8,1,2,9,5
        bt.add(6);
        bt.add(4);
        bt.add(3);
        bt.add(7);
        bt.add(8);
        bt.add(1);
        bt.add(2);
        bt.add(9);
        bt.add(5);



        System.out.println(bt.containsNode(6));
        bt.delete(6);
        System.out.println(bt.containsNode(6));
        bt.add(6);
        System.out.println(bt.containsNode(6));
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);


    }


}
