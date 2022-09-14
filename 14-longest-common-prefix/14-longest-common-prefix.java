class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuilder ans = new StringBuilder();
        String first = strs[0];
        for(int i = 0; i < first.length();i++ ){
            char target = first.charAt(i);
            for(int j = 1; j< strs.length;j++){
                String str = strs[j];
                if(i >= str.length() || str.charAt(i) != target){
                    return ans.toString();
                }
            }
            ans.append(target);
        }
        
        return ans.toString();
    }
}