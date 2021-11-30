public class Non {
  public static File readFile() {
    try {
        File file = new File(fileName);
        return file;
    }catch (FileNotFoundException e) {
      System.out.println("File not found");
      return null;
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
