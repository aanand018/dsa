public class LL {
    public class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    //add first
    public void addFirst(String data){


        Node newNode=new Node(data);
        if (head != null) {
            newNode.next = head;
        }
        head=newNode;

    }


    //add Last
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;

        }
        currentNode.next=newNode;
    }


    //delete First
    public void deleteFirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }

            head = head.next;


    }

    //delete Last
    public void deleteLast(){
      if(head==null){
          System.out.println("list is empty");
          return;
      }
      if(head.next==null){
          head=null;
      }
      Node secondeLastNode=head;
      Node lastNode=head.next;

      while(lastNode.next!=null){
          secondeLastNode=lastNode;
          lastNode=lastNode.next;
      }
      secondeLastNode.next=null;


    }

    public void printList(){
        System.out.println();
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode=head;
        while(currentNode!=null){
            System.out.print(currentNode.data +" -> ");
            currentNode=currentNode.next;
        }
        System.out.println("null");


    }






    public static void main(String[] args) {
        LL list=new LL();

        System.out.println("--------------- add First -----------------------");
        list.addFirst("anand");
        list.addFirst("i am ");
        list.printList();
        System.out.println();

        System.out.println("--------------- add last -----------------------");
        list.addLast("aa");
        list.addLast("bb");
        list.printList();
        System.out.println();

        System.out.println("--------------- delete First -----------------------");
        list.deleteFirst();
        list.printList();
        System.out.println();

        System.out.println("--------------- delete last -----------------------");
        list.deleteLast();
        list.printList();
        System.out.println();


    }
}
