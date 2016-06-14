package sort;

public class InsertSort {
	static void insertSort(int[] nums){
		for(int i = 0; i < nums.length; i++){
			for(int j = i-1; j >= 0; j--){
				if( nums[i] < nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					continue;
				}else{
					break;
				}
			}
		}
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]);
		}
	}
	
	public static void main(String[] args){
		int[] array = new int[]{5,1,2,3,6,7};
		insertSort(array);
	}

}
