import java.util.*;

class MyStack {

    Queue<Integer> q = new LinkedList<>();

    public MyStack() {}

    public void push(int x) {
        q.add(x);

        // rotate queue to make x front
        int size = q.size();
        while (size > 1) {
            q.add(q.remove());
            size--;
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}