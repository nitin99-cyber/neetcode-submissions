class Solution {
    public boolean hasDuplicate(int[] nums) {
        int j=0; int k=1; 
        Arrays.sort(nums);
        while (k<nums.length){
            if((nums[j]^nums[k])==0) return true;
            else { j++; k++; } }
            return false;

        
        
    }
}