package rajdeep;

import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class Singly_Linked_List{
    Node head=null;
    Node tail=null;

    public void insertAtBeginning(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
    }
    public void insertAtEnd(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void insertAtPosition(int data,int pos){
        Node newNode=new Node(data);
        if(pos==1){
            insertAtBeginning(data);
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
    }
    public void deleteAtBeginning(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            head=head.next;
        }
    }
    public void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp=head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
        }
    }
    public void deleteAtPosition(int pos){
        if(pos==1){
            deleteAtBeginning();
        }
        else{
            Node temp=head;
            for(int i=1;i<pos-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public void deleteByValue(int data){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp=head;
            while(temp.next.data!=data){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }
    }
    public void search(int data){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node temp=head;
            int pos=1;
            while(temp.data!=data){
                temp=temp.next;
                pos++;
            }
            System.out.println("Element found at position "+pos);
        }
    }
    public void reverse(){
        if (head == null) {
            System.out.println("List is empty");
        }
        else{
            Node prev=null;
            Node curr=head;
            Node next=null;
            while(curr!=null){
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
            while(prev.next!=null){
                prev=prev.next;
            }
            tail=prev;
        }
    }
    public void display(){
        Node temp=head;
        while(temp!=tail.next){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}
public class LinkedList1_Singly_Linked_List {
    public static void main(String[] args) {
        Singly_Linked_List sll=new Singly_Linked_List();
        Scanner sc=new Scanner(System.in);
        char ch;
        do {
            System.out.println("Enter 1 to insert at beginning");
            System.out.println("Enter 2 to insert at end");
            System.out.println("Enter 3 to insert at position");
            System.out.println("Enter 4 to delete at beginning");
            System.out.println("Enter 5 to delete at end");
            System.out.println("Enter 6 to delete at position");
            System.out.println("Enter 7 to delete by value");
            System.out.println("Enter 8 to search");
            System.out.println("Enter 9 to reverse");
            System.out.println("Enter 10 to display");
            System.out.println("Enter 11 to exit");
            int choice=sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter the element to be inserted:");
                    int data=sc.nextInt();
                    sll.insertAtBeginning(data);
                    break;
                case 2:
                    System.out.println("Enter the element to be inserted:");
                    int data1=sc.nextInt();
                    sll.insertAtEnd(data1);
                    break;
                case 3:
                    System.out.println("Enter the element to be inserted:");
                    int data2=sc.nextInt();
                    System.out.println("Enter the position:");
                    int pos=sc.nextInt();
                    sll.insertAtPosition(data2,pos);
                    break;
                case 4:
                    sll.deleteAtBeginning();
                    break;
                case 5:
                    sll.deleteAtEnd();
                    break;
                case 6:
                    System.out.println("Enter the position:");
                    int pos1=sc.nextInt();
                    sll.deleteAtPosition(pos1);
                    break;
                case 7:
                    System.out.println("Enter the element to be deleted:");
                    int data3=sc.nextInt();
                    sll.deleteByValue(data3);
                    break;
                case 8:
                    System.out.println("Enter the element to be searched:");
                    int data4=sc.nextInt();
                    sll.search(data4);
                    break;
                case 9:
                    sll.reverse();
                    break;
                case 10:
                    sll.display();
                    break;
                case 11:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice");
            }
            System.out.println("\nDo you want to continue?(y/n)");
            ch=sc.next().charAt(0);
        }while (ch=='y' || ch=='Y');

    }
}
