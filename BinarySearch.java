import java.util.Scanner;

/**
 *
 * @author Chamali
 */
public class BinarySearch {
    private static int binarySearch(int[] arr, int searched) {

		int left = 0;
		int right = arr.length - 1;
		
		while(left <= right) {
			int midIndex = (left + right) / 2;
			
			if(arr[midIndex] < searched) {
				left = midIndex + 1;
			} else if(arr[midIndex] > searched) {
				right = midIndex - 1;
			} else { 
				return midIndex;
			}
		}
		
		
		return -1;
	}
	public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int [] arr = new int[N];
            for (int k = 0; k < N; k++) 
            {
              arr[k] = s.nextInt();
            }	
            int M = s.nextInt();
		
            System.out.println(binarySearch(arr, M));
	}
}
