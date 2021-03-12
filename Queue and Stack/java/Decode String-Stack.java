class Solution {
    public String decodeString(String s) {

        String res = "";
        int index = 0;
        Stack<String> results = new Stack<>();
        Stack<Integer> counts  = new Stack<>();

        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = count*10 + (s.charAt(index) - '0');
                    index++;
                }
                counts.push(count);
            }else if(s.charAt(index) == '['){
                results.push(res);
                res = "";
                index++
            }else if(s.charAt(index) == ']'){
                StringBuilder temp = new StringBuilder(results.pop());
                int count = counts.pop();
                for(int i = 0 ; i < count ; i++){
                    temp.append(res);
                }
                res = temp.toString();
                index++
            }else{
                res += s.charAt(index++);

            }
        }
        return res;
    }
}