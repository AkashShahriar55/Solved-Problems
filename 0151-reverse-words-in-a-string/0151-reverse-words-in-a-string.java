class Solution {
    public String reverseWords(String s) {
        
        List<String> list = new ArrayList();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< s.length();i++){
            
            if(s.charAt(i) != ' '){
                sb.append(s.charAt(i));
            }
            
            if(s.charAt(i) == ' ' && sb.length() != 0){
                list.add(sb.toString());
                sb.delete(0,sb.length());
            }
            
        }
        if(sb.length() != 0){
            list.add(sb.toString());
            sb.delete(0,sb.length());
        }
        for(int i = list.size()-1;i>=0;i--){
            sb.append(list.get(i));
            if(i != 0){
                sb.append(" ");
            }
            
        }
        
        return sb.toString();
    }
}