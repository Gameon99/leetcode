class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
            
        if(numRows <= 0){
            return list;
        }
        
        ArrayList<Integer> previous = new ArrayList<Integer>();
        previous.add(1);
        list.add(previous);
        
        for(int i = 2;i <= numRows;i++){
            ArrayList<Integer> current = new ArrayList<Integer>();
            current.add(1);
            for(int j = 0;j < previous.size() - 1;j++){
                current.add(previous.get(j) + previous.get(j+1));
            }
            current.add(1);
            list.add(current);
            previous = current;
        }
        return list;
    }
}
