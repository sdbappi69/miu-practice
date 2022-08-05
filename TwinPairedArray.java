import java.util.Arrays;
class TwinPairedArray{
	public static void main(String[] args) {
		int[] a = new int[] {8};
		System.out.println(isTwinPaired(a));
	}

	static int isTwinPaired(int[] a){
		int[] evenArray = new int[a.length];
		int[] oddArray = new int[a.length];
		int evenIndex = 0;
		int oddIndex = 0;
		int evenLen = 0;
		int oddLen = 0;

		for(int i = 0; i < a.length; i++){
			if(a[i]%2 == 0){
				evenArray[evenIndex] = a[i];
				evenIndex++;
				evenLen++;
			}else{
				oddArray[oddIndex] = a[i];
				oddIndex++;
				oddLen++;
			}
		}

		if(isAscending(evenArray, evenLen) == true && isAscending(oddArray, oddLen) == true){
			return 1;
		}else{
			return 0;
		}
	}

	static boolean isAscending(int[] arr, int len){
		if(arr.length <= 1){
			return true;
		}

		for (int i = 0; i < len - 1; i++) {
			if(arr[i] > arr[i+1]){
				return false;
			}
		}

		return true;
	}
}