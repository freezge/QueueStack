public class MyLinkedListQueue {
    MyLinkedListQueue(){}
    private static MyLinkedList queue = new MyLinkedList();
    public void enqueue(Object o){
        queue.add(o);
    }
    public Object dequeue(){
        return null;
    }
    public Object peek(){
        return null;
    }
    public boolean isEmpty(){
        return false;
    }
    public int size(){
        return queue.size();
    }

}
