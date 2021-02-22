class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {

        if(matrix  == null || matrix.length == 0)return new int[0];

        int N = matrix.length;
        int M = matrix[0].length;
        int res[] = new int[N*M];

        HashMap<Integer,List<Integer>> dict = new HashMap<>();

        for(int i = 0;i < N; i++){
            for(int j = 0;j < M; j++){
                int size = i + j;
                if(!dict.containsKey(size)){
                    dict.put(size,new ArrayList<Integer>());
                }
                dict.get(size).add(matrix[i][j]);
            }
        }

        int ctr = 0;
        for(Map.Entry<Integer,List<Integer>> entry : dict.entrySet()){
            List<Integer> list = new ArrayList<Integer>();

            if(entry.getKey()%2 == 0){
                list = entry.getValue();
                Collections.reverse(list);
            }else{
                list = entry.getValue();
            }
            for(int i = 0;i < list.size() ; i++){
                res[ctr++] = list.get(i);
            }
        }

        return res;
    }
}