public class Non {
  public static void part1() {
    try {
        File file = new File(fileName);
    }catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }

  public static boolean hasVowel(String str){
    int numV = 0;
    for (int i = 0; i < str.length(), i++){
      if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'o'){
        numV += 1;
      }
    }
    return (numV >= 3);
  }
  public static void main(String[] args){
   if (Integer.parseInt(args[1])==1){
     getAmtWrapPaper(args[0]);
   }else if (Integer.parseInt(args[1])==2){
     getAmtRibbon(args[0]);
   }
 }
}
