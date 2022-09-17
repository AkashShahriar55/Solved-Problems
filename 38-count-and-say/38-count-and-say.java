class Solution {
    public String countAndSay(int n) {
        
        String ans = "1";
        
        for(int i = 1; i < n;i++){
            // System.out.println(ans);
            String a = ans;
            StringBuilder builder = new StringBuilder();
            int count = 1;
            char prev = a.charAt(0);
            for(int j = 1; j< a.length();j++){
                if(prev != a.charAt(j)){
                    builder.append(count);
                    builder.append(prev);
                    prev = a.charAt(j);
                    count = 1;
                }else{
                    count++;
                }
            }
        
            builder.append(count+"");
            builder.append(prev);
            ans = builder.toString();
            
        }
        
        return ans;
    }
}