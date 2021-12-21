public class MyInteger {
  public static int stringToInt(String s){
      //return the value of Integer.parseInt(s) but do it yourself!
      //Do not use any built in parse methods.
      int finalNum = 0;
      int digit = s.length()-1 * 10;
      for (int i = 0; i < s.length(); i++){
        finalNum += valueOfDigit(s.charAt(i)) * digit;
        digit /= 10;
      }
      return finalNum;
  }
  public static int valueOfDigit(char c){
    return (int(c))
  }
}
