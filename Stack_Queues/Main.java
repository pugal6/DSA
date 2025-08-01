import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
//        CustomStack customStack = new DynamicStack(3);
//        System.out.println( customStack.push(5));
//        System.out.println( customStack.push(6));
//        System.out.println( customStack.push(43));
//        System.out.println( customStack.push(32));
//        System.out.println( customStack.push(33));
//
//
//        System.out.println( customStack.pop());
//        System.out.println( customStack.pop());
//        System.out.println(customStack.peek());

//        CustomQueue queue = new CustomQueue();
//        System.out.println(queue.insert(6));
//        System.out.println(queue.insert(8));
//        System.out.println(queue.insert(90));
//        System.out.println(queue.insert(87));
//
//        queue.display();
//
//        System.out.println(queue.remove());
//        System.out.println(queue.front());

        CircularQueue circularQueue = new CircularQueue();
        circularQueue.insert(34);
        circularQueue.insert(346);
        circularQueue.insert(75);
        circularQueue.insert(82);
        circularQueue.display();
        System.out.println(circularQueue.remove());
        circularQueue.display();
    }
}

