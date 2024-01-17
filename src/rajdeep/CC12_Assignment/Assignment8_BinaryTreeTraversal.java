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
            System.out.println("Enter the node in whose child you want to insert the node");
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
        if(currentNode.data==data || currentNode==null){
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


}
public class Assignment8_BinaryTreeTraversal {
    public static void main(String[] args) {
        Tree tree = new Tree();
        Node node = new Node(1);
        tree.createTree(node);
        Node node1 = new Node(2);
        tree.createTree(node1);
        Node node2 = new Node(3);
        tree.createTree(node2);
        Node node3 = new Node(4);
        tree.createTree(node3);

    }
}
