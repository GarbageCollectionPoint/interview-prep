package search;

// Search a given number in a sorted array that has been rotated by some arbitrary number.
// Return -1 if the number does not exist.
public class SearchRotatedArray {

  private static int modifiedBinarySearch(int[] nums, int target) {
    int low = 0;
    int high = nums.length - 1;

    while (low <= high) {
      int mid = (low + high) / 2;

      if (nums[mid] == target) {
        return mid;
      }

      if (nums[low] < nums[mid] && target >= nums[low] && target < nums[mid]) {
        high = mid - 1;
      }
      else if (nums[mid] < nums[high] && target > nums[mid] && target <= nums[high]) {
        low = mid + 1;
      }
      else if (nums[low] > nums[mid]) {
        high = mid - 1;
      }
      else if (nums[mid] > nums[high]) {
        low = mid + 1;
      }
      else {
        return -1;
      }
    }
    return -1;
  }
}
