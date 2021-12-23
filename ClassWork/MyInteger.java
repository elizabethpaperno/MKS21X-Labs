public class MyInteger {
  public static int stringToInt(String s){
      //return the value of Integer.parseInt(s) but do it yourself!
      //Do not use any built in parse methods.
      int finalNum = 0;
      int digit = (int)Math.pow(10,s.length()-1);
      int startVal = 0;
      int multiplier = 1;
      if (s.charAt(0) == '-'){
        startVal = 1;
        multiplier = -1;
        digit = (int)Math.pow(10,s.length()-2);
      }
      for (int i = startVal; i < s.length(); i++){
        finalNum += valueOfDigit(s.charAt(i)) * digit;
        digit /= 10;
      }
      return finalNum * multiplier;
  }
  public static int valueOfDigit(char c){
    return ((int) (c - '0'));
  }
  public static void main(String[] args){
    System.out.println(stringToInt("123"));
    System.out.println(stringToInt("-123"));
  }
}
