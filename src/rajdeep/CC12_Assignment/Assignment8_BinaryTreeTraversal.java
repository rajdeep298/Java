package rajdeep.CC12_Assignment;

import java.util.Scanner;

class Node{
    int data;
    Node left,right;
    Node(){
        data=-1;
        left=null;
        right=null;
    }
    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
}
class Tree {
    Node root=null;
    Node temp = root;
    Node createTree(Node node){
        if(root==null){
            root=node;
        }
        else{
            System.out.println("Enter the node in whose child you want to insert "+node.data+":");
            Scanner sc=new Scanner(System.in);
            Node parentNode = search(root,sc.nextInt());
            if(parentNode==null){
                System.out.println("Parent node not found");
            }
            else{
                System.out.println("Enter the position where you want to insert the node");
                String position = sc.next();
                if(position.equals("left")){
                    parentNode.left=node;
                }
                else if(position.equals("right")){
                    parentNode.right=node;
                }
                else{
                    System.out.println("Invalid position");
                }
            }
        }
        return root;
    }
    private Node search(Node currentNode, int data) {
        if(currentNode == null || currentNode.data == data){
            return currentNode;
        }
        else{
            Node leftNode = search(currentNode.left,data);
            Node rightNode = search(currentNode.right,data);
            if(leftNode!=null){
                return leftNode;
            }
            else if(rightNode!=null){
                return rightNode;
            }
            else{
                return null;
            }
        }
    }
    void preOrder(Node node){
        if(node!=null){
            System.out.print(node.data+" ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    void inOrder(Node node){
        if(node!=null){
            inOrder(node.left);
            System.out.print(node.data+" ");
            inOrder(node.right);
        }
    }

    void postOrder(Node node){
        if(node!=null){
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(node.data+" ");
        }
    }

}
public class Assignment8_BinaryTreeTraversal {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node root = new Node(1);
        tree.createTree(root);
        Node node1 = new Node(2);
        tree.createTree(node1);
        Node node2 = new Node(3);
        tree.createTree(node2);
        Node node3 = new Node(4);
        tree.createTree(node3);
        Node node4 = new Node(5);
        tree.createTree(node4);
        Node node5 = new Node(6);
        tree.createTree(node5);
        Node node6 = new Node(7);
        tree.createTree(node6);

        System.out.println("Preorder traversal of binary tree is ");
        tree.preOrder(root);
        System.out.println("\nInorder traversal of binary tree is ");
        tree.inOrder(root);
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postOrder(root);

    }
}
