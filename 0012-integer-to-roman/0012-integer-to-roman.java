class Solution {
    public String intToRoman(int num) {
        
        int multiplyer = 1;
        String ans = "";
        
        while(num != 0){
            int reminder = num%10;
            num = num/10;
            if(reminder >= 1 && reminder < 4){
                ans = multiplyString(reminder,granularRoman(1*multiplyer)) + ans;
            }
            else if ( reminder > 5 && reminder < 9){
                ans = granularRoman(5*multiplyer) + multiplyString(reminder-5,granularRoman(1*multiplyer)) + ans;
            }else if( reminder > 0){
                ans = granularRoman(reminder*multiplyer) + ans;
            }
            multiplyer *= 10;
        }
        
        
        return ans;
    }
    
    
    private String multiplyString(int multiplyer , String str){
        String ans = "";
        for(int i = 0; i< multiplyer ; i++){
            ans += str;
        }
        
        return ans;
    }
    
    
    private String granularRoman(int num){
        switch(num){
            case 1:return "I";
            case 4:return "IV";
            case 5:return "V";
            case 9:return "IX";
            case 10:return "X";
            case 40:return "XL";
            case 50:return "L";
            case 90:return "XC";
            case 100:return "C";
            case 400:return "CD";
            case 500:return "D";
            case 900:return "CM";
            case 1000:return "M";
            default:return"";
        }
        
    }
    
    
}