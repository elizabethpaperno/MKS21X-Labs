import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Wrapping {
  public static void getAmtWrapPaper(String fileName){
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      int totalNeeded = 0;
      while (input.hasNextLine()){
        String[]nums = input.nextLine().split("x");
        int l = Integer.parseInt(nums[0]);
        int w = Integer.parseInt(nums[1]);
        int h = Integer.parseInt(nums[2]);

        int side1 = l * w;
        int side2 = w * h;
        int side3 = h * l;

        int surArea = 2*l*w + 2*w*h + 2*h*l;

        int smallSize = Math.min(Math.min(side1, side2), side3);

        totalNeeded += surArea + smallSize;

      }
      System.out.println(totalNeeded);
    }catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
    public static void getAmtRibbon(String fileName){
      try {
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        int totalNeeded = 0;
        while (input.hasNextLine()){
          String[]nums = input.nextLine().split("x");
          int l = Integer.parseInt(nums[0]);
          int w = Integer.parseInt(nums[1]);
          int h = Integer.parseInt(nums[2]);

          int amtBow = l * w * h;
          int perim = 2 * ( (l + w + h) - Math.max(Math.max(l, h), w));
          totalNeeded += amtBow + perim;
        }
        System.out.println(totalNeeded);
      }catch (FileNotFoundException e) {
        System.out.println("File not found");
      }
    }
  public static void main(String[] args){
    if (Integer.parseInt(args[1])==1){
      getAmtWrapPaper(args[0]);
    }else if (Integer.parseInt(args[1])==2){
      getAmtRibbon(args[0]);
    }
  }
}
