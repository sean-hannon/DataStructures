public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.append(6);
        linkedList.push(7);
        linkedList.push(1);
        linkedList.append(4);
        linkedList.insertAfter(linkedList.head.getNext(), 8);
        System.out.println("\nCreated Linked list is: ");
        linkedList.printList();
        System.out.println();

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(50);
        binarySearchTree.insert(100);
        binarySearchTree.insert(40);
        binarySearchTree.insert(20);
        binarySearchTree.insert(60);
        binarySearchTree.insert(80);
        binarySearchTree.insert(200);
        binarySearchTree.insert(50);

        binarySearchTree.inOrder();

        System.out.println();
        Stack stack = new Stack(10);
        stack.push(1);
        stack.push(4);
        stack.push(3);

        System.out.println("Pop in the middle " + stack.pop());

        stack.push(60);
        stack.push(11);

        while (!stack.isEmpty()){
            long value = stack.pop();
            System.out.println(value);
        }

        System.out.println();
        Queue queue = new Queue();
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(12);

        while (queue.hasItem()) {
            System.out.println(queue.dequeue().toString());
        }
    }
}
