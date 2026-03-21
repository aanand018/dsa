package BinaryTreeImplementations.trees;

public class BinarySearchTree {
    Node root;

    BinarySearchTree(){
        root = null;
    }
    public void insert(int data){
        root = insertRec(root,data);
    }
    public Node insertRec(Node root,int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(data<root.data){
            root.left = insertRec(root.left,data);
        }
        if (data> root.data){
            root.right = insertRec(root.right,data);
        }
        return root;
    }
    // IN-ORDER → gives sorted output: 20, 30, 40, 50, 60, 70, 80
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
            System.out.print("right : ");
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(4);
        bst.insert(2);
        bst.insert(1);
        bst.insert(6);
        bst.insert(7);

        System.out.print("In-order:   ");
        bst.inOrder(bst.root);
    }
}
