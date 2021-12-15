import java.util.*;
import java.io.*;
import java.util.*; //random, scanner, arraylist
import java.io.*; //file, filenotfoundexception
public class WordSearch{
    private char[][]data;

    //the random seed used to produce this WordSearch
    private int seed;

    //a random Object to unify your random calls
    private Random randgen;

    //all words that were successfully added get moved into wordsAdded.
    private ArrayList<String>wordsAdded;

    private String fileName;

    /*New Constructors:  Both will read in the word text file, then run addAllWords().
     *Do not fill in random letters after.*/

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
     /*
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      this.clear();
    }
    */

    /*New Constructors:  Both will read in the word text file, then run addAllWords().
     *Do not fill in random letters after.*/
     public WordSearch(int rows, int cols, String fileName, int randSeed){
         //Use the random seed specified.
         seed = randSeed;
         randgen = new Random(seed);
         data = new char[rows][cols];
         this.fileName = fileName;
         this.clear();
         addAllWords();
     }

    public WordSearch(int rows, int cols, String fileName){
        //Choose a randSeed using the clock random
        data = new char[rows][cols];
        randgen = new Random();
        seed = randgen.nextInt();
        randgen = new Random(seed);
        this.fileName = fileName;
        this.clear();
        addAllWords();
    }


    private void addAllWords() {
      /*Attempt to add all of the words from the file of words list using the algorithm described above
       *Suggestion: read your file into an ArrayList of Strings. */
      //System.out.println("exec. addAllWords");
      try {
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        int rowInc;
        int colInc;
        int col;
        int row;
        wordsAdded = new ArrayList<String>();
        ArrayList<String> wordsToBeAdded = new ArrayList<String>();
        while (input.hasNextLine()){
           String str = input.nextLine().toUpperCase();
           if (str != ""){
             wordsToBeAdded.add(str);
             System.out.println(str);
             for (int tries = 0; tries < 100; tries++){
               rowInc = randgen.nextInt(3)-1;
               colInc = randgen.nextInt(3)-1;
               row = randgen.nextInt(data[0].length);
               col = randgen.nextInt(data.length);
               //System.out.println(rowInc + ", " + colInc);
               if (addWord(row, col, str, rowInc, colInc)){
                 wordsAdded.add(str);
                 wordsToBeAdded.remove(str);
                 break;
               }
           }
         }
        }
      }catch (FileNotFoundException e) {
        System.out.println("File not found");
      }
    }
    /**Set all values in the WordSearch to underscores'_'*/
    private void clear(){
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[i].length; j++){
          data[i][j]= '_';
        }
      }
    }

    /**Each row is a new line, there is a space between each letter
     *@return a String with each character separated by spaces, and rows
     *separated by newlines.
     */
    public String toString(){
      String str = "";
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[i].length; j++){
          str += data[i][j] + " ";
        }
      str += "\n";
      }
      str += "\n";
      str += "Words added: " + wordsAdded.toString();
      str += "\n";
      str += "Seed: " + seed;
      return str;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
    *The word is added in the direction rowIncrement,colIncrement
    *Words must have a corresponding letter to match any letters that it overlaps.
    *
    *@param word is any text to be added to the word grid.
    *@param row is the vertical locaiton of where you want the word to start.
    *@param col is the horizontal location of where you want the word to start.
    *@param rowInc is -1,0, or 1 and represents the displacement of each letter in the row direction
    *@param colInc is -1,0, or 1 and represents the displacement of each letter in the col direction
    *@return true when: the word is added successfully.
    *        false (and do not change the board at all) when any of the following happen:
    *        a) rowInc and colInc are both 0,
    *        b) the word doesn't fit,
    *        c) there are overlapping letters that do not match
    */

    public boolean helper(int row, int col, String word, int rowInc, int colInc, boolean readOnly){
      // checks if input is invalid
      if (rowInc == 0 && colInc == 0){
        //System.out.println("invalid increment");
        return false;
      }

      //check if word fits
      int xFit = row + (word.length()-1) * rowInc;
      int yFit = col + (word.length()-1) * colInc;

      if (!((xFit < data[row].length && xFit >= 0) && (yFit < data.length && yFit >= 0))){
        //System.out.println("doesn't fit");
        return false;
      }

      //checks for incorrect overlap
      int iTest = row;
      int jTest = col;
      for(int x = 0; x < word.length(); x++){
        if (!(data[iTest][jTest]== '_' || data[iTest][jTest] == word.charAt(x))){
          return false;
        }
        if (!readOnly){
          data[iTest][jTest] = word.charAt(x);
        }
        iTest += rowInc;
        jTest += colInc;
      }
      return true;
    }
    public boolean addWord(int row, int col, String word, int rowInc, int colInc){
      if (!(helper(row, col, word, rowInc, colInc, true))){
        return false;
      }
      return helper(row, col, word, rowInc, colInc, false);

    }

    private void fillInRandomLetters(){
      for (int i = 0; i < data.length; i++){
        for (int j = 0; j < data[i].length; j++){
          if (data[i][j]== '_'){
            data[i][j] = (char)('A'+ randgen.nextInt(26));
          }
        }
      }
    }

  public static void main(String[] args){
    if (args.length == 4){
       WordSearch search = new WordSearch(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2]);
       if (Integer.parseInt(args[3]) == 1){
         System.out.println(search);
       } else {
         search.fillInRandomLetters();
         System.out.println(search);
       }
    } else {
        WordSearch search = new WordSearch(Integer.parseInt(args[0]), Integer.parseInt(args[1]), args[2], Integer.parseInt(args[4]));
        //System.out.println(search);
        if (Integer.parseInt(args[3]) == 1){
          System.out.println(search);
        } else {
          search.fillInRandomLetters();
          System.out.println(search);
        }
    }
  }
}
