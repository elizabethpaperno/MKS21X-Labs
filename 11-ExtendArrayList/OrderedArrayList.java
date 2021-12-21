public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  public OrderedArrayList(){
    super();
  }

  public OrderedArrayList(int startingCapacity){
    super(startingCapacity);
  }

  private int whereToPlace(T value){
    /*return the index that the value should be placed
    when inserting into the OrderedArrayList .*/

    //let it crash correctly on its own
    if (value == null){
      return 0;
    }
    for (int i=size() - 1; i >= 0; i--){
      if (value.compareTo(get(i)) >= 0){
        return i + 1;
      }
    }
    return 0;
  }

  public boolean add(T element){
    int pos = whereToPlace(element);
    //System.out.println(pos);
    super.add(pos, element);
    //System.out.println(this);
    return true;
  }

  public void add(int index, T element){
    this.add(element); //does the same thing as other add function, index is irreleavrent
  }

  public T set(int index, T element){
    T returnVal = this.get(index);
    this.remove(index);
    this.add(element);
    return returnVal;
  }
}
