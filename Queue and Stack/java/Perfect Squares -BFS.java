class Solution {
    public int numSquares(int n) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        int depth = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            depth++;
            for(int i = 0 ; i < size ; i++){
                int node = queue.poll();
                if(!visited.add(node))continue;

                for(int j = 1 ; j <= Math.sqrt(node) ; j++){
                    int rem = node - j*j;
                    if(rem == 0){
                        return depth;
                    }
                    queue.offer(rem);
                }
            }
        }
        return 0;
    }
}