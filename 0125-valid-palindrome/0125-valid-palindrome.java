class Solution {
    public boolean isPalindrome(String s) {
        String str=s.toLowerCase();
        char[] ch=str.toCharArray();
        int left=0;
        int right=s.length()-1;
        if(s.isEmpty()){
            return true;
        }
        while(left<right){
            if(!Character.isLetterOrDigit(ch[left])){
                left++;
            }
            else if(!Character.isLetterOrDigit(ch[right])){
                right--;
            }
            else{
                if(ch[left]!=ch[right]){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}