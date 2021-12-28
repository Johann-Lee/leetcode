class Solution {
    
    
    
    //find the sum of everything to the right first. 
    //incrementally find the sum up till your pivot.
    //update right sum by subtracting the pivot value each time. 
    //compare the two 
    
    public static int pivotIndex(int[] nums) {
        
        
        //when iterating for each pivot just keep adding to the sum
        int rightSum = 0;
        int leftSum = 0;
        int pivot;
        
        //initially find the first sum
        for(int i=1; i<nums.length;i++)
            rightSum += nums[i];
    

        //iterate over array, use iterator to represent each and every pivot 
        for(int i=0;i<nums.length;i++){
            pivot = nums[i];
            
            //if this is the first pivot then the sum will be 0 
            if(i==0)
                leftSum=0;
            else{
                leftSum  += nums[i-1];
                rightSum -= nums[i];
            }
            
            /** 
            System.out.println("pivot = " + pivot);
            System.out.println("rightSum = " + rightSum);
            System.out.println("leftSum = " + leftSum);
            */
            
            // if left = right, then you have found the pivot.
            if(leftSum == rightSum)
                return i;
        }
        
        // if you reach here then you haven't found the pivot.
        return -1;
    }


public static void main(String[] args)
{
    int[] numbers = {1,7,3,6,5,6}; 
    System.out.println(pivotIndex(numbers));
}
}