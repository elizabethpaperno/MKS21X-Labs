/*Lab9: Word Search generator
*/

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
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      this.clear();
    }

    /*New Constructors:  Both will read in the word text file, then run addAllWords().
     *Do not fill in random letters after.*/
     public WordSearch(int rows, int cols, String fileName, int randSeed){
         //Use the random seed specified.
         data = new char[rows][cols];
         seed = randSeed;
         randgen = new Random(seed);
         this.fileName = fileName;
         this.clear();
         addAllWords();
     }

    public WordSearch(int rows, int cols, String fileName){
        //Choose a randSeed using the clock random
        data = new char[rows][cols];
        randgen = new Random();
        seed = randgen.nextInt();
        this.fileName = fileName;
        this.clear();
        addAllWords();
    }


    private void addAllWords() {
      /*Attempt to add all of the words from the file of words list using the algorithm described above
       *Suggestion: read your file into an ArrayList of Strings. */
      try {
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        int rowInc;
        int colInc;
        int col;
        int row;
        wordsAdded = new ArrayList<String>(10);
        ArrayList<String> wordsToBeAdded = new ArrayList<String>(10);
        while (input.hasNextLine()){
           String str = input.nextLine();
           wordsToBeAdded.add(str);
           //System.out.println(wordsToBeAdded);
           for (int tries = 0; tries < 100; tries++){
             rowInc = randgen.nextInt(3)-1;
             colInc = randgen.nextInt(3)-1;
             row = randgen.nextInt(data[0].length);
             col = randgen.nextInt(data.length);
             //System.out.println(rowInc + ", " + colInc);
             if (addWord(row, col, str, rowInc, colInc)){
               wordsAdded.add(str);
               break;
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
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     * or there are overlapping letters that do not match, then false is returned
     * and the board is NOT modified.
     */

     /*
    public boolean addWordHorizontal(String word,int row, int col){
      int strIndex = 0;
      if (!(data[row].length - col >= word.length())){
        return false;
      }
      for (int j = col; j < word.length() + col; j++){
        if (!(data[row][j]== '_' || data[row][j]== word.charAt(strIndex))){
          return false;
        }
      }
      for (int j = col; j < word.length() + col; j++){
          data[row][j] = word.charAt(strIndex);
          strIndex += 1;
      }
      return true;
    }
    */



   /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top to bottom, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     *and the board is NOT modified.
     */

     /*
    public boolean addWordVertical(String word,int row, int col){
      int strIndex = 0;
      if (!(data.length - row >= word.length())){
        return false;
      }

      for (int j = col; j < word.length() + col; j++){
        if (!(data[row][j]== '_' || data[row][j]== word.charAt(strIndex))){
          return false;
        }
      }

      for (int j = row; j < word.length() + row; j++){
          data[j][col] = word.charAt(strIndex);
          strIndex += 1;
      }

      return true;
    }
    */

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from top left towards the bottom right, it must fit on the board,
     *and must have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
     /*
    public boolean addWordDiagonal(String word,int row, int col){
      int strIndex = 0;
      if (!(data.length - row >= word.length())){
        return false;
      }

      int iTest = row;
      int jTest = col;
      while(j < word.length() + row){
        if (!(data[j][i]== '_' || data[j][i]== word.charAt(strIndex))){
          return false;
        }
        iTest++;
        jTest++;
        strIndex++;
      }

      int i = col;
      int j = row;
      strIndex = 0;
      while(j < word.length() + row){
          data[j][i] = word.charAt(strIndex);
          strIndex += 1;
          i++;
          j++;
      }
      return true;
    }
    */

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
        System.out.println("invalid increment");
        return false;
      }

      //check if word fits
      int xFit = row + (word.length()-1) * rowInc;
      int yFit = col + (word.length()-1) * colInc;

      if (!((xFit < data[row].length && xFit >= 0) && (yFit < data.length && yFit >= 0))){
        System.out.println("doesn't fit");
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
      /*
      int i = row;
      int j = col;
      for(int x = 0; x < word.length(); x++){
        //System.out.println(j + ", " + col);
        data[i][j] = word.charAt(x);
        i += rowInc;
        j += colInc;
      }
      return true;
      */
      if (!(helper(row, col, word, rowInc, colInc, true))){
        return false;
      }
      return helper(row, col, word, rowInc, colInc, false);

    }

}
