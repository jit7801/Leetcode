class Solution {
    public int searchInsert(int[] nums, int target) {
        int val = 0;
        int length = nums.length;
        for(int i = 0; i<length; i++){
            if(nums[i]==target){
                val = i;
            }else if(nums[i]<=target){
                val = i+1;
            }
            else{
                System.out.println(val);
            }
        }
        return val;
    }
}