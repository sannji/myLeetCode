import java.util.*;
import java.lang.*;
public class HashMapSum {
        public static void main(String[] args) {
            int[] testArr = {1,3,5,7,12};
            Solution solution = new Solution();
            int[] result = solution.twoSum(testArr, 12);
            System.out.println(Arrays.toString(result));
            System.out.println("length is :" + result.length);
        }

}

class Solution {
        public int[] twoSum(int[] nums, int target) {
            Map<Integer, Integer> hashMap = new java.util.HashMap<>();
            int remain;
            for(int i=0; i<nums.length; i++) {
                    remain = target - nums[i];
                    if (hashMap.containsKey(remain)) {
                            return new int[]{hashMap.get(remain), i};
                    }
                    hashMap.put(nums[i], i);
            }
            return new int[]{};
        }
}
