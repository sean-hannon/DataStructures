import java.util.LinkedList;

public class Queue {
    private LinkedList list = new LinkedList();
    public void enqueue(Object data){
        list.add(data);
    }

    public Object dequeue(){
        return list.poll();
    }

    public boolean hasItem(){
        return !list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    public void addItems(Queue q){
        while (q.hasItem()){
            list.addLast(q.dequeue());
        }
    }
}
