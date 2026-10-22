class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        int leftSum = 1;
        for(int i= 1;i<nums.length;i++){
          leftSum = nums[i-1] * leftSum;
          result[i] = leftSum;
        }

        int right = 1;
        for(int j = nums.length-2;j>=0;j--){
            right = right * nums[j+1];
            result[j] = result[j] * right;
        }
        return result;
    }
}  
