class Solution {
    public int dominantIndex(int[] nums) {
        
        
        //Find the maximum element 
        int max = 0;
        int index = 0;
        
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max){
                max = nums[i];
                index = i;
            }
        }
        
        System.out.println("Max element is = " + max + "at position " + index);
        
        //calculate whether its at least > than 2x every other element
        
        for(int j=0;j<nums.length;j++)
        {
            if(max/nums[j]>=2)
                continue;
            else
                return -1;
        }
        return index;
    }
}