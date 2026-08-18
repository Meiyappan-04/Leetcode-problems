class Solution {
    public int[] sortedSquares(int[] nums) {
        int left=0;
        int right=nums.length-1;
        int[] res=new int[nums.length];
        int pos=nums.length-1;
        while(left<=right){
            int ls=nums[left]*nums[left];
            int rs=nums[right]*nums[right];
            if(ls<rs){
                res[pos]=rs;
                right--;
            }
            else{
                res[pos]=ls;
                left++;
            }
            pos--;
        }
        return res;
    }
}