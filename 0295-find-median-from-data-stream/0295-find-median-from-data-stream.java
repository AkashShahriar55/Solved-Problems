class MedianFinder {
    
    /**
    2 5 3 4 1 10 7 12 13
    
    2
    5
    
    2,3
    5
    
    2,3
    5,4
    
    1,2,3
    5,4
    
    1,2,3
    10,5,4
    
    1,2,3,4,5
    13,12,10,7
    
    **/
    
    
    PriorityQueue<Integer> q2 = new PriorityQueue();
    PriorityQueue<Integer> q1 = new PriorityQueue(Collections.reverseOrder());

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
         if(q1.size() == 0){
             q1.add(num);
             return;
         }
        
        if(q1.peek() < num){
            q2.add(num);
            if(q2.size()>q1.size()){
                q1.add(q2.poll());
            }
        }else{
            q1.add(num);
            if(q1.size()>q2.size()){
                q2.add(q1.poll());
            }
        }
    }
    
    public double findMedian() {
        if(q1.size()>q2.size())
            return (double) q1.peek();
        if(q2.size() > q1.size())
            return (double) q2.peek();
        else if( q1.size() == q2.size())
            return (q1.peek()+q2.peek())/2.0;
        
        return 0.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */