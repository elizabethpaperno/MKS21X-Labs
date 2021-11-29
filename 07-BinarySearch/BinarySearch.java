/*Precondition: data is sorted (increasing order)
 *@param data: the numbers to search through
 *@param target: the number you want to find
 *@return the index of data that contains the target value. Return -1 if the value is not in the array.
 *If there are multiple copies return the one you find first using
 *(min+max)/2 method described.
 */
public class BinarySearch {
  public static int binarySearch(int[]data,int target){
    int start = 0;
    int end = data.length() - 1;
    int mid = end - start/2;
    while(true){ //filler
      mid = end - start/2;
      if (target > mid){
        start = mid + 1;
      }
      else if (target < mid){
        end = mid - 1;
      }else {
        return mid;
      }
    }
  }
}
