class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int eleSum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            eleSum=eleSum+nums[i];
        }
        for(int num : nums){
            int temp=num;
            while(temp>0){
                digitSum= digitSum+temp%10;
                temp=temp/10;
            }
        }
        return Math.abs(eleSum - digitSum);
    }
}