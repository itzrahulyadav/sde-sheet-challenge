class Solution {
    public void sortColors(int[] nums) {
        
        int z = 0;
        int o = 0;
        int t = nums.length - 1;
        
        while(o <= t)
        {
            if(nums[o] == 0)
            {
                swap(nums,z,o);
                z++;
                o++;
            }
            else if(nums[o] == 1)o++;
            else if(nums[o] == 2)
            {
                swap(nums,o,t);
                t--;
            }
        }
    }
    private  static void swap(int[]nums,int a,int b)
    {
        int  temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}class Solution {
    public void sortColors(int[] nums) {
        
        int z = 0;
        int o = 0;
        int t = nums.length - 1;
        
        while(o <= t)
        {
            if(nums[o] == 0)
            {
                swap(nums,z,o);
                z++;
                o++;
            }
            else if(nums[o] == 1)o++;
            else if(nums[o] == 2)
            {
                swap(nums,o,t);
                t--;
            }
        }
    }
    private  static void swap(int[]nums,int a,int b)
    {
        int  temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}