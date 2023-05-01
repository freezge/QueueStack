public class MyArrayListStack {
    MyArrayListStack(){}//constructor for MyArrayListStack
    private MyArrayList stack = new MyArrayList();//create an instance of ArrayList
    public void push(Object o){//adds new element to the end of stack
        stack.add(o);
    }
    public Object pop(){//removes the top element of the stack
        Object buff = stack.get(stack.size() - 1);//to save element
        stack.remove(stack.size() - 1);//removing top element
        return buff;//returns removed element
    }
    public Object peek(){//to get top elem of stack
        return stack.get(stack.size() - 1);//returns top elem of stack
    }
    public boolean isEmpty(){//to check if stack is empty
        return stack.size() == 0;//if size = 0 stack is empty
    }
    public int size(){//method to get size of stack
        return stack.size();//returns size of stack
    }
}
