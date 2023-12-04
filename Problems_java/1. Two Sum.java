class Solution {
    public int[] twoSum(int[] nums, int target) {
        boolean sumFound = false; 
        int[] retVal = {0,0};
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    sumFound = true;
                    retVal[0] = i;
                    retVal[1] = j;
                    break;
                }
            }
            if(sumFound == true)
            {
                break;
            }
        }
        return retVal;
    }
}