class Solution { // Usign BFS 24.3 % ahead very bad
    public int openLock(String[] deadends, String target) {
        int level = 0;
        HashSet<String> deadend = new HashSet<>(Arrays.asList(deadends));
        HashSet<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        visited.add("0000");

        while(!queue.isEmpty()){
            int size = queue.size();

            while(size > 0){
                String lock_position = queue.poll();
                if(deadend.contains(lock_position)){
                    size--;
                    continue;
                }
                if(lock_position.equals(target)){
                    return level;
                }
                StringBuilder sb = new StringBuilder(lock_position);
                for(int i = 0 ; i < 4 ; i++){
                    char c = sb.charAt(i);
                    String s1 = sb.substring(0,i) + (c == '9' ? 0 : c -'0' + 1) + sb.substring(i + 1);
                    String s2 = sb.substring(0,1) + (c == '0' ? 9 : c -'0' - 1) + sb.substring(i + 1);
                    if(!visited.contains(s1) && !deadend.contains(s1)){
                        queue.offer(s1);
                        visited.add(s1);
                    }
                    if(!visited.contains(s2) && !deadend.contains(s2)){
                        queue.offer(s2);
                        visited.add(s2);
                    }
                }
                size--;
            }
            level ++;
        }
        return -1;
    }
}