class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            int diff=nums[i+1]-nums[i];
            if(diff>1){
                for(int j=nums[i]+1;j<nums[i+1];j++){
                    res.add(j);
                }
            }
        }
        return res;
    }
}