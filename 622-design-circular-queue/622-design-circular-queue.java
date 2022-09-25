class MyCircularQueue {

    Deque<Integer> q;
    int size;
    public MyCircularQueue(int k) {
        q= new ArrayDeque(k);
        size=k;
    }
    
    public boolean enQueue(int value) {
        
        
        // return q.offer(value);
        if(q.size()==size)
            return false;
        q.add(value);
        return true;
    }
    
    public boolean deQueue() {
        
        
      // if(q.poll()==null)
      //     return false;
      //   return true;
         if(q.size()==0)
            return false;
        q.poll();
        return true;
    }
    
    public int Front() {
        
        if(q.peekFirst()==null)
            return -1;
        return q.peekFirst();
    }
    
    public int Rear() {
        if(q.peekLast()==null)
            return -1;
        return q.peekLast();
    }
    
    public boolean isEmpty() {
        return (q.size()==0);
    }
    
    public boolean isFull() {
        return q.size()==size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */