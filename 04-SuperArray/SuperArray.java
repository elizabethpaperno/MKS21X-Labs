public class SuperArray{
  private int size;
  private int maxCap;
  private String[] data;

  public SuperArray(){
    size = 0;
    maxCap = 10;
    data = new String[maxCap];
  }

  public SuperArray(int initialCapacity){
    if (initialCapacity < 0){
      throw new IllegalArgumentException ("IllegalArgumentException: " + initialCapacity + "is not a valid argument for SuperArray()");
    }
    size = 0;
    maxCap = initialCapacity;
    data = new String[maxCap];
  }

  public int size(){
    return size;
  }

  public boolean add(String str){
    this.resize();
    data[this.size()] = str;
    size += 1;
    return true;
  }

  public void add(int index,String value){
    if (index < 0 || index > this.size()){
      throw new IndexOutOfBoundsException("IndexOutOfBoundsException: Index "+ index + " is out of bounds");
    }
    this.resize();
    for (int i = this.size;i > index; i--){
      data[i]= data[i-1];
    }
    data[index] = value;
    size +=1;
  }

  public String remove(int index){
    if (index < 0 || index >= this.size()){
      throw new IndexOutOfBoundsException("IndexOutOfBoundsException: Index "+ index + " is out of bounds");
    }
    String valueRemove = data[index];
    for (int i = index;i < this.size() - 1; i++){
      data[i]= data[i+1];
    }
    size -= 1;
    return valueRemove;
  }

  public boolean remove(String target){
    int indexVal = this.indexOf(target);
    if (indexVal!= -1){
      this.remove(indexVal);
      size -= 1;
      return true;
    }
    return false;
  }


  public String get(int index){
    if (index < 0 || index >= this.size()){
      throw new IndexOutOfBoundsException("IndexOutOfBoundsException: Index "+ index + " is out of bounds");
    }
    return data[index];
  }

  public String set(int index, String element) {
    if (index < 0 || index >= this.size()){
      throw new IndexOutOfBoundsException("IndexOutOfBoundsException: Index "+ index + " is out of bounds");
    }
    String originalVal = data[index];
    data[index] = element;
    return originalVal;
  }

  private void resize(){
    if (this.size() == maxCap) {
      String[] dataNew = new String[maxCap * 2 + 1];
      for (int i = 0; i < this.size; i++){
        dataNew[i] = data[i];
      }
      this.data = dataNew;
      maxCap = maxCap * 2 + 1;
    }
  }

  public int indexOf(String target) {
    for (int i = 0; i < this.size; i++){
      if (data[i] == target){
        return i;
      }
    }
    return -1;
  }

  public int lastIndexOf(String target){
    for (int i = this.size - 1; i >= 0;i--){
      if (data[i] == target){
        return i;
      }
    }
    return -1;
  }


  public String toString(){
    String arrStr = "[";
    for (int i = 0; i < this.size(); i++){
      arrStr += data[i];
      if (i != this.size() - 1){
        arrStr += ", ";
      }
    }
    return arrStr + "]";
  }

  public String toStringDebug(){
    String arrStr = "[";
    for (int i = 0; i < data.length; i++){
      arrStr += data[i];
      if (i != data.length - 1){
        arrStr += ", ";
      }
    }
    return arrStr + "]";
  }
}
