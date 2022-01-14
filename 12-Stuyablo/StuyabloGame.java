import java.util.*;
public class StuyabloGame{
  private static final int WIDTH = 80;
  private static final int HEIGHT = 30;
  private static final int BORDER_COLOR = Text.CYAN;
  private static final int BORDER_BACKGROUND = Text.CYAN + Text.BACKGROUND;

  public static void main(String[] args) {
    run();
    //drawScreen();
  }

  //Display a List of 1-4 adventurers on the rows row through row+3 (4 rows max)
  //Should include Name and HP on 2 separate lines. (more to be added later)
  public static void drawParty(ArrayList<Adventurer> party,int startRow){
    int num = party.size();
    int gap = (WIDTH - 2)/num;

    for (int i = 0; i < num; i++){
      Text.go(startRow, 2 + i * gap); //figure out
      System.out.print(party.get(i));
      Text.go(startRow + 1, 2 + i * gap); //figureout
      System.out.print(getCorrectColor("HP: " + party.get(i).getHP() + party.get(i).getmaxHP(), party.get(i).getHP(), party.get(i).getmaxHP()));
      Text.go(startRow + 2, 2 + i * gap);
      System.out.print(getCorrectColor(party.get(i).getSpecialName() + party.get(i).getSpecial() + party.get(i).getSpecialMax(), party.get(i).getSpecial(), party.get(i).getSpecialMax()));
    }
  }

  public static getCorrectColor(String s, int val, int max){
    double percent = (val * 1.0)/(max * 1.0) * 100;
    if (percent < 25){
      return Text.colorize(s, Text.RED);
    } else if (num > 75){
      return Text.colorize(s, Text.GREEN);
    } else {
      return Text.colorize(s, Text.WHITE);
    }
  }

  //Display a line of text starting at column 2 of the specified row.
  public static void drawText(String s,int startRow){
    Text.go(startRow, 2);
    System.out.print(s);
  }

  public static void drawScreen(){
    Text.clear();
    Text.go(1,1);
    System.out.print(Text.colorize(Game.createEmpty(WIDTH), BORDER_BACKGROUND));

    //border

    for (int i = 2; i < HEIGHT - 1; i++){
      Text.go(i,1);
      System.out.print(Text.colorize(Game.createEmpty(1), BORDER_BACKGROUND));
      Text.go(i,WIDTH);
      System.out.print(Text.colorize(Game.createEmpty(1), BORDER_BACKGROUND));
    }

    Text.go(HEIGHT,1);
    System.out.println(Text.colorize(Game.createEmpty(80), BORDER_BACKGROUND));
    Text.go(HEIGHT + 1,1);
  }


  public static void run(){
    //Clear and initialize
    Text.hideCursor();
    Text.clear();
    Text.go(1,1);


    //Things to attack:
    //Make an ArrayList of Adventurers and add 1 enemy to it.
    ArrayList<Adventurer> enemies = new ArrayList<Adventurer>();
    Adventurer enemy = new Warrior("Agnar", "GRRRR",50);
    enemies.add(enemy);

    //Adventurers you control:
    //Make an ArrayList of Adventurers and add 3 Adventurers to it.
    ArrayList<Adventurer> party = new ArrayList<Adventurer>();
    Adventurer wiz1 = new Wizard ("Harry");
    Adventurer wiz2 = new Wizard ("Ron");
    Adventurer wiz3 = new Wizard ("Hermonie");
    party.add(wiz1);
    party.add(wiz2);
    party.add(wiz3);

    //Main loop
    boolean partyTurn = false;
    int whichPlayer = 0;
    int turn = 0;


    String input = "";
    Scanner in = new Scanner(System.in);
    while(! (input.equalsIgnoreCase("q") || input.equalsIgnoreCase("quit"))){

      //Draw the window border
      Text.hideCursor();
      drawScreen();

      //display event based on last turn's input
      if(partyTurn){
        //Process user input:
        if(input.equals("attack")){
          party.get(whichPlayer).attack(enemies.get(0));
          //drawText((party.get(whichPlayer) + " attacks "+ enemies.get(0)),10);
        }
        else if(input.equals("special")){
          party.get(whichPlayer).attack(enemies.get(0));
          //drawText((party.get(whichPlayer) + " special attacks "+ enemies.get(0)),10);
        }
        whichPlayer++;



        if(whichPlayer < party.size()){
          drawText("Enter command for "+party.get(whichPlayer)+
                   ": attack/special/quit",HEIGHT/2);
        }else{
          drawText("press enter to see monster's turn",HEIGHT/2);
          partyTurn = false;
        }
      }else{
        //this block ignores user input!
        //display enemy attack except on turn 0.
        if(turn > 0){
          int choice = (int)(Math.random() * 2);
          int i = (int)(Math.random()*party.size());
          if (choice == 0){
            enemy.attack(party.get(i));
            //drawText((enemy + " attacks "+ party.get(i)),HEIGHT/2);
          }else if (choice == 1){
            enemy.specialAttack(party.get(i));
            //drawText((enemy + " special attacks "+ party.get(i)),HEIGHT/2);
          }
        }

        //after enemy goes, change back to player's turn.
        partyTurn=true;
        whichPlayer = 0;
        //display which player's turn is next and prompt for action.
        drawText("Enter command for "+party.get(whichPlayer)+": attack/special/quit",HEIGHT/2);

        //end the turn.
        turn++;

      }

      //display current state of all Adventurers
      drawParty(party,2);
      drawParty(enemies,25);

      //Draw the prompt
      Text.reset();
      Text.go(HEIGHT+1,1);
      Text.showCursor();
      System.out.print(">");
      //Read user input
      input = in.nextLine();
    }

    //After quit reset things:
    Text.reset();
    Text.showCursor();
    Text.go(32,1);
  }




}
