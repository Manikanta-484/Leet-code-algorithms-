       METHOD 1
/*   enQueue(q, x): 

While stack1 is not empty, push everything from stack1 to stack2.
Push x to stack1 (assuming size of stacks is unlimited).
Push everything back to stack1.
Here time complexity will be O(n)

deQueue(q): 

If stack1 is empty then error
Pop an item from stack1 and return it
Here time complexity will be O(1)    */

import java.util.Stack;
public class Main {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        static void enQueue(int x) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(x);
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        int deQueue() {
            if (s1.empty()) {
                return -1;
            }
            int x = s1.peek();
            s1.pop();
            return x;
        }

        ;

        public static void main(String[] args) {
            Queue q=new Queue();
            q.enQueue(1);
            q.enQueue(2);
            q.enQueue(3);

            System.out.println(q.deQueue());
            System.out.println(q.deQueue());
            System.out.println(q.deQueue());

        }
    }
}