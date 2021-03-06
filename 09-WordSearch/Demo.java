public class Demo {
  public static void main(String[] args){
    /*
    WordSearch search1 = new WordSearch(3,5);
    System.out.println(search1); //empty word search

    search1.addWordHorizontal("helloo", 2, 3);
    System.out.println(search1); //empty word search (doesn't fit)

    search1.addWordHorizontal("test", 0, 0);
    System.out.println(search1); //added to first row

    search1.addWordVertical("eel",0,1);
    System.out.println(search1); //added at letter "e" in first row

    search1.addWordVertical("eeli", 1, 1);
    System.out.println(search1); //does nothing (doesn't fit)

    search1.addWordVertical("tes", 0, 4);
    System.out.println(search1); //adds to last column

    search1.addWordVertical("tes", 0, 2);
    System.out.println(search1); //does nothing (intersecting let is not the same)
    */

    /*
    WordSearch board = new WordSearch(10,10);
    board.addWordDiagonal("hello",1,0); //should be added
    board.addWordDiagonal("hell",7,0); //doesn't fit
    board.addWordDiagonal("hel",7,0); //should be added
    board.addWordHorizontal("hey",7, 0);
    System.out.println(board);
    */
    WordSearch board2 = new WordSearch(10,10);
    board2.addWord(0,0, "hellooooo", 1, 0); //should be added
    board2.addWord(1,9, "hellooooo", -1, 0); //should be added
    board2.addWord(5,5, "hi", 0, -1); //should be added
    board2.addWord(5,7, "li", -1, -1);
    System.out.println(board2);
  }
}
