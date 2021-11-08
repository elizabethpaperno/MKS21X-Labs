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
    size = 0;
    maxCap = initialCapacity;
    data = new String[maxCap];
  }

  public int size(){
    return size;
  }

  public boolean add(String str){
    this.resize();
    data[size] = str;
    size += 1;
    return true;
  }

  public void add(int index,String value){
    System.out.println(size);
    if (index > 0 || index <= this.size()){
      for (int i = this.size;i >= index - 1; i--){
        System.out.println(i);
        if(i==index){
          size += 1;
          this.resize();
          //System.out.println(size);
          data[index] = value;
          //i += 1;
        }
          data[index]= data[i-1];

        //System.out.println(data[i]);
        //System.out.println(data[i+1]);
      }
    }else{
      System.out.println("Index out of range in add (with index)");
    }
  }

  public String remove(int index){
    if (index > 0 || index <= this.size()){
      String valueRemove = data[index];
      for (int i = index +1;i < this.size() - 1; i++){
        data[index]= data[index+1];
      }
      size -= 1;
      return valueRemove;
    }
    return null;
  }

  public String get(int index){
    if (index > 0 || index < this.size()){
      return data[index];
    }
    System.out.println("Index out of bounds in get()");
    return null;
  }

  public String set(int index, String element) {
    if (index > 0 || index < this.size()){
      String originalVal = data[index];
      data[index] = element;
      return originalVal;
    }
    System.out.println("Index out of bounds in set()");
    return null;
  }

  private void resize(){
    if (this.size() == maxCap) {
      String[] dataNew = new String[maxCap * 2 + 1];
      for (int i = 0; i < this.size; i++){
        dataNew[i] = data[i];
      }
      this.data = dataNew;
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
