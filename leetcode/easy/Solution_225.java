/**
 * author: seungw0n
 * question: Implement Stack using Queues
 * details:
 *  Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement Stack using Queues.
 *  Memory Usage: 41.8 MB, less than 45.27% of Java online submissions for Implement Stack using Queues.
 * comment:
 *  Need to change the filename (Solution.java)
*/


class MyStack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    
    public MyStack() {
        q1 = new LinkedList<Integer>();
        q2 = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        q1.add(x);
        if (q2.isEmpty())
            q2.add(x);
        else {
            q2.poll();
            q2.add(x);
        }
    }
    
    public int pop() {
        for (int i = 0; i < q1.size(); i++)
            q2.add(q1.poll());
        
        q2.poll();

        for (int i = 0; i < q2.size() - 1; i++)
            q1.add(q2.poll());
        
        if (q2.peek() != null)
            q1.add(q2.peek());
        
        return q1.poll();
    }
    
    public int top() {
        return q2.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty();
    }
    
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
