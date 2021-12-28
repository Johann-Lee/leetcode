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
        
        System.out.println("Max element is = " + max + " at position " + index);
        
        //calculate whether its at least > than 2x every other element
        
        for(int j=0;j<nums.length;j++)
        {
            
            System.out.println("Is max element greater than " + nums[j]);
            
            if(nums[j]==max)
                continue;
            else if(nums[j]*2>max)
                return -1;
            
        }
        return index;
    }
}