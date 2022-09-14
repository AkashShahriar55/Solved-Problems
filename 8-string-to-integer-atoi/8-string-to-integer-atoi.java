class Solution {
    public int myAtoi(String s) {
        long number = 0;
        int flag = 1;
        boolean flagDone = false;
        
        for(int i = 0; i< s.length();i++){
            char c = s.charAt(i);
            
            
            
            if(c == '-' && !flagDone){
                flag = -1;
                flagDone = true;
                continue;
            }else if(c == '+' && !flagDone){
                flag = 1;
                flagDone = true;
                continue;
            }else if(c == ' ' && !flagDone)
                continue;
            
            int num = getCharToNumber(c);
            
            if(num != -1){
                number = number * 10 + num;
                flagDone = true;
            }else{
                break;
            }
            
           if(number > Integer.MAX_VALUE || number < Integer.MIN_VALUE ){
                if(flag == -1)
                    return Integer.MIN_VALUE;
                return Integer.MAX_VALUE;
            }
            
        }
        
        
        
        return (int)number * flag;
    }
    
    
    private int getCharToNumber(char c){
        switch(c){
            case '0':return 0;
            case '1':return 1;
            case '2':return 2;
            case '3':return 3;
            case '4':return 4;
            case '5':return 5;
            case '6':return 6;
            case '7':return 7;
            case '8':return 8;
            case '9':return 9;
            default: return -1;
                    
        }
    }
}