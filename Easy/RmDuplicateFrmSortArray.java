class RmDuplicateFrmSortArray {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        int prev = nums[0];
        int place = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != prev){
                nums[place] = nums[i];
                unique++;
                place++;
                prev = nums[i];
            }
        }
        return unique;
    }
}