/*How would you design a stack which, in addition to push and pop,
 has a function min which returns the minimum element?
 Push, pop and min should all operate in O(1)*/

public class StackMin {
    private Node top;
    private Node minTop; // Stack to keep track of the minimum element

    public StackMin() {
        top = null;
        minTop = null;
    }

    public int min() {
        if (minTop == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return minTop.value;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;

        // Update minTop if the new value is smaller or equal to the current min
        if (minTop == null || value <= minTop.value) {
            Node newMinNode = new Node(value);
            newMinNode.next = minTop;
            minTop = newMinNode;
        }
    }

    public int pop() {
        if (top == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int poppedValue = top.value;
        top = top.next;

        // Pop from minTop if the popped value is the current min
        if (poppedValue == minTop.value) {
            minTop = minTop.next;
        }

        return poppedValue;
    }

    private static class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        StackMin stack = new StackMin();
        stack.push(3);
        stack.push(5);
        System.out.println(stack.min()); // 3
        stack.push(2);
        System.out.println(stack.min()); // 2
        stack.pop();
        System.out.println(stack.min()); // 3
    }
}
