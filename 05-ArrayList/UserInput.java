import java.util.*;
public class UserInput{
  public static void main(String args[]){
    boolean isNeg = false;
    ArrayList<Double> arrList = new ArrayList<Double>();
    while (!isNeg){
      System.out.println("Enter a non negative number. A negative number will end the program:");
      Scanner in = new Scanner(System.in);
      double num = in.nextDouble();
      if (num < 0){
        isNeg = true;
      }else{
        arrList.add(num);
      }
    }
    System.out.print("You entered: ");
    System.out.println(arrList.toString());

    double sum = 0;
    double max = arrList.get(0);
    double min = arrList.get(0);

    for (int i=0; i < arrList.size(); i++){
      sum += arrList.get(i);

      if (arrList.get(i) > max){
        max = arrList.get(i);
      }

      if (arrList.get(i) < min){
        min = arrList.get(i);
      }
    }
    System.out.print("Mean: ");
    System.out.println(sum/arrList.size());

    System.out.print("Min value: ");
    System.out.println(min);

    System.out.print("Max value: ");
    System.out.println(max);
  }
}
