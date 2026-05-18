//linear search
class linear {
    public static int linearSearch(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                System.out.println("element found");
                return i;
            }
        }
        System.out.println("element not found");
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {121, 144, 81, 62};
        int target = 81;
        int result = linearSearch(nums, target);
        System.out.println("Index: " +result);
    }
}


//binary search
public class binary {
    public static int binarySearch(int nums[], int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                System.out.println("element found");
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        } 
        System.out.println("element not found");
        return -1;
    }

    public static void main(String args[]) {
        int nums[] = {16, 25, 36, 49, 64};
        int target = 49;

        int result = binarySearch(nums, target);
    }
}

//interpolation search
class Main {
    public static int interpolationSearch(int nums[], int start, int end, int target) {
        if (start <= end && target >= nums[start] && target <= nums[end]) {
            int pos = start + ((end - start) * (target - nums[start])) / (nums[end] - nums[start]);
            
            if (nums[pos] == target) {
                return pos;
            }
            if (nums[pos] < target) {
                return interpolationSearch(nums, pos + 1, end, target);
            }
            if (nums[pos] > target) {
                return interpolationSearch(nums, start, pos - 1, target);
            }
        }
        return -1; 
    }

    public static void main(String args[]) {
        int nums[] = {10, 12, 13, 16, 18, 19, 20, 21,
                      22, 23, 24, 33, 35, 42, 47};
                      
        int n = nums.length;
        int target = 42;
        
        int result = interpolationSearch(nums, 0, n - 1, target);
        System.out.println("ans=" + result);
    }
}
