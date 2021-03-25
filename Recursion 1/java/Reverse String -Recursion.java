class Solution {
    public void reverseString(char[] s) }
        reverseString(s,0);
    }
    private void reverseString(char[] s, int i){
        if(i >= s.length/2)return;
        reverseString(s,i+1);
        char temp = s[i];
        s[i] = s[s.length -1 - i];
        s[s.length -1 -i] = temp;
    }
}