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
    /*
    let it crash correctly on its own
    if (value == null){
      throw new IllegalArgumentException("Cannot add null object");
    }
    */
    for (int i=size(); i >= 0; i--){
      if (value.compareTo(get(i))>= 0){
        return i;
      }
    }
    return size() - 1;
  }

  public boolean add(T element){
    int pos = whereToPlace(element);
    return super.add(pos, element);
  }

  public void add(int index, T element){
    this.add(element); //does the same thing as other add function, index is irreleavrent
  }

  public T set(int index, T element){
    int pos = whereToPlace(element);
    this.remove(index);
    this.add(pos, element);
    return element;
  }
}
