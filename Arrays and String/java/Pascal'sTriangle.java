class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result  = new ArrayList<>();
        List<Integer> prev = new ArrayList<>();
        for(int i = 0 ; i < numRows ; i++){
            List<Integer> list = new ArrayList<>();
            if(i == 0){
                list.add(1);
            }else if(i == 1){
                list.add(1);
                list.add(1);
            }else{
                list.add(1);
                for(int j = 1;j < i ; j++){
                    list.add(prev.get(j-1)+ prev.get(j));
                }
                list.add(1);
            }
            prev = list;
            result.add(list);
        }
        return result;
    }
}