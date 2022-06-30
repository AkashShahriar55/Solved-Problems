class MyCircularQueue {
    
    int[] queueArray;
    int k = 0;
    int head = -1;
    int tail = -1;

    public MyCircularQueue(int k) {
        this.k = k;
        queueArray = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(isFull())
            return false;
        
        if(tail == -1 && head == -1) {
            tail = 0;
            head = 0;
        }
        else if(tail == (k-1)){
            tail = 0;
        }else{
            tail++;
        }
        
        queueArray[tail] = value;
        // System.out.println(head + " " + tail);
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())
            return false;
        
        if(head == tail){
            head = -1;
            tail = -1;
        }
        else if(head == (k-1)){
            head = 0;
        }else{
            head++;
        }
        
        return true;
  
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return queueArray[head];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return queueArray[tail];
    }
    
    public boolean isEmpty() {
        if(head == -1 && tail == -1)
            return true;
        else
            return false;
    }
    
    public boolean isFull() {
        if(tail == (head-1) || (head == 0 && tail == (k-1))){
            return true;
        }else{
            return false;
        }
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