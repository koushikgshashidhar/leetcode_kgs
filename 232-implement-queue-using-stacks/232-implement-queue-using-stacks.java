class MyQueue {

    Stack<Integer> st;
    Stack<Integer> st1;
    public MyQueue() {
        
       st= new Stack<Integer>();
    st1= new Stack<Integer>();  
    }
    
    public void push(int x) {
        
        if(st1.isEmpty())
        {
            while(!st.isEmpty())
            {
                st1.push(st.pop());
            }
        }
        
        st.push(x);
    }
    
    public int pop() {
        if(st1.isEmpty())
        {
            while(!st.isEmpty())
            {
                st1.push(st.pop());
            }
        }
       return st1.pop();
    }
    
    public int peek() {
        
        if(st1.isEmpty())
        {
            while(!st.isEmpty())
            {
                st1.push(st.pop());
            }
        }
       return st1.peek();
    }
    
    public boolean empty() {
        
        return st.isEmpty() && st1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */