public class MyArrayListQueue {
    MyArrayListQueue(){}
    private MyArrayList queue = new MyArrayList();
    public void enqueue(Object o){
        queue.add(o);
    }
    public Object dequeue(Object o){
        return null;
    }
    public Object peek(){
        return queue.get(0);
    }
    public boolean isEmpty(){
        return true;
    }
    public int size(){
        return queue.size();
    }
}
