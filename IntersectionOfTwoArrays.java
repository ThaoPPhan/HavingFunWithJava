import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOfTwoArrays {
	public static int[] intersect(int[] nums1, int[] nums2) {
		HashMap<Integer, Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		
		// Count # of element in nums1
		for (int num : nums1) {
			map.put(num, map.getOrDefault(num, 0)+1);
			
		}
		// find the intersection
		
		for (int num : nums2) {
			if (map.containsKey(num) && map.get(num)>0) {
				result.add(num);
				map.put(num, map.get(num)-1);// Decrement the count
				
			}
		}
		// convert list to array
		int[] intersection = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			intersection[i]= result.get(i); 
		}
		
		return intersection;
	}
	
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		int[] result = intersect(nums1, nums2);
		
		//print result
		System.out.print("output: [");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i]);
			if (i<result.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	
}
