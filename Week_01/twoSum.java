class Solution {
    public int[] twoSum(int[] nums, int target) {
        //暴力求解
        // int[] returnNums = new int[2];
        // for(int j = 0 ; j< nums.length ; j++){
        //     for(int i = j+1 ; i < nums.length ; i++){
        //         // 加法：自身不能相加。指针一直往前走
        //             if(nums[i]+nums[j] == target){
        //                 returnNums[0] = j;
        //                 returnNums[1] = i;
        //                 return returnNums;
        //             }
        //     }   
        // }
        // throw new IllegalArgumentException("No two sum solution");
        //一遍哈希表
        Map<Integer,Integer> backupMap = new HashMap<Integer,Integer>();
        for(int i = 0 ; i < nums.length ; i++){
            if( backupMap.get(target-nums[i]) !=null && backupMap.get(target-nums[i]) != i ){
                return new int[]{backupMap.get(target-nums[i]),i};
            }
            backupMap.put(nums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
    
}