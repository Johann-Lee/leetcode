class Solution {
    public int[] plusOne(int[] digits) {
     
        int len = digits.length;        
        //the digit we're dealing with is 9
        
        boolean flag = false; 
        for(int i=len-1;i>=0;i--)
        {
            //determining whether we need to carry over
            if(digits[i]==9)
            {
                System.out.println("flag is true");
                flag = true;
            }
            else
            {
                flag = false;
                System.out.println("flag is not true");
            }
                    
            //carry over required
            if(flag)
            {
                
                if (digits[i] == 9)
                {
                    
                    digits[i] = 0;

                    if(i==0)
                    {
                    System.out.println("carry over new array ");
                    
                    int[] copyto = new int[len+1];
                    copyto[0] = 1;                    
                    System.arraycopy(digits,1,copyto,1,len-1);
                    return copyto;
                    }
                    
                }
                else
                {
                    
                    System.out.println("We don't gotta do any carry over");
                    continue;
                }
            }
            //carry over not required
            else
            {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }
}