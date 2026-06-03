class Solution {
    public void moveZeroes(int[] nums) {
        int index = 0;
        for(int num : nums){
            if(nums[num] != 0){
                swap(nums, index, num);
                index++;
            }
        }
    }

    static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}