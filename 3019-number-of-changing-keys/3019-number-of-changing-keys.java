class Solution {
    public int countKeyChanges(String s) {
        int count=0;
        String str=s.toLowerCase();
        for(int i=0;i<s.length()-1;i++){
            if(str.charAt(i)!=str.charAt(i+1)){
                count++;
            }
        }
        return count;
    }
}