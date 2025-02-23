

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] nums = {1, 1, 2};
		int[] expectedNums = {1, 2};
		
		int k = removeDuplicates(nums);
		
		// test function
		assert k == expectedNums.length: "Right";
		for (int i = 0; i < k; i++) {
			assert nums[i] == expectedNums[i]: "Mismach"+i;
		}
		System.out.println("Passed");
		
		// print results
//		System.out.println("Output: ");
//		System.out.print("Modified array: ");
//		for (int i = 0; i < nums.length; i++) {
//			if (i<k) {
//				System.out.print(nums[i]+ " ");
//			} else {
//				System.out.print("_");
//			}
//		}
	}
	
	public static int removeDuplicates(int[] nums) {
		if (nums.length == 0) return 0;
		int k = 1;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != nums[k-1]) {
				nums[k] = nums[i];
				k++;
			}
		}
		return k;
		
	}
}
