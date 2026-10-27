class Solution{
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>(nums.length);
        for(int i=0;i<nums.length;i++){
            int n=target-nums[i];
            if(hm.containsKey(n)){
                return new int[]{hm.get(n),i};
            }
            hm.put(nums[i],i);
        }
        return new int[]{-1,-1};
}
}