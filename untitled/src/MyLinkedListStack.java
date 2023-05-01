public class MyLinkedListStack {
    MyLinkedListStack(){}
    private MyLinkedList stack = new MyLinkedList();
    public void push(Object o){
        stack.add(o);
    }
    public Object pop(){
        Object buff = stack.get(stack.size() - 1);
        stack.remove(stack.size() - 1);
        return buff;
    }
    public Object peek(){
        return stack.get(stack.size() - 1);
    }
    public boolean isEmpty(){
        return true;
    }
    public int size(){
        return 0;
    }
}
