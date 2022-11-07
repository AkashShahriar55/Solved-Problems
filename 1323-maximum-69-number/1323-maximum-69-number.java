class Solution {
    // 9669 -> 9 966 -> 
    public int maximum69Number (int num) {
        int max = num;
        
        int currentValue = num;
        int remainingValues = 0;
        int mul = 1;
        
        while(currentValue > 0){
            int lastValue = currentValue % 10;
            currentValue = currentValue / 10;
            
          
            if(lastValue == 6){
                int newValue = currentValue * (mul * 10)  +  9 * mul + remainingValues;
                max = Math.max(max,newValue );
            }
           remainingValues = num - currentValue * (mul * 10);
            mul = mul*10;
        }
        
        return max;
    }
}