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
      System.out.println(numTri);
    } catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
  public static void vertical(String fileName){
    try {
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      int numTri = 0;
      while (input.hasNextInt()){
        int[] triangle1 = new int[3];
        int[] triangle2 = new int[3];
        int[] triangle3 = new int[3];

        for (int i = 0; i < 3; i++){
          triangle1[i] = input.nextInt();
          triangle2[i] = input.nextInt();
          triangle3[i] = input.nextInt();
        }

        if (isTri(triangle1[0], triangle1[1], triangle1[2])){
          numTri += 1;
        }

        if (isTri(triangle2[0], triangle2[1], triangle2[2])){
          numTri += 1;
        }

        if (isTri(triangle3[0], triangle3[1], triangle3[2])){
          numTri += 1;
        }
      }
      System.out.println(numTri);
    } catch(FileNotFoundException e){
      System.out.print("File not found");
    }
  }

  public static void main(String[] args) {
    if (Integer.parseInt(args[1])==1){
      horizontal(args[0]);
    }else if (Integer.parseInt(args[1])==2){
      vertical(args[0]);
    }
  }
}
