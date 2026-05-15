package code.practice;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class ReverserLinkedList {
    public static Node reverse(Node head){
        Node prev=null;
        Node current=head;

        while (current!=null){
            Node next= current.next;
            current.next=prev;

            prev=current;
            current=next;
        }
        return prev;
    }
    public static Node build(int... vals){
        Node dummy = new Node(0), tail = dummy;
        for(int v : vals){
            tail.next = new Node(v);
            tail = tail.next;
        }
       return dummy.next;
    }

    public static void print(Node head){
        for(Node n= head; n!=null; n=n.next)
            System.out.print(n.data+ (n.next!=null ? "->": "\n"));
    }
    public static void main(String[] args) {
        Node list = build(1,2,3,4,5);
        System.out.print("Original:   ");
        print(list);

        list = reverse(list);
        System.out.print("Iterative reversal:  ");
        print(list);
    }
}
