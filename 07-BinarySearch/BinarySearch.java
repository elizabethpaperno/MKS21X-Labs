/*Precondition: data is sorted (increasing order)
 *@param data: the numbers to search through
 *@param target: the number you want to find
 *@return the index of data that contains the target value. Return -1 if the value is not in the array.
 *If there are multiple copies return the one you find first using
 *(min+max)/2 method described.
 */
import java.util.*;
public class BinarySearch {
  public static int binarySearch(int[]data,int target){
    int start = 0;
    int end = data.length - 1;
    int mid = (end + start)/2;
    while(start <= end){
      mid = (end + start)/2;
      if (target > data[mid]){
        start = mid + 1;
      }
      else if (target < data[mid]){
        end = mid - 1;
      }else {
        return mid;
      }
    }
    return -1;
  }

  public static void main(String[] args){
    int result;
    result = binarySearch(new int[]{0,0,0,0,0,0,0},0);
    System.out.println(result);//should be 3
    result = binarySearch(new int[]{0,0,0,0,0,0,0},1);
    System.out.println(result);//should be -1


    int[] arr = {0,1,2,3,4,5,6};
    for (int i = 0; i < arr.length; i++){
      result = binarySearch(arr, i);
      System.out.println(result);
    }
    // 0, 1, 2, 3, 4, 5, 6

    int[] rand = new int[1000];
    for (int i = 0; i < rand.length; i++){
      rand[i]=(int)(Math.random()*10000000); //ensures no duplicates (otherwise test is invalid)
    }
    Arrays.sort(rand);
    //System.out.println(Arrays.toString(rand));

    boolean working = true;
    int res = 0;
    for (int i = 0; i < rand.length; i++){
      res = binarySearch(rand, rand[i]);
      if (res != i){
        working = false;
        //System.out.println(rand[i]);
      }

    }
    System.out.println("Random test is " + working);
  }
}
