public class SuperArray{
  private int size;
  private int maxCap;
  private String[] supArr;

  public SuperArray(){
    size = 0;
    maxCap = 10;
    supArr = new String[maxCap];
  }

  public SuperArray(int initialCapacity){
    size = 0;
    maxCap = initialCapacity;
    supArr = new String[maxCap];
  }

  public int size(){
    return size;
  }

  public boolean add(String str){
    this.resize();
    supArr[size] = str;
    size += 1;
    return true;
  }

  public String get(int index){
    if (index > 0 || index < this.size()){
      return supArr[index];
    }
    System.out.println("Index out of bounds in get()");
    return null;
  }

  public String set(int index, String element) {
    if (index > 0 || index < this.size()){
      String originalVal = supArr[index];
      supArr[index] = element;
      return originalVal;
    }
    System.out.println("Index out of bounds in set()");
    return null;
  }

  private void resize(){
    if (this.size() == maxCap) {
      String[] supArrNew = new String[maxCap * 2 + 1];
      for (int i = 0; i < this.size; i++){
        supArrNew[i] = supArr[i];
      }
      this.supArr = supArrNew;
    }
  }

  public int indexOf(String target) {
    for (int i = 0; i < this.size; i++){
      if (supArr[i] == target){
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for (int i = this.size - 1; i >= 0;i--){
      if (supArr[i] == target){
        return i;
      }
    }
    return -1;
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
