public class myText{
  public static String createEmpty(int len){
    String myStr = "";
    for (int i = 0; i < len - 1; i++){
      myStr += " ";
    }
    return myStr;
  }
  public static void main(String[] args){
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);
    System.out.print(Text.colorize(createEmpty(80), Text.BLUE+Text.BACKGROUND));
    /*
    for (int i = 2; i <= 29; i++){
      Text.go(1,i);
      System.out.print(Text.colorize(createEmpty(1), Text.BLUE+Text.BACKGROUND));
      Text.go(81,i);
      System.out.print(Text.colorize(createEmpty(1), Text.BLUE+Text.BACKGROUND));
    }
    */
    Text.go(1,30);
    System.out.print(Text.colorize(createEmpty(80), Text.BLUE+Text.BACKGROUND));
    Text.go(1,31);
  }
}
