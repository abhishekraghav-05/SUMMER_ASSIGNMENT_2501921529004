class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for (int k = 0; k <= i; k++) {
            System.out.print(nums[k] + " ");
        }
        System.out.println();

        return i + 1;
    }
}