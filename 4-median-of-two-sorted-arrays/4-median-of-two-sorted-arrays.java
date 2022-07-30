class Solution {
    static double x , y = 0;
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int count = 0;
        int ind1 = 0;
        int ind2 = 0;
        
        int fisrt= Integer.MIN_VALUE, second =Integer.MIN_VALUE;
        
        int mid = (nums1.length+nums2.length)/2;       
        
        while(mid>=count){
        	
        	fisrt = second;
        	
            if(nums1.length>ind1 && nums2.length>ind2){
                if(nums1[ind1]>nums2[ind2]){
                    second = nums2[ind2];
                    ind2++;                    
                }
                else{
                    second = nums1[ind1];
                    ind1++;                    
                }
            }
            else if(nums1.length>ind1){
                second = nums1[ind1];
                ind1++;                
            }
            else{
                second = nums2[ind2];
                ind2++;                
            }
            count++;
        }

        if ((nums1.length+nums2.length)%2==1)
        {
            return (double)second;
        }
        else
        {            
            return ((double)fisrt+(double)second )/2;
        }   
    }
   
}