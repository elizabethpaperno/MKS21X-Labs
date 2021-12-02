import java.util.Arrays;
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

  public static boolean checkSorted(int[] ary){
    int[] copy = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      copy[i] = ary[i];
    }
    Arrays.sort(copy);
    return (copy.equals(ary));
  }

  public static int[] randArray(int length, int start, int end){
    int[] rand = new int[length];
    for (int i = 0; i < rand.length; i++){
      rand[i]=(int)(Math.random()*(end-start+1))+end;
    }
    return rand;
  }

  public static void main(String[] args){
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
    System.out.println("Bubble - Random Large Ary: " + checkSorted(dup));

    int[] noDup = randArray(1000, 0, 10);
    bubbleSort(noDup);
    System.out.println("Bubble - Random Large Ary: " + checkSorted(noDup));
  }
}
