class Solution {
    public int openLock(String[] deadends, String target) {
        Queue<String> q = new LinkedList();
        Set<String> visited = new HashSet();
         for(String end:deadends){
            visited.add(end);
         }
        
        q.add("0000");
        int count = 0;
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i = 0 ; i< size ; i++){
                String value = q.poll();
                // System.out.println(value);
                
                if(value.equals(target))
                    return count;
                
                if(visited.contains(value))
                    continue;
                
                visited.add(value);
                
               
                
                
                
                for(int j = 0; j < 4; j++){
                    char wheel = value.charAt(j);
                    StringBuilder sb = new StringBuilder(value);
                    String first = "";
                    String second = "";
                    if(wheel == '0'){
                        sb.setCharAt(j,'9');
                        first = sb.toString();
                        sb.setCharAt(j,'1');
                        second = sb.toString();
                    }else if(wheel == '1'){
                        sb.setCharAt(j,'0');
                        first = sb.toString();
                        sb.setCharAt(j,'2');
                        second = sb.toString();
                    }
                    else if(wheel == '2'){
                        sb.setCharAt(j,'1');
                        first = sb.toString();
                        sb.setCharAt(j,'3');
                        second = sb.toString();
                    }
                    else if(wheel == '3'){
                        sb.setCharAt(j,'2');
                        first = sb.toString();
                        sb.setCharAt(j,'4');
                        second = sb.toString();
                    }
                    else if(wheel == '4'){
                        sb.setCharAt(j,'3');
                        first = sb.toString();
                        sb.setCharAt(j,'5');
                        second = sb.toString();
                    }
                    else if(wheel == '5'){
                        sb.setCharAt(j,'4');
                        first = sb.toString();
                        sb.setCharAt(j,'6');
                        second = sb.toString();
                    }else if(wheel == '6'){
                        sb.setCharAt(j,'5');
                        first = sb.toString();
                        sb.setCharAt(j,'7');
                        second = sb.toString();
                    }
                    else if(wheel == '7'){
                        sb.setCharAt(j,'6');
                        first = sb.toString();
                        sb.setCharAt(j,'8');
                        second = sb.toString();
                    }else if(wheel == '8'){
                        sb.setCharAt(j,'7');
                        first = sb.toString();
                        sb.setCharAt(j,'9');
                        second = sb.toString();
                    }
                    else if(wheel == '9'){
                        sb.setCharAt(j,'8');
                        first = sb.toString();
                        sb.setCharAt(j,'0');
                        second = sb.toString();
                    }
                    
                    if(!visited.contains(first)) q.add(first);
                    if(!visited.contains(second)) q.add(second);
                    
                }
                
                // visited.add(value);
            }
            // System.out.println();
            count++;
        }
        
        return -1;
        
    }
}