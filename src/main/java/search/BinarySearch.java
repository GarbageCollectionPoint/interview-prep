package search;

// log(n) runtime. Use on sorted array
public class BinarySearch {

  public static void main(String[] args) {

  }

  /**
   * Runtime: O(log(n))
   * Memory: O(1)
   * @param arr
   * @param match value to match
   * @return index of match, -1 if not found
   */
  private static int iterativeBinarySearch(int[] arr, int match) {
    int start = 0;
    int end = arr.length - 1;

    while (start <= end) {
      int mid = (start + end) / 2;

      if (arr[mid] < match) {
        start = mid + 1;
      } else if (arr[mid] > match) {
        end = mid - 1;
      } else {
        return mid;
      }
    }

    return -1;
  }

  /**
   * Runtime: O(log(n))
   * Memory: O(log(n))
   * @param arr
   * @param match value to match
   * @return index of match, -1 if not found
   */
  private static int recursiveBinarySearch(int[] arr, int match) {
    return recursiveBinarySearch(arr, match, 0, arr.length - 1);
  }

  private static int recursiveBinarySearch(int[] arr, int match, int start, int end) {
    if (start > end) {
      return - 1;
    }
    int mid = (start + end) / 2;
    if (arr[mid] == match) {
      return mid;
    } else if (arr[mid] < match) {
      return recursiveBinarySearch(arr, match, mid + 1, end);
    } else {
      return recursiveBinarySearch(arr, match, start, mid - 1);
    }
  }
}
