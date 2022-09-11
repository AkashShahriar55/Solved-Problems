class Solution {
    public int minMeetingRooms(int[][] intervals) {
        
        int result = 0;
        
        PriorityQueue<Integer> meetingStart = new PriorityQueue<Integer>((n1,n2) -> intervals[n1][0] - intervals[n2][0]);
        PriorityQueue<Integer> meetingEnd = new PriorityQueue();
        
        for(int i = 0; i < intervals.length ; i++){
            meetingStart.add(i);
        }
        
        
        while(meetingStart.peek() != null){
            int position = meetingStart.poll();
            if(meetingEnd.peek() == null){
                result++;
                meetingEnd.add(intervals[position][1]);
                continue;
            }
            
            if(meetingEnd.peek() <= intervals[position][0]){
                meetingEnd.poll();
                meetingEnd.add(intervals[position][1]);
            }else{
                result++;
                meetingEnd.add(intervals[position][1]);
            }
        }
        
        
        
        return result;
        
    }
}