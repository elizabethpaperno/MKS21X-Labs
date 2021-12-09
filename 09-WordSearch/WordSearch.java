/*Lab9: Word Search generator
*/
public class WordSearch{
    private char[][]data;

    /**Initialize the grid to the size specified
     *and fill all of the positions with '_'
     *@param rows is the starting height of the WordSearch
     *@param cols is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols){
      data = new char[rows][cols];
      this.clear();
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
    public boolean addWordHorizontal(String word,int row, int col){
      int strIndex = 0;
      if (data[row].length - col >= word.length()){
        for (int j = col; j < word.length() + col; j++){
          if (data[row][j]== '_' || data[row][j]== word.charAt(strIndex)){
            //System.out.println(data[row][j]);
            //System.out.println(word.charAt(strIndex));
            data[row][j] = word.charAt(strIndex);
            strIndex += 1;
          }else {
            return false;
          }
        }
        return true;
      }
      return false;
    }


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
    public boolean addWordVertical(String word,int row, int col){
      int strIndex = 0;
      if (data.length - row >= word.length()){
        for (int j = row; j < word.length() + row; j++){
          if (data[j][col]== '_' || data[j][col]== word.charAt(strIndex)){
            //System.out.println(j + ", " + col);
            data[j][col] = word.charAt(strIndex);
            strIndex += 1;
          } else {
            return false;
          }
        }
        return true;
      }
      return false;
    }
}
