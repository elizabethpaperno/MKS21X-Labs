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

        if (side1 <= side2 && side1 <= side3){
          totalNeeded += side1 + surArea;
        }
        
      }
    }catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }
}
