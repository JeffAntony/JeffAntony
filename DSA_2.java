
DataStructures - LinkedList 

  public class Main {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public static class LinkedList {
        Node head = null;
        Node tail = null;

        // inset at end
        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        void insertAtHead(int val) {
            Node temp = new Node(val);

            if (head == null) {//head=null and tail =null
                head = temp;//head=34 reassign null
                tail = temp;
            } else {
                temp.next = head;//34 67 
                head = temp;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.insertAtEnd(67);
        ll.insertAtEnd(89);
        ll.insertAtEnd(12);
        ll.insertAtEnd(97);
        ll.display();

        System.out.println();
        System.out.println("-------------------------");
        ll.insertAtHead(34);
        ll.display();
    }
}
