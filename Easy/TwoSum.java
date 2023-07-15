class TwoSum{
    public static int[] twoSum(int[] nums, int target){
        if(nums.length == 2){
            return new int[] {0, 1};
        }else{
            for(int i = 0; i < nums.length - 1; i++){
                for(int j = i + 1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        return new int[] {i, j};
                    }
                }
            }
        }
        return null;
    }
}