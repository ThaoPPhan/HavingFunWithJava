
public class SingleNumber {
	public static int singleNumbere(int[] nums) {
		int k=0;
		for (int num : nums) {
			k^=num;
		}
		return k;
	}
	public static void main(String[] args) {
		int[] nums = {4,1,2,1,2};
		System.out.println(singleNumbere(nums));
	}
}
