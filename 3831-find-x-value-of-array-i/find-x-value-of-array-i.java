class Solution {
public void process(int[] nums, int k, long[] res, long[] modArr)
    {
        int n = nums.length;

        for (int i = 0; i < n; i++)
            {
            int m = nums[i] % k; 
                
            long[] temp = new long[k];
                
            temp[m] = 1; 

            
            for (int pMod = 0; pMod < k; pMod++)
                {
                if (modArr[pMod] > 0)
                {
                    int newMod = (int) ((pMod * 1L * m) % k);
                    
                    temp[newMod] += modArr[pMod];
                }
            }

           
            for (int j = 0; j < k; j++) 
            {
                modArr[j] = temp[j]; 
                res[j] += temp[j]; 
            }
        }
    }

    public long[] resultArray(int[] nums, int k)
    {
        int n = nums.length;
        
        long[] res = new long[k];
        
        long[] modArr = new long[k]; 
        
        process(nums, k, res, modArr);

        return res; 
    }
}