class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        int left=0;
        int right=n-1;
        char[] c = s.toCharArray();
        while(left<=right){
            while(left<right && !isVowel(c[left])){
                left++;
            }
            while(left<right && !isVowel(c[right])){
                right--;
            }
            char temp=c[left];
            c[left]=c[right];
            c[right]=temp;
            left++;
            right--;
        }
        return new String(c);
    }
    public static boolean isVowel(char c){
        return "aeiouAEIOU".indexOf(c)!=-1;
    }
}