public class myText{
  public static String createEmpty(int len){
    String myStr = "";
    for (int i = 0; i < len - 1; i++){
      myStr += " ";
    }
    return myStr;
  }
}
