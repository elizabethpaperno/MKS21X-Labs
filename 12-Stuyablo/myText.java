import java.util.Scanner;

public class myText{
  public static String createEmpty(int len){
    String myStr = "";
    for (int i = 0; i < len; i++){
      myStr += " ";
    }
    return myStr;
  }

  public static int[] createRandArr(){
    int[] arr = new int[4];
    for (int i = 0; i < arr.length; i++){
      arr[i] = (int) (Math.random()*100);
      //System.out.println(arr[i]);
    }
    return arr;
  }

  public static String getColorString(int num){
    //String str = String.format("%2s", num + "");
    if (num < 25){
      return Text.colorize("" + num, Text.RED);
    } else if (num > 75){
      return Text.colorize("" + num, Text.GREEN);
    } else {
      return Text.colorize("" + num, Text.WHITE);
    }
  }

  public static void drawBoarderAndNums(){
    Text.go(1,1);
    System.out.print(Text.colorize(createEmpty(80), Text.CYAN+Text.BACKGROUND));

    //border
    for (int i = 2; i <= 29; i++){
      Text.go(i,1);
      System.out.print(Text.colorize(createEmpty(1), Text.CYAN+Text.BACKGROUND));
      Text.go(i,80);
      System.out.print(Text.colorize(createEmpty(1), Text.CYAN+Text.BACKGROUND));
    }

    Text.go(30,1);
    System.out.println(Text.colorize(createEmpty(80), Text.CYAN+Text.BACKGROUND));
    Text.go(31,1);

    //top row
    int[] randArr = createRandArr();
    String nums = "";
    Text.go(1,2);
    String num1 = getColorString(randArr[0]);
    System.out.print(num1);
    Text.go(1,28);
    String num2 = getColorString(randArr[1]);
    System.out.print(num2);
    Text.go(1,54);
    String num3 = getColorString(randArr[2]);
    System.out.print(num3);
    Text.go(1,78);
    String num4 = getColorString(randArr[3]);
    System.out.println(num4);

    Text.go(31,1);
  }
  public static void userInput(){
    System.out.println(">");
    Scanner input = new Scanner(System.in);
    String inStr = input.nextLine();
    while (inStr != "q" || inStr != "quit"){
      if (inStr == ""){
        Text.clear();
      }else {
        drawBoarderAndNums();
      }
    }
    input.close();
  }
  public static void main(String[] args){
    //setup
    Text.hideCursor();
    Text.clear();
    drawBoarderAndNums();

  }
}
