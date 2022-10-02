class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList();
        if(rowIndex == 0){
            list.add(1);
            return list;
        }
        
        if(rowIndex == 1){
            list.add(1);
            list.add(1);
            return list;
        }
        
        List<Integer> prevRow = getRow(rowIndex-1);
        
        list.add(1);
        for(int i =0;i<prevRow.size()-1;i++){
            list.add(prevRow.get(i)+prevRow.get(i+1));
        }
        list.add(1);
        
        return list;
            
    }
}