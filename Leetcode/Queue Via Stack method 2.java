     METHOD 2
/*  enQueue(q,  x)
  1) Push x to stack1 (assuming size of stacks is unlimited).
Here time complexity will be O(1)

deQueue(q)
  1) If both stacks are empty then error.
  2) If stack2 is empty
       While stack1 is not empty, push everything from stack1 to stack2.
  3) Pop the element from stack2 and return it.
Here time complexity will be O(n)   */

import java.util.Stack;

public class QueueViaStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueViaStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {
        QueueViaStack queue = new QueueViaStack();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is empty: " + queue.isEmpty());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is empty: " + queue.isEmpty());
    }
}
