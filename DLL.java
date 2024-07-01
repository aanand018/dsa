package BinaryTreeImplementations;

import java.util.Queue;

public class DLL {

    class Node {
        int data;
        Node pre;
        Node next;

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next, Node pre) {
            this.data = data;
            this.next = next;
            this.pre = pre;
        }
    }

Node head;
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next=head;
        newNode.pre=null;
        if(head!=null){
           head.pre=newNode;
        }
        head=newNode;
    }


    public void addLast(int data){
        System.out.println("last added data " + data);

        Node newNode=new Node(data);
        newNode.next=null;

        if(head==null){
            head=newNode;
            head.pre=null;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }

        last.next=newNode;
        newNode.pre=last;
    }

    public void display(){
        Node node=head;

        while(node!=null){
            System.out.print(node.data+" -> ");
            node=node.next;
        }
        System.out.println("null");

        }


    public void displayReverse(){
        System.out.println("---------------------------reverse---------------------------");
        Node last=head;

        while(last.next!=null){
            last=last.next;
        }

        while(last!=null){
            System.out.print(last.data+" -> ");
            last=last.pre;
        }
        System.out.println(" null ");

    }

    public static void main(String[] args) {
        DLL dll=new DLL();
        dll.addFirst(10);
        dll.addFirst(20);
        dll.addFirst(30);
        dll.addFirst(40);
        dll.addFirst(50);
        dll.addFirst(60);
        dll.addFirst(70);
        dll.addFirst(80);
        dll.addFirst(90);
        dll.addFirst(100);
        dll.display();

        dll.displayReverse();

        dll.addLast(110);
        dll.display();

        dll.displayReverse();
    }



}
