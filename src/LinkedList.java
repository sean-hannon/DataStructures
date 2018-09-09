public class LinkedList {
    public Node head;
    private int numNodes;
    class Node {
        private int data;
        private Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }

        public int getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

    public LinkedList() {
        head = null;
        numNodes = 0;
    }

    public void push(int newData){
        Node newNode = new Node(newData);

        newNode.next = head;

        head = newNode;
    }

    public void insertAfter(Node prevNode, int newData) {
        if (prevNode == null) {
            System.out.println("The given previous node cannot be null");
            return;
        }

        Node newNode = new Node(newData);
        newNode.next = prevNode.next;
        prevNode.next = newNode;
    }

    public void append(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        return;
    }

    public void printList() {
        Node node = head;
        while (node != null) {
            System.out.print(node.getData() + " ");
            node = node.next;
        }
    }
}
