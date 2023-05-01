# ADS Assignment 3
### Assignment 3 | Queue and Stack
### Stack Implementation
```
.Create a new class named MyLinkedListStack for the MyLinkedList 
implementation or MyArrayListStack for the MyArrayList implementation.
.Import the necessary classes: java.util.EmptyStackException for the 
stack exceptions, and MyLinkedList or MyArrayList from the previous tasks.
.Declare an instance variable of type MyLinkedList or MyArrayList inside 
the class.
.Create a constructor for the class and initialize the instance variable.
.Implement the push method that adds an element to the top of the stack 
using the addFirst method for MyLinkedList or add method for MyArrayList.
.Implement the pop method that removes and returns the top element of the 
stack using the removeFirst method for MyLinkedList or remove method for 
MyArrayList.
.Implement the peek method that returns the top element of the stack 
without removing it using the getFirst method for MyLinkedList or get 
method for MyArrayList.
.Implement the isEmpty method that returns true if the stack is empty or 
false if it is not using the isEmpty method for MyLinkedList or MyArrayList.
.Implement the size method that returns the number of elements in the stack 
using the size method for MyLinkedList or MyArrayList.
```
### Code for MyArrayListStack
```
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
```
### Code for MyLinkedListStack
```
public class MyLinkedListStack {
    MyLinkedListStack(){}//constructor for MyLinkedListStack
    private MyLinkedList stack = new MyLinkedList();//create an instance of LinkedList
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
```
### Queue Implementation
```
.Create a new class named MyLinkedListQueue for the MyLinkedList 
implementation or MyArrayListQueue for the MyArrayList implementation.
.Import the necessary classes: java.util.NoSuchElementException 
for the queue exceptions, and MyLinkedList or MyArrayList from 
the previous tasks.
.Declare an instance variable of type MyLinkedList or MyArrayList 
inside the class.
.Create a constructor for the class and initialize the instance variable.
.Implement the enqueue method that adds an element to the back of 
the queue using the addLast method for MyLinkedList or add method 
for MyArrayList.
.Implement the dequeue method that removes and returns the front element 
of the queue using the removeFirst method for MyLinkedList or remove 
method for MyArrayList.
.Implement the peek method that returns the front element of the queue 
without removing it using the getFirst method for MyLinkedList or get 
method for MyArrayList.
.Implement the isEmpty method that returns true if the queue is empty or 
false if it is not using the isEmpty method for MyLinkedList or MyArrayList.
.Implement the size method that returns the number of elements in the 
queue using the size method for MyLinkedList or MyArrayList.
```
### Code for MyArrayListQueue
```
public class MyArrayListQueue {
    MyArrayListQueue(){}//constructor for MyArrayListQueue
    private MyArrayList queue = new MyArrayList();//create an instance of ArrayList
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
```
### Code for MyLinkedListQueue
```
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
```
