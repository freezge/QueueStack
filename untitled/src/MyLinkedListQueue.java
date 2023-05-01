public class MyLinkedListQueue {
    MyLinkedListQueue(){}//constructor for MyLinkedListQueue
    private MyLinkedList queue = new MyLinkedList();//create an instance of LinkedList
    public void enqueue(Object o){//adds new element to the end of queue
        queue.add(o);
    }
    public Object dequeue(){//removes the front element of the queue
        Object buff = queue.get(0);//to save element
        queue.remove(0);//removing front element
        return buff;//returns removed element
    }
    public Object peek(){//to get front elem of q
        return queue.get(0);//returns front elem of q
    }
    public boolean isEmpty(){//to check if q is empty
        return queue.size() == 0;//if size = 0 q is empty
    }
    public int size(){//method to get size of q
        return queue.size();//returns size of q
    }

}
