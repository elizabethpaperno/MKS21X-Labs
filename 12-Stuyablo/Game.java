import java.util.Scanner;

public class Game{
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

  public static int[] drawBoarderAndNums(int[] arr){
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
    String nums = "";
    Text.go(1,2);
    String num1 = getColorString(arr[0]);
    System.out.print(num1);
    Text.go(1,28);
    String num2 = getColorString(arr[1]);
    System.out.print(num2);
    Text.go(1,54);
    String num3 = getColorString(arr[2]);
    System.out.print(num3);
    Text.go(1,78);
    String num4 = getColorString(arr[3]);
    System.out.println(num4);

    Text.go(31,1);

    return arr;
  }
  public static void userInput(){
    int[] randArr = createRandArr();
    int[] prevArr = drawBoarderAndNums(randArr);

    System.out.print(">");
    Scanner input = new Scanner(System.in);
    String inStr = input.nextLine();

    while (!inStr.equals("q")&& !inStr.equals("quit")){
      if (inStr == ""){
        Text.clear();
        drawBoarderAndNums(prevArr);
      }else {
        Text.clear();
        Text.go(1,1);
        prevArr = drawBoarderAndNums(createRandArr());
      }
      System.out.print(">");
      inStr = input.nextLine();
    }
    input.close();
  }
  public static void main(String[] args){
    //setup
    Text.hideCursor();
    Text.clear();
    Text.showCursor();
    userInput();
    Text.reset();
  }
}
