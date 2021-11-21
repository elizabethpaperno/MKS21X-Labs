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
      }
      arrList.add(num);
    }
  }
}
