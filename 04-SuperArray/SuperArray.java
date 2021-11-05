public class SuperArray{
  private int size;
  private int maxCap;
  private String[] supArr;

  public SuperArray(){
    size = 0;
    maxCap = 10;
    supArr = new String[maxCap];
  }

  public int size(){
    return size;
  }

  public boolean add(String str){
    supArr[size] = str;
    size += 1;
    return True;
  }

  public String toString(){
    String arrStr = "[";
    for (int i = 0; i < this.size(); i++){
      arrStr += supArr[i];
      if (i != this.size() - 1){
        arrStr += ", ";
      }
    }
    return arrStr + "]";
  }

  public String toStringDebug(){
    String arrStr = "[";
    for (int i = 0; i < supArr.length; i++){
      arrStr += supArr[i];
      if (i != supArr.length - 1){
        arrStr += ", ";
      }
    }
    return arrStr + "]";
  }
}
