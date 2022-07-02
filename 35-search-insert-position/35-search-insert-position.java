class Solution {
    public int searchInsert(int[] nums, int target) {
        
        if(nums[0] >= target){
            return 0;
        }
        
        if(nums[nums.length - 1] <= target){
            return nums[nums.length - 1] == target ? nums.length - 1 : nums.length;            
        }
        
        int start = 0, end = nums.length, mid = (start + end) / 2;
        int premid = 0;
        while(start <= end){
            
            if(target == nums[mid] || mid == premid || mid == 1){
                if(nums[mid] < target){
                    return mid+1;
                }
                return mid;
            }
            else if(target > nums[mid]){
                start = mid;
            }
            else{
                end = mid;
            }
            premid = mid;
            mid = (start + end) / 2;
        }        
        return 0;
        
    }
}