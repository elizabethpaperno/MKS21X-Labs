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

  public static void main(String[] args){
    int[] test1 = {0,1,2,3,4,5,6};
    bubbleSort(test1);
    System.out.println(Arrays.toString(test1));
    int[] test2 = {1,0,4,7,6,2,3,5};
    bubbleSort(test2);
    System.out.println(Arrays.toString(test2));

    int[] rand1 = new int[20];
    for (int i = 0; i < rand1.length; i++){
      rand1[i]=(int)((Math.random() * 10) + 1);
    }
    bubbleSort(rand1);
    System.out.println(Arrays.toString(rand1));

    int[] rand2 = new int[100];
    for (int i = 0; i < rand2.length; i++){
      rand2[i]=(int)((Math.random() * 10) - 10);
    }
    bubbleSort(rand2);
    System.out.println(Arrays.toString(rand2));
  }
}
