package BinaryTreeImplementations.trees;

public class BinarySearchTree {
    Node root;

    BinarySearchTree(){
        root = null;
    }
    public void insert(int data){
        //Core Rule (Remember this for trees + recursion)
        //👉 Whenever structure changes → return and reassign
        root = insertRec(root,data);
    }
    public Node insertRec(Node root,int data){
        if(root == null){
            //root = new Node(data); return root;
            return new Node(data);
        }
        if(data<root.data){
            root.left = insertRec(root.left,data);
        }
        if (data> root.data){
            root.right = insertRec(root.right,data);
        }
        return root;
    }
    //Deletion has 3 cases — no children, one child, or two children:
    public void delete(int data){
        root = deleteRec(root,data);
    }

    private Node deleteRec(Node root, int data) {

        if(root==null) return null;

        if(data < root.data){
            root.left = deleteRec(root.left,data);
        }
        else if (data > root.data) {
            root.right = deleteRec(root.right, data);
        }
        else{
            // Case 1: No child (leaf)
            if (root.left == null && root.right == null)
                return null;
            // Case 2: One Child
            if(root.left == null) return root.right;
            if(root.right == null) return root.left;
            //Case 3: Two Child
            int minVal = findMin(root.right);
            root.data = minVal;
            root.right = deleteRec(root.right,minVal);
        }

        return root;
    }
    private int findMin(Node root){
        while (root.left != null) root = root.left;
        return root.data;
    }

    public boolean search(int data) {
        return searchRec(root, data);
    }

    private boolean searchRec(Node root, int data) {
        if (root == null) return false;
        if (root.data == data) return true;

        if (data < root.data)
            return searchRec(root.left, data);
        else
            return searchRec(root.right, data);
    }

    // IN-ORDER → gives sorted output: 20, 30, 40, 50, 60, 70, 80
    void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(2);
        bst.insert(5);
        bst.insert(3);
        bst.insert(1);
        bst.insert(6);
        bst.insert(7);

        System.out.print("In-order:   ");
        System.out.println("root "+bst.root.data);
       // bst.inOrder(bst.root);

        System.out.println("Delete: ");
        bst.delete(3);
        bst.inOrder(bst.root);
    }
}
