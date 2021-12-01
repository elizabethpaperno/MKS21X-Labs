import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Non {
  public static boolean hasVowel(String str){
    int numV = 0;
    for (int i = 0; i < str.length(); i++){
      if (str.charAt(i) == 'a' || str.charAt(i) == 'i' || str.charAt(i) == 'e' || str.charAt(i) == 'u' || str.charAt(i) == 'o'){
        numV += 1;
      }
    }
    return (numV >= 3);
  }

  public static boolean doubleLet(String str){
    int doubC = 0;
    for (int i = 0; i < str.length() - 1; i++){
      if (str.charAt(i) == str.charAt(i + 1)){
        doubC += 1;
      }
    }
    return doubC >= 1;
  }

  public static boolean containsStr(String str){
    return !(str.contains("ab") || str.contains("cd") || str.contains("pq") || str.contains("xy"));
  }

  public static void part1(String fileName) {
    try {
      int nice = 0;
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        while (input.hasNextLine()){
           String str = input.nextLine();
           if (hasVowel(str) && doubleLet(str) && containsStr(str)){
             nice += 1;
           }
        }
        System.out.println(nice);
    }catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }

  public static boolean seenTwice(String str){
    int timesSeenTwo = 0;
    for (int i = 0; i < str.length() - 2; i++){
      for (int j = i + 2; j < str.length()-1; j++){
        if (str.substring(i, i + 2).equals(str.substring(j,j+2))){
          timesSeenTwo += 1;
        }
      }
    }
    return (timesSeenTwo >= 1);
  }
  public static boolean befAndAft(String str){
    for (int i = 0; i < str.length() - 2; i++){
      if (str.charAt(i) == str.charAt(i + 2)){
        return true;
      }
    }
    return false;
  }

  public static void part2(String fileName) {
    try {
      int nice = 0;
      File file = new File(fileName);
      Scanner input = new Scanner(file);
      while (input.hasNextLine()){
        String str = input.nextLine();
        if (seenTwice(str) && befAndAft(str)){
          nice += 1;
        }
      }
        System.out.println(nice);
    }catch (FileNotFoundException e) {
      System.out.println("File not found");
    }
  }


  public static void main(String[] args){
   if (Integer.parseInt(args[1])==1){
     part1(args[0]);
   }else if (Integer.parseInt(args[1])==2){
     part2(args[0]);
   }
 }
}
