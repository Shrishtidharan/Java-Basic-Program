import java.util.*;
class Main {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>(); // val : index
        for(int i = 0 ; i < nums.length ; i++){
            int rem = target - nums[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }else{
                map.put(nums[i],i);
            }
        }
    return new int[]{};
    }
    public static void main (String[] args) {
        int[] cc = {2,4,1,7,8};
        int target =9;
        int[] res =twoSum(cc,target);
        System.out.println(Arrays.toString(res));
    }
}
