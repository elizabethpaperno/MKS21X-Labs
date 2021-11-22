import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Triangles {
  public static boolean isTri(int side1, int side2, int side3){
    return (side1 + side2 > side3) && (side2 + side3 > side1) && (side1 + side3 > side2);
  }
  public static void horizontal(String fileName){
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      int side1 = 0;
      int side2 = 0;
      int side3 = 0;
      int numTri = 0;
      while (input.hasNextInt()){
        side1 = input.nextInt();
        side2 = input.nextInt();
        side3 = input.nextInt();
        if (isTri(side1, side2, side3)){
          numTri += 1;
        }
      }
      input.close();
      System.out.print(numTri);
    } catch (FileNotFoundException e) {
      System.out.print("File not found");
    }
  }
  public static void vertical(String fileName){
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
    } catch(FileNotFoundException e){
      System.out.print("File not found");
    }
  }

  public static void main(String[] args) {
    horizontal("data.txt");
  }
}
