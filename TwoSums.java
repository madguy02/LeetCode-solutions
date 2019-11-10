
import java.util.*;

public class TwoSums {
	
	public static void main(String[] args) {
		int nums[] = {2, 7, 11, 15};
		int target = 9;
		twoSum(nums, target);
	}
	
	public  static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0;i<nums.length;i++) {
			map.put(nums[i], i);
		}
		int val = 0;
		for (int j=0;j<nums.length;j++) {
			val = target - nums[j];
			if (map.containsKey(val) && map.get(val) != j) {
				return new int[] {j,map.get(val)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
