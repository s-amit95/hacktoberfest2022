class solution{
   public int findInMountainArray(int target, int[] arr) {
        int peak = peak(arr);
        int firstTry = binarysearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }

        int secondtry = binarysearch(arr, target, peak, arr.length-1);
        return secondtry;
    }
public int binarysearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        for (int i = start; i <= end; i++) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if(isAsc){
            if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
                }
            } else {
                if(arr[mid]<target){
                    end = mid -1;
                } else {
                    start = mid + 1;
                }
            }
            
        }
        return -1;
    }
}
