
public  class node {
    int data;
    node next;
    node (int value) {
        data = value;
        next = null;
    }
    static node head;

    static void printList() {
        node p = head;
        System.out.print("\n[");

        //start from the beginning
        while(p != null) {
            System.out.print(" " + p.data + " ");
            p = p.next;
        }
        System.out.print("]");
    }


    static void insertAtBegin(int data) {

        node lk = new node(data);;
        lk.next = head;
        head = lk;
    }
    static void insertAfterNode(node list, int data) {
        node lk = new node(data);
        lk.next = list.next;
        list.next = lk;
    }
    static void deleteAtEnd() {
        node linkedlist = head;
        while (linkedlist.next.next != null)
            linkedlist = linkedlist.next;
        linkedlist.next = null;
    }

    static int searchList(int key) {
        node temp = head;
        while(temp != null) {
            if (temp.data == key) {
                return 1;
            }
            temp=temp.next;
        }
        return 0;
    }
        public static void main (String args[]){
            int k = 0;
            insertAtBegin(12);
            insertAtBegin(22);
            insertAtBegin(30);
            insertAtBegin(44);
            insertAfterNode(head.next, 50);
            insertAfterNode(head.next.next, 33);
            System.out.println("Linked List: ");

            printList();

            deleteAtEnd();
            System.out.println("\nLinked List after deletion: ");


            printList();

            k = searchList(44);
            if (k == 1)
                System.out.println("\nElement is found");
            else
                System.out.println("\nElement is not present in the list");
        }
}