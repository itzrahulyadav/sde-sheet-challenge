class Solution {
    public void nextPermutation(int[] nums) {
        if (nums.length <= 1)
            return;

        int a = nums.length - 2;

        while (a >= 0 && nums[a] >= nums[a + 1])
            a--;

        int i = nums.length - 1;
        if (a >= 0) {
            while (a >= 0 && nums[i] <= nums[a])
                i--;
            swap(nums, a, i);
        }
        reverse(nums, a + 1, nums.length - 1);
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    private static void reverse(int[] arr, int a, int b) {
        while (a < b) {
            swap(arr, a, b);
            a++;
            b--;
        }
    }
}
