import java.util.*;
public class Sorts{

  /**Bubble sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void bubbleSort(int[] data){
    int end = data.length - 1;
    int ogVal = 0;
    boolean swapped = true;
    while(swapped) {
      swapped = false;
      for (int i = 0; i < end; i++){
        if (data[i] > data[i+1]){
          swapped = true;
          ogVal = data[i + 1];
          data[i+1] = data[i];
          data[i] = ogVal;
        }
      }
      end -= 1;
    }
  }

    /*Selection sort
   */
  public static void selectionSort(int [] ary) {
    /*Your implementation here!*/
    int ogValStart = 5;
    int minVal;
    int minIndex;
    for (int start = 0; start < ary.length; start++){
      minVal = ary[start];
      minIndex = start;
      for (int i = start; i < ary.length; i++){
        if (ary[i] < minVal){
          minVal = ary[i];
          minIndex = i;
        }
      }
      ogValStart = ary[start];
      ary[start] = minVal;
      ary[minIndex] = ogValStart;
      //System.out.println(Arrays.toString(ary));
    }
  }

  public static void insertionSort(int[]data){
  /*Your implementation here*/
    int key;
    for (int i = 1; i < data.length; i++){
      key = data[i];
      while (key < data[i-1]){
        shiftLeft(data, key);
      }
    }
  }
  public static int[] shiftLeft(int[] data, int key){
    for (int i = key; i >= 0; i--){
      data[i]= data[i-1];
    }
    return data;
  }
  public static boolean checkSorted(int[] ary){
    int[] copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      copy[i] = ary[i];
    }
    Arrays.sort(copy);
    return (Arrays.equals(copy,ary));
  }

  public static int[] randArray(int length, int start, int end){
    int[] rand = new int[length];
    for (int i = 0; i < rand.length; i++){
      rand[i]=(int)(Math.random()*(end-start+1))+end;
    }
    return rand;
  }

  public static int[] reverseSortAry(int[] ary){
    Arrays.sort(ary);
    for (int i = 0; i < ary.length / 2; i++){
      int temp = ary[i];
      ary[i] = ary[ary.length - i - 1];
      ary[ary.length - i - 1] = temp;
    }
    return ary;
  }

  public static void main(String[] args){
    /*
    int[] sizeZero = new int[0];
    bubbleSort(sizeZero);
    System.out.println("Bubble - Size Zero: " + checkSorted(sizeZero));
    int[] sizeOne = {-1};
    bubbleSort(sizeOne);
    System.out.println("Bubble - Size One: " + checkSorted(sizeOne));

    int[] sorted = randArray(10, -5, 10);
    bubbleSort(sorted);
    System.out.println("Bubble - Sorted Ary: " + checkSorted(sorted));

    int[] randLarge = randArray(2000, -1000, 1000);
    bubbleSort(randLarge);
    System.out.println("Bubble - Random Large Ary: " + checkSorted(sorted));

    int[] dup = randArray(100, -5, 5);
    bubbleSort(dup);
    System.out.println("Bubble - Ary with Duplicates: " + checkSorted(dup));

    int[] noDup = randArray(300, 0, 10);
    bubbleSort(noDup);
    System.out.println("Bubble - Ary No Duplicates: " + checkSorted(noDup));

    int[] revSort = reverseSortAry(randArray(100, -10, 10));
    bubbleSort(revSort);
    System.out.println("Bubble - Reverse Array: " + checkSorted(revSort));
    */

    // int[] ex1 = {7, 5, 4, 2};
    // selectionSort(ex1);

    // int[] ex2 = {5, 1, 12, -5, 16, 2, 12, 14};
    // selectionSort(ex2);

    /*
    int[] sizeZero = new int[0];
    selectionSort(sizeZero);
    System.out.println("Selection - Size Zero: " + checkSorted(sizeZero));

    int[] sizeOne = {-1};
    selectionSort(sizeOne);
    System.out.println("Selection - Size One: " + checkSorted(sizeOne));

    int[] sorted = randArray(10, -5, 10);
    selectionSort(sorted);
    System.out.println("Selection - Sorted Ary: " + checkSorted(sorted));

    int[] randLarge = randArray(2000, -1000, 1000);
    selectionSort(randLarge);
    System.out.println("Selection - Random Large Ary: " + checkSorted(sorted));

    int[] dup = randArray(100, -5, 5);
    selectionSort(dup);
    System.out.println("Selection - Ary with Duplicates: " + checkSorted(dup));

    int[] noDup = randArray(300, 0, 10);
    selectionSort(noDup);
    System.out.println("Selection - Ary No Duplicates: " + checkSorted(noDup));

    int[] revSort = reverseSortAry(randArray(100, -10, 10));
    selectionSort(revSort);
    System.out.println("Selection - Reverse Array: " + checkSorted(revSort));
    */

    int[] ex1 = {2, 4, 5, 1, 3};
    selectionSort(ex1);
    System.out.println(Arrays.toString(ex1));
  }
}
