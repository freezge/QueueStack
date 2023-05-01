public class MyLinkedListQueue {
    MyLinkedListQueue(){}
    private static MyLinkedList queue = new MyLinkedList();
    public void enqueue(Object o){
        queue.add(o);
    }
    public Object dequeue(){
        Object buff = queue.get(0);
        queue.remove(0);
        return buff;
    }
    public Object peek(){
        return queue.get(0);
    }
    public boolean isEmpty(){
        return queue.size() == 0;
    }
    public int size(){
        return queue.size();
    }

}
