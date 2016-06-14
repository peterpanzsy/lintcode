package sort;

public class BubbleSort {
	static void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	static void print(int[] nums){
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]);
		}
	}
	static void bubbleSort(int[] nums){
		for(int i = 0; i < nums.length; i++){
			for(int j = i-1; j >= 0; j--){
				if(nums[i]<nums[j]){
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
					i = j;
				}else{
					break;
				}
			}
		}
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]);
		}
	}
	static void selectSort(int[] nums){
		for(int i = 0; i < nums.length; i++){
			for(int j = i+1; j < nums.length; j++){
				if(nums[j] < nums[i]){
					swap(nums, i, j);
				}
				continue;
			}
		}
		print(nums);
	}
	public static void main(String[] args){
		int[] array = new int[]{5,1,2,3,6,7,0,11,2,3};
		int[] num = new int[]{0,0,1,3,7,9,20,3};
//		bubbleSort(array);
		selectSort(num);
	}
}
