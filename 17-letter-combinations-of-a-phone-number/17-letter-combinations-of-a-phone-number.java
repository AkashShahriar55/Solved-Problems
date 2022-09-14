class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList();
        Stack<String> stack = new Stack();
        
        
        
        for(int i = digits.length()-1;i>=0 ;i--){
            String charInDigit = charInDigit(digits.charAt(i));
            List<String> newList = new ArrayList();
            for(char letter : charInDigit.toCharArray()){
                if(result.size() <= 0){
                    newList.add(letter+"");
                    continue;
                }
                for(String value : result){
                    value = letter+value;
                    newList.add(value);
                }
                
            }
            result = newList;
        }
        
        return result;
    }
    
    
    private String charInDigit(char digit){
        switch(digit){
            case '2':{
                return "abc";
            } 
            case '3':{
                return "def";
            }
            case '4':{
                return "ghi";
            }
            case '5':{
                return "jkl";
            }
            case '6':{
                return "mno";
            }
            case '7':{
                return "pqrs";
            }
            case '8':{
                return "tuv";
            }
            case '9':{
                return "wxyz";
            }
        }
        return "";
    }
}