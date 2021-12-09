public class Demo {
  public static void main(String[] args){
    WordSearch search1 = new WordSearch(3,5);
    System.out.println(search1);

    search1.addWordHorizontal("helloooo", 2, 3);
    System.out.println(search1);

    search1.addWordHorizontal("test", 0, 0);
    System.out.println(search1);
  }
}
